public class FirstUniqueCharacter 
{

    public static int frequency(String str)
    {
        if(str.length()==0||str==null)
        {
            return -1;
        }

        // first assign a char array of 26 size
        char[] freq=new char[26];
        
        // First iteration to count the freq/occurence of tha alphabets
        // this iteration will give us the number of times a char is appearing, which we will use in next loop to check the first occurence of the character.
        for(char ch: str.toCharArray())
        {
            freq[ch- 'a']++;
        }

        // Second iteration to check the first occurence of the number
        for(int i=0;i<str.length();i++)
        {
            if(freq[str.charAt(i)- 'a']==1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        String str="rererehan";
        System.out.println(frequency(str));    
    }
    
}
