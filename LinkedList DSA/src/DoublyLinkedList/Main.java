package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleOperationsLL dop = new DoubleOperationsLL();
        dop.InsertInBeginnings(10);
        dop.InsertInBeginnings(20);
        dop.InsertInBeginnings(30);
        dop.insertAtPosition(11,1);
        dop.InsertEnd(101);
        dop.InsertEnd(102);
        dop.DisplayLl();
        dop.displayBackward();
        dop.checkElement(20);

    }
}
