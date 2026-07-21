public class FindMissingNumber {

    public static int MissingNumber(int Array[], int N) {
                int expectedSum = N * (N + 1) / 2;

                int actualSum = 0;
                for (int i = 0; i < Array.length; i++) {
                    actualSum = actualSum + Array[i];
                    
                }       
                return expectedSum - actualSum;
 
    }
    public static void main(String[] args) {
            int[] arr = {1, 2, 3,4,5,6,7,9}; // N total numbers 8+1=9
            int N = arr.length+1;

            System.out.println("Missing Number: " + MissingNumber(arr, N));
             }
}
