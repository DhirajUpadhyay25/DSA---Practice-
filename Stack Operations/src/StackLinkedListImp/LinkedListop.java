package StackLinkedListImp;

public class LinkedListop {
    Node top;

    public LinkedListop() {
        this.top = null;
    }

    //isEmpty?
    public boolean isEmpty() {
       return this.top == null;
    }
    //push
    public void push(int data) {
        Node newNode = new Node(data);
         newNode.next = top;
         top = newNode;
        System.out.println(data + " inserted");
    }
    //pop
    public void  pop() {
        if(isEmpty()){
            System.out.println("stack is empty");
            return ;
        }
        int topData=top.data;
        top=top.next;
        System.out.println(topData + " popped");
    }
    //dsiplay
    public void Display(){
        if(isEmpty()){
            System.out.println("stack is empty");
        } else {
            while(top!=null){
                System.out.print(top.data+" ");
                top=top.next;
            }
        }
    }
    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        } else{
            return top.data;
        }
    }
}
