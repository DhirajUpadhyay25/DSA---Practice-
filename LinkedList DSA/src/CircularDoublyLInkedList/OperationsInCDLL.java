package CircularDoublyLInkedList;

public class OperationsInCDLL
{
    Node head =null;
    Node tail=null;


    //insert at Starting!!
    public void insertAtHead(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            head.next=head;
            head.prev=head;
            return;
        }
        newNode.next=head;
        newNode.prev=tail;
        head.prev=newNode;
        tail.next=newNode;
        head=newNode;

    }
    // insert at end
    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(tail == null)
        {
            head=newNode;
            tail=newNode;
            head.next=head;
            head.prev=head;
            return;
        } else {
            newNode.prev=tail;
            newNode.next=head;
            tail.next=newNode;
            head.prev=newNode;
            tail=newNode;
        }


    }

    // display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }while (temp != head);

    }
    //display Backward
    public void displayBackward() {
        if (tail == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = tail;
       do {
           System.out.print(temp.data +  " ");
            temp = temp.prev;

       } while (temp != tail);

    }
}
