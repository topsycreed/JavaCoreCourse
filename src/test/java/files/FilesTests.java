package files;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.*;
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
    void checkFileDirectory() {
        File baseFile = new File(System.getProperty("user.dir"));
        File[] files = baseFile.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    @Test
    void checkFileSearch() {
        String fileToSearch = "test.txt";
        File baseFile = new File(System.getProperty("user.dir"));
        File[] files = baseFile.listFiles();
        for (File file : files) {
            if (file.getName().equals(fileToSearch)) {
                System.out.println("File found!");
                return;
            }
        }
        System.out.println("File not found!");
    }

    @Test
    void ReadAllTextFromFileAsSingleStringTest() throws IOException {
        String data = new String(Files.readAllBytes(Paths.get(PREPARED_FILE_NAME)));
        System.out.println(data);
    }

    @Test
    void createNewFile() {
        File file = new File("file.txt");
        try {
            boolean createdNew = file.createNewFile();
            if (createdNew) {
                System.out.println("The file was successfully created.");
            } else {
                System.out.println("The file already exists.");
                file.delete();
            }
        } catch (IOException e) {
            System.out.println("Cannot create the file: " + file.getPath());
        }
    }

    @Test
    void creatingDirectories() {
        File file = new File("/files/test");

        boolean createdNewDirectory = file.mkdir(); //creates the directory and returns true only if it was created
        if (createdNewDirectory) {
            System.out.println("It was successfully created.");
        } else {
            System.out.println("It was not created.");
            if (file.isDirectory()) {
                System.out.println("But it already exists: " + file.getAbsolutePath());
            }
        }
    }

    @Test
    void creatingDirectories2() {
        File file = new File("/files/test");

        boolean createdNewDirectory = file.mkdirs(); //creates the directory (including all needed subdirectories) and returns true only if it was created
        if (createdNewDirectory) {
            System.out.println("It was successfully created.");
        } else {
            System.out.println("It was not created.");
            if (file.isDirectory()) {
                System.out.println("But it already exists: " + file.getAbsolutePath());
            }
        }
    }

    @Test
    void deleteDir() {
        File dir = new File("/files/test");
        File dir2 = new File("/files");

        if (dir.delete()) {
            System.out.println("Dir was successfully removed.");
        } else {
            System.out.println("Dir was not removed.");
        }

        if (dir2.delete()) {
            System.out.println("Dir2 was successfully removed.");
        } else {
            System.out.println("Dir2 was not removed.");
        }
    }

    @Test
    void deleteDirWithAllNestedFiles() throws IOException {
        creatingDirectories2();
        File dir = new File("/files/test");
        File file = new File(dir.getPath() + "/delete.txt");
        if (!file.exists()) {
            Files.createFile(file.toPath());
            FileWriter writer = new FileWriter(file);
            writer.write("I will be deleted soon :( ");
            writer.close();
        }
        deleteDirRecursively(dir);
    }

    private void deleteDirRecursively(File dir) {
        if (dir.exists()) {
            File[] children = dir.listFiles();
            for (File child : children) {
                if (child.isDirectory()) {
                    deleteDirRecursively(child);
                } else {
                    child.delete();
                    System.out.println("Child was deleted! With name = " + child.getName());
                }
            }
            dir.delete();
            System.out.println("Dir and all nested files deleted!");
        } else {
            System.out.println("There are no such dir");
        }
    }

    @Test
    void renamingTest() throws IOException {
        File dir = new File("/files");
        dir.mkdir();
        File file = new File("/files/rename.txt");
        file.createNewFile();
        file.renameTo(new File("/files/rename2.txt"));
        System.out.println(file.getName());
        //file.delete();//will not delete it

        //You should get a new instance to delete it
        File file2 = new File("/files/rename2.txt");
        file2.delete();
    }

    @Test
    void movingTest() throws IOException {
        File dir = new File("/files");
        dir.mkdir();
        File dir2 = new File("/files2");
        dir2.mkdir();
        File file = new File("/files/rename.txt");
        file.createNewFile();
        file.renameTo(new File("/files2/rename2.txt"));
        System.out.println(file.getName());
        //file.delete();//will not delete it

        //You should get a new instance to delete it
        File file2 = new File("/files2/rename2.txt");
//        file2.delete();
    }

    @Test
    void WriterWithTry() throws IOException {
        File file = new File(PREPARED_FILE_NAME);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("\nHello, World");//overrides the content
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }

        ReadAllTextFromFileAsSingleStringTest();
    }

    @Test
    void PrintWriterTest() throws IOException {
        File file = new File(PREPARED_FILE_NAME);

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print("Hello"); // prints a string
            printWriter.println("Java"); // prints a string and then terminates the line
            printWriter.println(123); // prints a number
            printWriter.printf("You have %d %s", 400, "gold coins"); // prints a formatted string
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }

        ReadAllTextFromFileAsSingleStringTest();
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
