package SimpleQueue1;

public class LinearQueueArray
{
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    public LinearQueueArray(int size)
    {
        this.size = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;

    }
    //check if Queue overflow ?
    public boolean isFull() {
        return rear == size - 1;
    }
    //check if queue is Empty?
    public boolean isEmpty() {
        return front==-1;
    }
    //Enqueue
    public void  enqueue(int data)
    {
        if(isFull()){
            System.out.println("Queue is full!");
            return;
        }
        rear++;
        queueArray[rear] = data;
        System.out.println(data +"is inserted in Queue!");
    }
    // dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        int data = queueArray[front];
        front++;
        return data;
    }
    //peek data
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueArray[front];
    }
    //display queue
    public void display() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        } else{
            for(int i=front; i<=rear; i++){
                System.out.print(queueArray[i]+" ");
            }
            System.out.println();
        }
    }
}
