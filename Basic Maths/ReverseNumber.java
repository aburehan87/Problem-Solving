public class ReverseNumber {

    // Method to reverse the given number
    public static int reverse(int n) {
        int revNum = 0;

        while (n != 0) {
            int ld = n % 10; // Take out the last digit

            // Check for overflow before multiplying and adding the next digit
            if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) {
                return 0; // Overflow detected, return 0
            }

            revNum = (revNum * 10) + ld; // Add the last digit to the reversed number
            n = n / 10; // Remove the last digit
        }

        return revNum;
    }

    public static void main(String[] args) {
        // Example: Reverse a given number, handling negative numbers
        int number = 104000 ;
        System.out.println(reverse(number));
    }
}
