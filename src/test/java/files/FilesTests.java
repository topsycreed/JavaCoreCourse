package files;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FilesTests {

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
}
