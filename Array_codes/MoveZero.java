public class MoveZero {

   public static void moveZeroToLast(int Array[]) {

       int index = 0;

       // Move non-zero elements forward
       for (int i = 0; i < Array.length; i++) {
           if (Array[i] != 0) {
               Array[index] = Array[i];
               index++;
           }
       }

       // Fill remaining with zero
       while (index < Array.length) {
           Array[index] = 0;
           index++;
       }
   }

   public static void main(String[] args) {
      int arr[] = {0, 10, 0, 8, 0};

      moveZeroToLast(arr);

      for (int var : arr) {
         System.out.print(var + "\t ");
      }
   }
}