public class armstrongNumber {
    public static boolean arms(int number) {
        int sum = 0;
        int dup = number;
        int numDigits = String.valueOf(number).length(); // Get the number of digits

        while (number != 0) {
            // extract the last digit
            int ld = number % 10;
            // add the last digit raised to the power of numDigits to the sum
            sum = sum + (int) Math.pow(ld, numDigits);
            // remove the last digit permanently
            number = number / 10;
        }
        return sum == dup;
    }

    public static void main(String[] args) {
        int number = 1634;
        System.out.println(arms(number)); // Should print true for 1634
    }
}
