import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome_using_function {

    public static boolean isPalindrome(int number) {
        int revNum = 0;
        int ld;
        int dup = number;

        while (number > 0) {
            // Take the last digit
            ld = number % 10;
            // Add last digit to reversed number
            revNum = (revNum * 10) + ld;
            // Remove last digit
            number = number / 10;
        }
        // Check if the reversed number is the same as the original
        return revNum == dup;
    }

    public static void main(String[] args) {
        Scanner sf = new Scanner(System.in);
        // we need to implement the try catch, if the user enters a number that exceeds
        // the int the to catch that exception and print a message to the user

        try {
            System.out.print("Enter the number: ");
            int number = sf.nextInt();

            // Call the function and print the result
            if (isPalindrome(number)) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        sf.close();
    }
}
