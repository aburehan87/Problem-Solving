
import java.util.*;
public class Backtrack_Numbers 
{    
    // print the numbers from 1 to N using backtrack
    public static void printNumbers(int i, int N)
    {
        // Base condition
        if(i<=0)
        {
            return;
        }
          // and here we then make the recursive call of the function
          printNumbers(i-1, N);
        // apart from other codes, here we first print the number
        System.out.print(" " + i);
      
      

    }    
    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        System.out.println(" Enter N : ");
        int N=sf.nextInt();
        printNumbers(N,N);
    }
}
