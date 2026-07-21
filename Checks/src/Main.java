class Main {
    static void main(String[] args) {
        String a = "6";
        String  b = "61";
        System.out.println(a.equals(b));//true (values ar equals and point to same memory addresses)
      int x=10;
      int y=20;
        System.out.println("x is ..." + (x==y));



        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.equals(s2)); // false (checks values only )
        System.out.println(s1==s2); // false (different objects in memory checks location in memory)


    }

}
