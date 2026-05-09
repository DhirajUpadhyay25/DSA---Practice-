package CircularSinglyLinkedList;

public class CircularSLLOperations

{
 Node head;

    //insert at starting ?
    public void InsertInStarting(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
          head=newNode;
          newNode.next=head;
          return;
        }
        // last node for update till head finds not Null ?
        Node temp=head;
        while (temp.next != head){
           temp=temp.next;
        }
        newNode.next=head;
        // update head in Last Node.next =newNode
        temp.next=newNode;
        // place head = newNode as usual .
        head=newNode;
    }

    // Insert at End
public void InsertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            newNode.next=head;
            return;
        }
         Node temp = head;
        while(temp.next!=head){
            temp=temp.next;
        }
          temp.next=newNode;
          newNode.next=head;
}



  // Display ll
  public void display() {
      if(head == null) {
          System.out.println("Empty List");
          return;
      }
      Node temp = head;
      do {

          System.out.print(temp.data);

          temp = temp.next;

          if(temp != head) {
              System.out.print(" -> ");
          }

      } while(temp != head);
  }

      // delete Node in Circular LL
        public void DeleteFromStarting()
        {
            if(head==null)
            {
                System.out.println("Empty List");
                return;
            }
            //update last Node head
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }

            head =head.next;
            temp.next=head;
        }

        // delete from last
    public void DeleteFromLast(){
        if(head==null)
        {
            System.out.println("Empty List");
            return;
        }
        Node temp=head;
        //first get second last node here?
        while(temp.next.next!=head){
                temp=temp.next;
        }
        // got second last node now
        temp.next=temp.next.next;
    }
}
