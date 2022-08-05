import java.util.Scanner;

public class Main {

    // keywords public, static, class, void
    //main - mame or identifier
    //all inside // - comment
    /*
    multiline comments
     */
    public static void main(String[] args) { //method
        //block
        System.out.println("Hello, QA!"); //statement

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, what's your name?");
        String word1 = scanner.next(); //single word or value
        System.out.println("Nice to meet you " + word1);
        scanner.nextLine(); // to ask user input additionally
        System.out.println("What's your full name?");
        String line1 = scanner.nextLine(); //line
        System.out.println(line1 + " Is it correct?");

        System.out.println("Guess how many years I'm as QA?");

        int value = Integer.parseInt(scanner.next());
        while(value != 11) {
            if (Math.abs(11 - value) < 2) {
                System.out.println("Close, but not correct, try one more time");
            } else {
                System.out.println("It's not even close! Try one more time");
            }
            value = Integer.parseInt(scanner.next());
        }
        System.out.println("Correct!");
    }
}
