package StackImpArray;

public class Main
{
   public  static void main(String[] args)
   {
       System.out.println("hello stack");
      Stack stack= new Stack(5);
       stack.isEmpty();
       stack.push(10);
       stack.push(20);
       stack.push(30);
       stack.push(40);
       stack.push(50);
       stack.pop();
       stack.pop();
       System.out.println(stack.peek());
       stack.displayStack();
    }
}
