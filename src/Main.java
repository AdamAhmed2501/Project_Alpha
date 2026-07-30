import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World.");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        Scanner randomLettersInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter some random letters:");

        String randomLetters = randomLettersInput.nextLine();  // Read user input
        System.out.println("Your random letters, as you've input them, are: " + randomLetters);  // Output user input


    }
}