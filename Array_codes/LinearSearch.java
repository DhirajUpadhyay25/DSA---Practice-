
import java.util.Scanner;
public class LinearSearch

{
    public static int LinearSearchs(int Array[], int Target)
    {
        int index = -1;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == Target) {
                index = i;
            }

        }
        return index;
    }
  public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Enter The size of Array here  ");
          int size = scanner.nextInt();
          int arr[] = new int[size];
          System.out.println("Enter elements:");
          for (int i = 0; i < arr.length; i++) {
              arr[i] = scanner.nextInt();
          }
          System.out.println("Enter target Element");
          int target = scanner.nextInt();

          int foundAt = LinearSearchs(arr, target);
          if (foundAt > -1) {
              System.out.println("Element found at Index:" + foundAt);

          } else {
            System.out.print("Element Not Found in this Array:");
          }
      }
  }
}
