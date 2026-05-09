package SinglyLL;
public class InsertLinkedList
{
    Node head=null;

    //insert at starting
    public void insertdata(int data){

        Node NewNode=new Node(data);
        if(head==null){
            head=NewNode;
            return;
        }
        else{
            NewNode.next=head;
            head=NewNode;
            return;
        }
    }

    //insert data at ending
    public void insertAtEnding(int data ){
        Node NewNode=new Node(data);
        if(head==null){
            head=NewNode;
            return;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=NewNode;
            NewNode.next=null;
            return;


        }

    }

    //inserting at middle
    public void insertAtPosition(int data,int position)
    {
        if(position<0){
            System.out.println("invalid position !!");
            return;
        }
        Node NewNode=new Node(data);
        if(position==0)
        {
            NewNode.next=head;
            head=NewNode;
            return;
        }
        else
        {
            Node temp=head;
            int index=0;
            while(temp.next!=null){
                if(index==position-1){
                    break;
                }
                temp= temp.next;
                index++;
            }

            if(temp.next==null)
            {
                System.out.println("position out of bound  !!");
                return;
            }
            NewNode.next=temp.next;
            temp.next=NewNode;
            return;
        }
    }
    // display data
    public void DisplayData(){
        Node temp=head;
        while(temp!=null){
            if (temp.next ==null){
                System.out.print(temp.data+" ");
            }
            else {
                System.out.print(temp.data + " -> ");
            }
            temp=temp.next;

        }



    }


    // delete from starting
    public void DeleteFromStarting(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
    }


    //delete from last
    public void deleteFromLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        temp.next=null;
    }

    //delete from specific position;
    public void DeleteFromPosition(int position)
    {
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(position==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0; i<position-1 &&  temp != null ;i++){
            temp=temp.next;
            if(temp==null || temp.next==null){
                System.out.println("Position is out of Bound");
                return;
            }


        }
        temp.next=temp.next.next;
    }

    //Searching particular data
    public boolean SearchData(int data)
    {
        Node temp=head;
        while(temp!=null){
            temp =temp.next;
            if(temp.data==data){}
            return true;
        }
        return false;
    }

}
