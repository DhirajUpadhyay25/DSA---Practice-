package DoublyLinkedList;

public class DoubleOperationsLL
{
    Node head;
 // 1 insert At beginning of Node
    public  void InsertInBeginnings(int data )
    {
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    // 2 Insert at Ending ?
    public void InsertEnd(int data )
    {
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=null;
    }

    // 3 insert At particular Positions
    public void insertAtPosition(int data, int position)
    {
      Node newNode=  new Node(data);
      if(head==null){
          System.out.println("Head is null");
          return;
      }
        if(position==0)
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            return;
        }
        if(position<0){
            System.out.println("Position is Invalid !! Please Enter valid Position !!! ");
            return;
        }

        Node temp=head;
        int index=0;
        while(temp.next!=null) {
            if (index == position - 1) {
                break;
            }
            temp = temp.next;
            index++;
        }
        if(temp.next==null){
            System.out.println("position is out of Bound!!");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next=newNode;
    }

    // 4 display forward LL
    public void DisplayLl(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node temp=head;
        while(temp!=null){
            if (temp.next==null){
                System.out.print(temp.data+" ");
            } else {
                System.out.print(temp.data+" <=> ");
            }
            temp=temp.next;

        }

    }

    // 5 display backward
    public void displayBackward() {
        if(head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        // Move temp to last node first so temp store data
        while(temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
        System.out.println();
        System.out.println("backward LL");

        while(temp != null) {
            System.out.print(temp.data);

            if(temp.prev != null) {
                System.out.print(" <=> ");
            }

            temp = temp.prev;
        }
    }

    // 6 check element is in inside node LL
    public void checkElement(int element){
        if(head==null){
            System.out.println("Empty List");
            return;
         }
        System.out.println();
        Node temp=head;
         while(temp !=null){
            if(temp.data==element){
                System.out.println( element +"=>Element is  found in DLL !!!");
                return;
            }
             temp=temp.next;
        }
    }
}
