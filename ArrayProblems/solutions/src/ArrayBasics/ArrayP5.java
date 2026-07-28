package ArrayBasics;

public class ArrayP5
{
    //Q.5 sum of positive and Negative numbers in an Array.
    public   static int[] positiveAndNegativeSums(int[] arr) {
        int len=arr.length;
        int positiveSum=0;
        int negativeSum=0;
        for(int i=0;i<len;i++){
            if(arr[i]>=0){
                positiveSum+=arr[i];
            }
            else if(arr[i]<0){
                negativeSum+=arr[i];
            }
        }
        int[] resultSet={positiveSum,negativeSum};
        return resultSet;
    }
    //Q.6 Count the number of zeros and Ones in an Array.
    public static void countZerosAndOnes(int[] arr){
        int n=arr.length;
        int zeros=0;
        int ones=0;
        int others=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
            else if(arr[i]==1){
                ones++;
            }
            else{
                others++;
                System.out.println( arr[i] +" number is neither zero or one");
            }
        }
        System.out.println("Number of Ones are: "+ones);
        System.out.println("Number of Zeros are: "+zeros);
        System.out.println("Number of others are: "+others);

    }
    //Q.6 Find first unsorted element in an Array.
     static int firstUnsortedElement(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]>=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
     }

    public static void main(String[] args) {

        //Q.6 Find first unsorted element in an Array.
         int[] arr={1,2,3,5,4,6,7,9,8};
        int result= firstUnsortedElement(arr);
        System.out.println(result+" Is first Unsorted element in this Array.");

        //Q.6 Count the number of zeros and Ones in an Array.
//        int[] arr={1,0,1,1,0,1,0,1,4,5,6,8,0,2,1,0,0,0,0};
//        countZerosAndOnes(arr);


        //Q.5 sum of positive and Negative numbers in an Array.
//         int[] arr={-1,2,-3,4,5,-6,7,-8,9,0};
//         int[] re= positiveAndNegativeSums(arr);
//         System.out.println("Positive element sum is: "+re[0]);
//         System.out.println("Negative element sum is:"+re[1]);
    }

}
