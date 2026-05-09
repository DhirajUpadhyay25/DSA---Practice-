package SinglyLL;

public class Main {

    static void main(String[] args) {
        InsertLinkedList list = new InsertLinkedList();
        System.out.print("Linked List: ");
        list.insertdata(45);
        list.insertdata(55);
        list.insertdata(66);
        list.insertdata(77);
        list.insertdata(88);
        list.insertdata(99);
        list.insertdata(999);
        list.insertdata(101);
        list.insertAtEnding(8);
        list.insertAtEnding(9);
        list.DeleteFromStarting();
        list.deleteFromLast();
        list.DisplayData();

    }
}
