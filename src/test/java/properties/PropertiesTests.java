package properties;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PropertiesTests {

    private static final String PROPERTIES_FILE = "/application.properties";

    @BeforeAll
    static void init() {
        String key = "testSystemProperty";
        String value = "testSystemPropertyValue";
        System.setProperty(key, value);
    }

    @Test
    void loadSystemPropertyTest() {
        assertEquals(System.getProperty("testSystemProperty"), "testSystemPropertyValue");
    }

    @Test
    void loadPropertyTest() {
        Properties properties = getPropertiesFromFile();
        assertEquals(properties.getProperty("testProperty"), "testPropertyValue");
    }

    @Test
    void loadNonExistingPropertyTest() {
        Properties properties = getPropertiesFromFile();
        assertNull(properties.getProperty("nonExistingProperty"));
    }

    @Test
    void loadVMSystemPropertyTest() {
        assertEquals(System.getProperty("vmProperty"), "vmPropertyValue");
    }

    @SneakyThrows(IOException.class)
    private static Properties getPropertiesFromFile() {
        Properties properties = new Properties();
        try (
                InputStream resourceStream = PropertiesTests.class.getResourceAsStream(PROPERTIES_FILE);
                InputStreamReader inputStream = new InputStreamReader(resourceStream, StandardCharsets.UTF_8)
        ) {
            properties.load(inputStream);
        }
        return properties;
    }
}
