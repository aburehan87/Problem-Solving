import java.util.*;

public class Palindrome {
    public static void main(String[] args)
     {

        Scanner sf = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sf.nextInt();
        // store the number inside a duplicate/temp variable
        int dup = number;
        // This will store the numbers in reverse order
        int revNumber = 0;

        while (number > 0)
         {
            // This will take out the last digit
            int ld = number % 10;
            // This will store the seq of numbers
            revNumber = (revNumber * 10) + ld;

            number = number / 10;
        }

        if (revNumber == dup) 
        {
            System.out.println(" Given Number is a Palindrome ");
        } else 
        {
            System.out.println("Given Number is not a Palindrome ");
        }

    }
}