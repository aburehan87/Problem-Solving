public class FindDuplicateNumber 
{
        // For a given array, find a number that appears more than once.

        // Traverse through the array and store the visited numbers in an arr
        // if the number is encountered twice, return the number, else continue to add the numbers in the new arr

        public static int isVisited(int[] arr)
        {
            boolean[] visited= new boolean[arr.length];
            for(int num: arr)
            {
                // here we are checking if the number has been 
                int count=1;
                if(visited[num])
                {   
                    return num;
                }
                // and here if it is not visited then we are adding that number to the boolean array, visited[num]=true means that number is now visited and has been added to the visited boolean array, true;
                else
                {
                    visited[num]=true;
                }

               
            }
            return -1;
        }

        public static void main(String[] args) 
        {
            int[] arr={1,2,3,4,5,6,7,8,8};
            System.out.println(isVisited(arr)+ " is present more than 1 times.");    
        }
}
