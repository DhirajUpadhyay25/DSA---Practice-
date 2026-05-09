

public class FindDuplicates
{
    
  public static int findDuplicates(int Array[], int target){
     
      int count = 0;
      for (int i = 0; i < Array.length; i++) {
          if (target == Array[i]) {
              count++;
          }
          
      }
    
    return count;
  }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 1, 10,300, 1, 1 };
    
        int Target = 1;
        int result = findDuplicates(arr, Target);
       System.out.println(result);

    }
}


