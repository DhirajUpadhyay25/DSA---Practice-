package CIrcularQueue2;

public class CircularQueueArrayImp
{
    int front;
    int rear;
    int [] Queue;
    int size;
    int capacity;

    public CircularQueueArrayImp(int capacity)
    {
        Queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
        this.capacity = capacity;

    }
    //enqueue
    public void enqueue(int data)
    {
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        } else {
            rear = (rear+1)%capacity;
            Queue[rear] = data;
            size++;
            System.out.println("Enqueued: " + data);
        }
    }
    //dequeue
    public void dequeue()
    {
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        int data=Queue[front];
        front = (front+1)%capacity;
        size--;

        System.out.println("Dequeued: " +data);
    }
    public int peek()
    {
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return Queue[front];
    }
    //display queue
    public void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = 0; i < size; i++){
            int data = Queue[(front+i) % capacity];
            System.out.print(data + " ");
        }
        System.out.println( );
    }
    public int  size(){
        return size;
    }

}

