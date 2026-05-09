public class RemoveDuplicates {


    public static int RemovDuplicates(int[] Array) {

        if (Array.length == 0)
            return 0;
             
        int i = 0;
        for (int j = 1; j < Array.length; j++) {
            if (Array[j] != Array[i]) {
                i++;
                Array[i] = Array[j];

            }
        }
           
        return i+1;
    }
     public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3,4,4,5,6,7,8,9};

        int newLength = RemovDuplicates(arr);

        System.out.println("Length: " + newLength);
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    
}
