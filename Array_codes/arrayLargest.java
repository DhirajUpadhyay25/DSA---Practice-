public class arrayLargest {

    public static int largestValue(int Array[]) {
        
        int max = Array[0];
        int index = 0;
        for (int i = 0; i < Array.length; i++) {
            System.out.println("first check..." +i);

            if (Array[i] > max) {
                max = Array[i];
                index = i;
            }
        }
        System.out.println(" index  is "+index);
        return max;
    }


    public static void main(String[] args) {
        
             int arr[] = { 1000, 1100, 1300, 500, 1700, 100 };

             int result = largestValue(arr);

             
      System.out.println( "max element is " + result);
    }
    
}
