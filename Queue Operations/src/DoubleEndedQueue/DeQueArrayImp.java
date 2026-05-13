package DoubleEndedQueue;

public class DeQueArrayImp {
    private int front;
    private int rear;
    private int[] deque;
    private int size;
    private int capacity;
    public DeQueArrayImp(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        size = 0;
        front = -1;
        rear = -1;

    }
    // check queue ?
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public int size() {
        return size;
    }

    //insert element from front end  ?
    public void insertFront(int data) {
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = rear =0;
        } else if (front==0) {
            front =capacity-1; //if front already at index =0; move front to last index
        } else {
            front--;
        }
        deque[front] = data;
        System.out.println("Inserted in front : " + data);
        size++;
    }

    // insertion from rear end
    public void insertRear(int data) {
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            rear = front=0;
        } else if (rear==capacity-1) {
            rear = 0;
        } else{
            rear++;
        }
        deque[rear] = data;
        System.out.println("Inserted " + data);

        size++;
    }
    // delete from front
    public void deleteFront() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
       int data= deque[front];
        if(front==rear){
            front = -1;
            rear = -1;
        } else if (front==capacity-1) {
            front = 0;
        } else{
            front++;
        }
        size--;
        System.out.println(" deleted front : " +data);
        }
 // delete from rear
    public void deleteRear() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int data= deque[rear];
        if(rear==front) {
            rear = -1;
            front = -1;
        } else if(rear==0) {
            rear =capacity-1;
        } else  {
            rear--;
        }
        size--;
        System.out.println(" deleted rear : " +data);
    }

    //get front data from
    public int getFront() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return deque[front];
    }
    public int getRear() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return deque[rear];
    }
// display queue ?
    public void display() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(deque[(front+i) % capacity] + " ");
        }
        System.out.println();
    }

}
