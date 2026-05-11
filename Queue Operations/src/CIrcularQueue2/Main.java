package CIrcularQueue2;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello circular Queue");
        CircularQueueArrayImp circular=new CircularQueueArrayImp(5);
        circular.enqueue(10);
        circular.enqueue(20);
        circular.enqueue(15);
        circular.enqueue(30);
        circular.enqueue(40);
        circular.enqueue(50);
        circular.display();
        circular.dequeue();
        circular.display();
        System.out.println(circular.size());
        System.out.println(circular.peek());

    }
}
