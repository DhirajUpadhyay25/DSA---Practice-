package CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        CircularSLLOperations cll = new CircularSLLOperations();
        cll.InsertInStarting(20);
        cll.InsertInStarting(40);
        cll.InsertInStarting(60);
        cll.InsertInStarting(80);
        cll.InsertInStarting(90);
        cll.InsertInStarting(10);
        cll.InsertInStarting(1);
        cll. InsertAtEnd(10000);
        cll. InsertAtEnd(20000);
        cll. InsertAtEnd(20000);
        cll. InsertAtEnd(220);
        cll.InsertInStarting(2);
        cll.DeleteFromStarting();
        cll. InsertAtEnd(320);
        cll.DeleteFromLast();
        cll.InsertInStarting(0);
        cll.display();
//        cll. InsertAtEnd(10000);
//        cll.display();
    }
}
