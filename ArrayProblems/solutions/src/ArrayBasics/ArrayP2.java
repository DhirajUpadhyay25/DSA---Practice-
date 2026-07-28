package ArrayBasics;

import java.util.Arrays;

public class ArrayP2 {

    public static int[] multiplyArraysBy10(int[] arr) {
        int len=arr.length;
       int[] resultArray= new int[len];
        for(int i=0;i<len;i++){
            resultArray[i]=arr[i]*10;
        }
        return resultArray;
    }
    public static int maxElement(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static boolean LinearSearch (int[] arr, int target) {
        int n= arr.length;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                index=i;
                System.out.println("At index:"+index +" target:"+target+" found");
              return true;
            }
        }
        return false;
    }

    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] newArray= multiplyArraysBy10(arr);
        for(int n:newArray){
       System.out.print(n+ " ");
       }
        System.out.println();
        System.out.println("Max element is : "+maxElement(newArray));
        System.out.println("Linear Search : "+LinearSearch(newArray,550));
    }
}
