public class Basicsmath
{
     static void printDigits(int num){
         int count = 0;
         int sum = 0;
         while(num != 0){
             int digit = num % 10;
             count++;
             sum += digit;
             System.out.print(digit +" ");

             num = num / 10;
         }
         System.out.println ("sum is: "+sum);

         System.out.println ("count is: "+count);
     }
     // reverse number
    public static int reverseNum(int num)
    {
        int nums = num;
        int reversed = 0;
        while (nums != 0) {
            int digit = nums % 10;
            reversed = reversed * 10 + digit;
            nums = nums / 10;
        }
        return reversed;
    }

      static void checkPalindrome(int num)
      {
          int reversed = reverseNum(num);
          if(reversed == num)
          {
              System.out.println("Palindrome");
          } else{
              System.out.println("Not Palindrome");
          }
      }
      // check prime number
    static boolean checkprime(int num){

         for(int i=2;i<=num-1;i++){
             if(num%i==0){
                 System.out.println("Not prime number");
                 return false;
             }
         }
        System.out.println("Prime number");
         return true;
    }


    public static void main(String[] args) {
        int num = 22222;
        System.out.println(checkprime(num));
//        checkPalindrome(num);
//        System.out.println(reverseNum(num));

//        printDigits(num);
    }
}
