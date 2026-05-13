package DoubleEndedQueue;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello DeQue");
        DeQueArrayImp dq=new DeQueArrayImp(5);
//        dq.insertFront(10);
//        dq.insertFront(20);
//        dq.insertFront(40);
//        dq.insertRear(100);
//        dq.insertRear(99);
        dq.insertRear(89);
        dq.insertRear(101);
        dq.insertRear(102);
        dq.insertRear(103);

        dq.display();
//        System.out.println( "size is : "+ dq.size());
//        dq.deleteFront();
//        dq.display();
        dq.deleteRear();
        dq.insertRear(103);
        dq.insertFront(104);
        dq.display();
        System.out.println( "size is : "+ dq.size());
        System.out.println("Front element is : "+ dq.getFront());
        System.out.println("rear element is : "+   dq.getRear());
    }
}
