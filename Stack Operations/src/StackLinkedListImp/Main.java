package StackLinkedListImp;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        LinkedListop ll = new LinkedListop();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.pop();
        System.out.println( ll.peek());
        ll.Display();
    }
}
