import java.util.*;

public class DigitCount
{

    
    public static int countDigit(int n)
    {   
        int count=0;
        while(n>0)
        {
            count=count+1;
            n=n/10;
        }

        return count;
    }
    public static void main(String[] args)
    {
        int number=12345;
        int digitCount=countDigit(number);
        System.out.println(" Number of Digits are : " + digitCount);
    }
}