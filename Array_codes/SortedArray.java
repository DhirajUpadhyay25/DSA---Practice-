
import java.util.*;

public class SortedArray {

    public static boolean  sortedCheck(int Array[]) {

        boolean isSorted = true;

        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] > Array[i+1]) {
                isSorted = false;
        }
        
    }
        return isSorted;
 }

 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.println("Enter The size Array");
         int n = scanner.nextInt();
         int arr[] = new int[n];
         System.out.println("enter element here ... ");
         for (int i = 0; i < arr.length; i++) {
             arr[i] = scanner.nextInt();

         }
         System.out.println(sortedCheck(arr));
     }
 }
}
