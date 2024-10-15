public class ReverseNumber {

    public static long numFun(long n) {
        long revNum = 0;
        while (n > 0) {
            // first take out the lastDigit
            long ld = n % 10;
            // below condition will keep on adding the last digit to the revNumber
            revNum = (revNum * 10) + ld;
            // Now, extract the numbers
            n = n / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {

        // STATEMENT: Reverse a given number, if a number has trailing zeros, then
        // eliminate it. eg: Num=1230500, Output: 50321.
        long number = 875005000;
        long digit = numFun(number);
        System.out.println(" The Reversed Number is : " + digit);

    }

}
