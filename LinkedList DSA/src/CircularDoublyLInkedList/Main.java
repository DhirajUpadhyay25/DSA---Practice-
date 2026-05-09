package CircularDoublyLInkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        OperationsInCDLL op=new OperationsInCDLL();
        op.insertAtHead(20);
        op.insertAtHead(30);
        op.insertAtHead(40);
        op.insertAtHead(50);
        op.insertAtHead(60);
        op.insertAtEnd(100);
        op.insertAtHead(70);
        op.displayForward();
        System.out.println(" ");
        System.out.print("Backward : ");
        op.displayBackward();
    }
}
