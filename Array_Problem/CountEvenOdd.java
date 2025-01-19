public class CountEvenOdd 
{

    public static void countEvenOdd(int[] arr) 
    {
        int evenCount = 0;
        int oddCount = 0;

        for (int value : arr) 
        {
            if (value % 2 == 0) 
            {
                evenCount++; // Count even numbers
            }
            else 
            {
                oddCount++; // Count odd numbers
            }
        }

        // Print the result in the main method
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4,5,6,7,8,89,88,91}; // Example array
        countEvenOdd(arr); // Call method to count even and odd numbers
    }
}
