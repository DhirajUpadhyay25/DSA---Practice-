public class ReverseArray {

    public static void ReverseArrays(int Array[]) {
      
        for (int i = 0; i < Array.length / 2; i++) { //or   for (int i = Array.length-1; i>=0; i--) sout(Array[i])
            int temp = Array[i];
            Array[i] = Array[Array.length - i - 1];
            Array[Array.length - i - 1] = temp;
            
              
          }

    }

    public static void main(String[] args) {
        int arr[] = { 1000, 1100, 1300, 500,300, 5000, 1700 };
        //logic 

        ReverseArrays(arr);
        for (int value : arr) {
                System.out.print(value +"\t");

            }

    }
}
