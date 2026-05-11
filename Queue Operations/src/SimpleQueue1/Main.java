package SimpleQueue1;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello Queue!!");
        //Array Implementation
//        LinearQueueArray Queue=new LinearQueueArray(5);
//        Queue.enqueue(10);
//        Queue.enqueue(20);
//        Queue.enqueue(30);
//        Queue.enqueue(40);
//        Queue.enqueue(50);
//        Queue.enqueue(60);
//        System.out.println(Queue.dequeue()+": Is removed!!");
//        Queue.display()
// .................................................................
        LinkedListImpQueue ll = new LinkedListImpQueue();
        ll.enqueue(10);
        ll.enqueue(20);
        ll.enqueue(30);
        ll.enqueue(40);
        ll.display();
        ll.dequeue();
        ll.display();
        ll.peek();
    }
}
