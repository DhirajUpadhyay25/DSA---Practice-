package SimpleQueue1;
public class LinkedListImpQueue
{
    Node front=null;
    Node rear =null;

    //enqueue
    public void enqueue(int data)
    {
        Node newNode=new Node(data);
        if(rear==null)
        {
            front= rear =newNode;
            System.out.println(rear.data+" is added!!");
            return;
        } else{
            rear.next=newNode;
            rear =newNode;
            System.out.println(rear.data+": Is added!!");
        }
    }
    //dequeue
    public void dequeue()
    {
        if(front==null)
        {
            System.out.println("Queue is Empty!!");
            return;
        }
            int removed=front.data;
            front=front.next;
            if(front==null){
                rear =null;
            }
        System.out.println(removed +":is Removed!!");

    }
    //display
    public void display()
    {
        if(front == null)
        {
            System.out.println("Empty Queue...");
            return;
        }

        Node temp=front;
        while (temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //peek
    public void peek(){
        if(front == null)
        {
            System.out.println("Empty Queue...");
            return;
        }
       int p =front.data;
        System.out.println(p+" Peeked");
    }
}
