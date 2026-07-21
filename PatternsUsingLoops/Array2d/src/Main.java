import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int arr[][]={
                {1,2,3,4,5},
                {3,4,5,6,7,1},
                {1,2,3,2,5,2},
                {2,2,2,2,2,2,2,}
        };
        int sum=0;
        int rows=arr.length;
        System.out.println(rows +" rows");
        int colss=arr[0].length;
        System.out.println(colss + " cols");
        for(int row=0; row <= rows-1;row++){
            int cols= arr[row].length;
            for(int col=0; col<=cols-1; col++){
                System.out.print(arr[row][col]+ " ");
                int val=arr[row][col];
                sum=sum+val;
            }
            System.out.println();

        } System.out.println("sum is: "+sum);




        // int rows=arr.length;
        // System.out.println(rows +" rows");
        // int colss=arr[0].length;
        //       System.out.println(colss + " cols");
        // for(int row=0; row <= rows-1;row++){
        //   int cols= arr[row].length;
        //   for(int col=0; col<=cols-1; col++){
        //           System.out.print(arr[row][col]+ " ");
        //   }
        //         System.out.println();

        // }
    }
}