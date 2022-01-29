package lombok;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Generates an all-args constructor.
An all-args constructor requires one argument for every field in the class.
*/
@AllArgsConstructor
/*
Generates a no-args constructor.
Will generate an error message if such a constructor cannot be written due to the existence of final fields.
 */
@NoArgsConstructor
/*
Generates implementations for the equals and hashCode methods inherited by all objects, based on relevant fields.
 */
@EqualsAndHashCode
/*
Generates an implementation for the toString method inherited by all objects, consisting of printing the values of relevant fields.
*/
@ToString
@Builder
@Slf4j //for adding logger. Note that we must also include a library that implements the Slf4j API.
public class Computer2 {
    /*
    @Setter - Put on any field to make lombok build a standard setter.
    @Getter - Put on any field to make lombok build a standard getter

    Both could be applied to the class!
     */
    @Setter @Getter
    String title;
    @Setter @Getter
    int ram;
    @Setter @Getter
    Boolean isGaming;

    @SneakyThrows //no need to add throws IOException
    public void save() {
        String output = "Computer2(" +
                "title=" + title +
                ", ram=" + ram +
                ", isGaming=" + isGaming +
                ')';
        System.out.println(output);
        Path fileName = Path.of("save.txt");
        Files.writeString(fileName, output);
    }

    public String read() throws IOException {
        Path fileName = Path.of("save.txt");
        String actual = Files.readString(fileName);
        System.out.println(actual);
        return actual;
    }

    public static void print() {
        log.info("It's a logger info");
        log.error("It's a logger error");
        log.warn("It's a logger warning");
    }
}
