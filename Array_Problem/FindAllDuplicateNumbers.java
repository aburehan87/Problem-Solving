import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumbers {
    

    public static List<Integer> allDuplicates(int[] arr) 
    {
        // here we have to find all the duplicate numbers in an array
    // i/p={1,1,2,2,3,4,5,6,7}, o/p={1,2}, return the numbers that occur more than
    // once.

    // STEPS:
    // we first create a new array in which we will store all the elements of the
    // existing array
    // then we will implement an ArrayList
    // we will check if the number occuring in the new arr is > 1, if yes then we
    // will add those numbers inside the ArrayList and then return it.
    // TC: O(n) and SC: O(1)
        int[] hash = new int[10001];
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            hash[num]++;

            if (hash[num] > 1) {
                list.add(num);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7 };
        System.out.println(allDuplicates(arr));
    }
}
