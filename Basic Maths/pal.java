public class pal 
{
    public static boolean isPalindrom(int num )
    {
        int dup=num;
        int revNum=0;
        while(num!=0)
        {
            int last_digit=num%10;
            revNum=(revNum * 10)+ last_digit;
            num=num/10;
        }
        return dup==revNum;
    }
    public static void main(String[] args) {
        int number=121;
        System.out.println(isPalindrom(number));
    }    
}


