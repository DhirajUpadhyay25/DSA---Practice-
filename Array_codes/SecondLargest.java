public class SecondLargest
{
    public static void SecondLargestElemnet(int Array[]) {

        int smallest=Array[0];
        int largest = Array[0];
        int secondlargest = Array[1];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > largest) {
                secondlargest = largest;
                largest = Array[i];
            } else if (Array[i] > secondlargest && Array[i] != largest) {
                secondlargest = Array[i];
            }
            else if (Array[i] < smallest) {
             smallest = Array[i];

                
            }

        }
        System.out.println("Largest elemnet is:" + largest);
        System.out.println("And Second Largest elemnet is:" + secondlargest);
              System.out.println("And Smallest  elemnet is:"+smallest);


    }
    public static void main(String[] args) {
    int arr[] = {10, 5, 8 };
     SecondLargestElemnet(arr);
    }
}
