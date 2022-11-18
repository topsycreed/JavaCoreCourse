import natalieHomework.Animal;
import natalieHomework.Cow;
import natalieHomework.Horse;
import natalieHomework.Movable;
import natalieHomework.OptionNotAvailableException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    private static final String PREPARED_FILE_NAME = "test.txt";
    private static List<Cow> cows = new ArrayList<>();

    public static void main(String[] args) throws Exception { //method
        menu();
    }

    static void menu() throws Exception {
        do {
            System.out.println("""
                    1. Save a new object to file
                    2. Read object from file and print
                    3. Exit
                    4. Add item to collection
                    5. Remove item from collection
                    6. Read items from collection
                    7. Update field for item from collection""");
            String str = scanner.nextLine();
            switch (str) {
                case "1" -> writeToFile();
                case "2" -> readFromFile();
                case "3" -> {
                    System.out.print("\nBye!");
                    return;
                }
                case "4" -> addToCollection();
                case "5" -> removeFromCollection();
                case "6" -> readCollection();
                case "7" -> updateInCollection();
                default -> throw new OptionNotAvailableException();
            }
        }
        while (true);
    }

    private static void updateInCollection() {
        if (cows.isEmpty()) {
            System.out.println("Cannot update any cow, since there are no cows");
            return;
        }
        System.out.println("Please enter cow name for updating");
        String cowName = scanner.nextLine();
        System.out.println("Please enter cow age for updating");
        String age = scanner.nextLine();
        Cow cowForUpdate = new Cow(cowName, 1, cowName, true);
        for (Cow cow : cows) {
            if (cow.equals(cowForUpdate)) {
                System.out.println("We found cow for update and updated :)");
                cow.age = Integer.parseInt(age);
                return;
            }
        }
        System.out.println("Sorry we didn't found that cow");
    }

    private static void removeFromCollection() {
        if (cows.isEmpty()) {
            System.out.println("Cannot delete any cow, since there are no cows");
            return;
        }
        System.out.println("Please enter cow name for deletion");
        String str = scanner.nextLine();
        Cow cowForDelete = new Cow(str, 1, str, true);
        for (Cow cow : cows) {
            if (cow.equals(cowForDelete)) {
                System.out.println("We found cow for deletion and deleted :(");
                cows.remove(cowForDelete);
                return;
            }
        }
        System.out.println("Hopefully we didn't found that cow");
    }

    private static void readCollection() {
        if (cows.isEmpty()) {
            System.out.println("There is no cows, please buy a new one");
        }
        for (Cow cow : cows) {
            System.out.println(cow);
        }
    }

    private static void addToCollection() {
        System.out.println("Please enter cow name");
        String str = scanner.nextLine();
        Cow cow = new Cow(str, 1, str, true);
        cows.add(cow);
    }

    private static void readFromFile() throws FileNotFoundException {
        File file = new File(PREPARED_FILE_NAME);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    private static void writeToFile() {
        File file = new File(PREPARED_FILE_NAME);
        if (!file.exists()) {
            try {
                boolean createdNew = file.createNewFile();
                if (createdNew) {
                    System.out.println("The file was successfully created.");
                } else {
                    System.out.println("The file already exists.");
                }
            } catch (IOException e) {
                System.out.println("Cannot create the file: " + file.getPath());
            }
        }

        try (FileWriter writer = new FileWriter(file, true)) {
            System.out.println("Please enter cow name");
            String str = scanner.nextLine();
            Cow cow = new Cow(str, 1, str, true);
//            writer.append("\n" + cow);
            writer.write("\n" + cow);
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }
}
