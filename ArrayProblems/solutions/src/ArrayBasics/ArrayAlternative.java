package ArrayBasics;

public class ArrayAlternative
{
    static int[] alternative(int[] arr)
    {
        int n=arr.length;
        int[] res=new int[n];
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n-1;j++){
               res[j]=arr[i]+arr[j];

           }
       }
       return res;
    }
    public static void main(String[] args)
    {

    }
}
