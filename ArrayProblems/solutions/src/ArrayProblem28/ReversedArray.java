package ArrayProblem28;

public class ReversedArray
{
    static  void reverse(int[] arr)
    {
        int n=arr.length;
        int i=0;
        int j=n-1;
       while(i<=j){
           int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
       }
        for(int a:arr){
            System.out.print(a+" ");
        }

    }

    static void main(String[] args) {
        int[] arr={1,20,3,40,5};
        System.out.print("Reversed Array is: ");
        reverse(arr);

    }
}
