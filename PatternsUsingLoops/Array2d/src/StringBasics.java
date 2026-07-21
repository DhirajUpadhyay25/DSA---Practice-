public class StringBasics
{
    static void charString(String str){
        int length = str.length();
        for(int i = 0; i < length; i++){
            char each= str.charAt(i);
            System.out.print(each + " ");
        }
    }

    static int getStringLength(String str){
        int count = 0;
        for(char ch: str.toCharArray()){
            count++;
        }

        return count;
    }

    static int vowelsCount(String str){
        int count = 0;
        int consonants = 0;
        for(char ch: str.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            } else{
                consonants++;
            }
        }
        return consonants;
    }


      static void reverseString(String str){
        int length = str.length();
        String reversedString = "";
        for(int i = length-1; i >=0; i--){
           reversedString= reversedString + str.charAt(i);
        }
          System.out.println(reversedString);
      }

      static boolean isPalindrome(String str){
          int length = str.length();
          String original=str;
          String reversedString = "";
          for(int i = length-1; i >=0; i--){
              reversedString= reversedString + str.charAt(i);
          }

          for(int i = 0; i<length; i++){
              if(original.charAt(i) != reversedString.charAt(i)){
                  return false;
              }
          }
          return true;
      }
      //6 to uppercase without methos ?
       static void toUpperCase(String str){
        int length = str.length();
        String result = "";
        for(int i=0;i<length;i++){
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ch= (char)(ch+32);
            }
            result += ch;
        }
        char chh= (char)99;
        System.out.println(chh);
        System.out.println(str);
        System.out.println(result);
    }
//7 frequencies of a character
    static int frequencyOfChar(String str, char targetChar){
      int frequency = 0;
      str = str.toLowerCase();
      int length = str.length();
      for(int i = 0; i < length; i++){
          char ch = str.charAt(i);
          if(ch == targetChar)
              frequency++;
      }
      return frequency;
    }
    //8 remove all spaces
    static void removeSpaces(String str){
        str = str.toLowerCase();
        int  length = str.length();
//        int count = 0;
        String result="";
        for(int i = 0; i < length; i++){

            if(str.charAt(i) != ' '){
//                count++;

                result=result+str.charAt(i);
            }
        }
//        System.out.println(count);
        System.out.println(result.toUpperCase());
    }



    static void main(String[] args) {
        String str = "  Dhiraj ";


//        removeSpaces(str);
//        char target='g';
//   7    System.out.println(frequencyOfChar(str, target));
//   6     toUpperCase(str);

//   5    System.out.println(isPalindrome(str));
//   4     reverseString(str);
//   3     System.out.println(vowelsCount(str));
//   2     System.out.println(getStringLength(str));
//   1     charString(str);


//        System.out.println("Hello World");
//        char[] arr = {'a','b','c','d','e','f','g'};
//        System.out.println("Original Array length: :" + arr.length);
//
//        String str = new String("Dhiraj");
//        String str1="Upadhyay";
//        System.out.println("Original String: " + str);
    }
}
