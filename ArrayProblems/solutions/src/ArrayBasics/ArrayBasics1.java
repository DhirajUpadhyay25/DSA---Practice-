package ArrayBasics;

public class ArrayBasics1 {

//    Array Question 1 Find Avg sum of Array ?
    public static Float AvgSum(int[] arr){
        int length=arr.length;
        Float sum=0f;
//        for(int i=0; i<length; i++){
//            sum = sum+arr[i];
//        }
        for (int eachArray : arr){
            sum =sum+eachArray;
        }
        Float avg=sum/length;
        return avg;
    }



    static void main(String[] args) {
        int[] arr={1,20,3,40,5};
        System.out.println(AvgSum(arr));
    }
}
