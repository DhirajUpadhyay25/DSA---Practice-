package StackImpArray;

public class Stack
{
    int top=0;
    int MaxSize;
    int[] Array;
   public Stack(int size){
       this.MaxSize=size;
       this.Array=new int[size];
       this.top=-1;
   }

    //check isEmpty?
    public boolean isEmpty(){
      return (top==-1);
    }
    //Push operations
    public void push(int data){
       if(top==MaxSize-1){
           System.out.println("Stack Overflow");
           return;
       } else{
           top++;
           Array[top]=data;
       }

    }
    //pop operations
    public void   pop(){
       if(isEmpty()){
           System.out.println("stack is empty");
       }
       else{
           System.out.println(Array[top]+" Deleted !!");
           Array[top]=-1;
           top--;
       }
    }
    //peek operations
    public int peek(){
       if(isEmpty()){
           System.out.println("stack is empty");
           return -1;
       }
       return Array[top];
    }
    //display operations
    public void displayStack(){
       if(isEmpty()){
           System.out.println("stack is empty");
       }
       else{
           for(int i=0;i<=top;i++){
               System.out.print(Array[i] +" ");
           }
       }
    }

}
