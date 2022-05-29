package files;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FilesTests {

    private final String PREPARED_FILE_NAME = "test.txt";

    @Test
    void FileCheckOSSeparatorTest() {
        String separator = File.separator;
        if ("\\".equals(separator)) {
            System.out.println("You are using Windows, your separator is: " + separator);
        } else {
            System.out.println("You are using Linux, your separator is: " + separator);
        }
    }

    @Test
    void FileObject() {
        //File fileOnUnix = new File("/home/username/Documents"); // a directory on a UNIX-like system
        File fileOnWin = new File("D:\\Materials\\java-materials.pdf"); // a file on Windows
    }

    @Test
    void FileMethods() {
        File file = new File("D:\\Materials\\java-materials.pdf");
        System.out.println("File name: " + file.getName()); //returns the name of this file or directory (just the last name of the path)
        System.out.println("File path: " + file.getPath()); //returns the string path to this file or directory;
        System.out.println("Is file: " + file.isFile()); //returns true if it is a file that exists (not a directory), otherwise, false
        System.out.println("Exists: " + file.exists()); //returns true if this file or directory actually exists in your filesystem, otherwise, false
        System.out.println("Is directory: " + file.isDirectory()); //returns true if it is a directory and exists, otherwise, false
        System.out.println("Parent path: " + file.getParent()); //returns the string path to the parent directory that contains this file or directory
    }

    @Test
    void FilePath() {
        File file = new File("D:\\Materials\\java-materials.pdf"); // a file on Windows
        System.out.println(file.getPath());

        File file2 = new File("images/picture.jpg"); // a file on Windows
        System.out.println(file2.getPath());
    }

    @Test
    void ScannerTest() throws FileNotFoundException {
        File file = new File(PREPARED_FILE_NAME);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    @Test
    void ScannerTryWithResourcesTest() {
        File file = new File(PREPARED_FILE_NAME);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                System.out.println(scanner.nextLine() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file.getPath());
        }
    }

    @Test
    void ReadAllTextFromFileAsSingleStringTest() throws IOException {
        String data = new String(Files.readAllBytes(Paths.get(PREPARED_FILE_NAME)));
        System.out.println(data);
    }

    @BeforeAll
    private void start() throws IOException {
        File file = new File(PREPARED_FILE_NAME);
        if (!file.exists()) {
            Files.createFile(file.toPath());
            FileWriter writer = new FileWriter(file, true);
            writer.write("Hello, Java!\n");
            writer.write("This is simple text");
            writer.write("123");
            writer.close();
        }
    }

    @AfterAll
    private void end() {
        File file = new File(PREPARED_FILE_NAME);
        file.delete();
    }
}
