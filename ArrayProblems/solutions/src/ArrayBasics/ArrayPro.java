package ArrayBasics;

import java.util.Arrays;

public class ArrayPro
{
    static int[] intersectionOfTwoArrays(int[] arr1, int[] arr2)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int a1=arr1.length;
        int a2=arr2.length;
        int index=0;
        for(int i=0;i<a1;i++)
        {
            for(int j=0;j<a2;j++){
                if(arr1[i]==arr2[j]){
                    index++;
                }
            }
        }
        int[] common=new int[index];
        int count=0;
        for(int i=0;i<a1;i++)
        {
            for(int j=0;j<a2;j++){
                if(arr1[i]==arr2[j]){
                    common[count++]=arr1[i];
                }
            }
        }
        return common;

    }


    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,6,7,8};
        int[] arr2={1,3,4,5,7,9,10,13};
        int[] intersection=intersectionOfTwoArrays(arr1,arr2);
        System.out.println("intersection of two arrays is ");
        for(int n:intersection){
            System.out.print(n+ " ");
        }
    }
}
