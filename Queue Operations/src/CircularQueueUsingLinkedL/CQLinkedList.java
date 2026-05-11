package CircularQueueUsingLinkedL;

public class CQLinkedList
{
    Node front;
    Node rear;
    int size;
    public CQLinkedList()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }
    //enqueue
    public void  enqueue(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty()){
            front=rear=newNode;
            rear.next=newNode;
        } else{
            rear.next=newNode;
            rear=newNode;
            rear.next=front;
        }
        size++;
    }
    // dequeue
    public void   dequeue()
    {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int data = front.data;
        // only one node
        if(front == rear)
        {
            front = rear = null;
        }
        else
        {
            front = front.next;
            rear.next = front;
        }

        size--;

        System.out.println("Dequeued: " + data);
    }
    //display
    public void  display()
    {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;

        do
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != front);

        System.out.println();
    }

}
