/**
 * Create by saurabh
 * Date: 13/01/24
 * Project Name: Tutorial
 */
package stack;

public class StackUingLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.next=null;
            this.data=data;
        }
    }
    Node top;
    int size;
    public StackUingLinkedList(){
        this.top=null;
        this.size=0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top=newNode;
        size++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is under flow");
        }
        int popData = top.data;
        top=top.next;
        size--;
        return popData;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is under flow");
        }
        int peekData=top.data;
        return peekData;
    }
    public void displayStack(){
        Node current= top;
        if(current == null){
            System.out.println("Stacke is empty");
        }
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        StackUingLinkedList stackUingLinkedList = new StackUingLinkedList();
        stackUingLinkedList.displayStack();
        stackUingLinkedList.push(20);
        stackUingLinkedList.push(30);
        stackUingLinkedList.displayStack();
        int popData=stackUingLinkedList.pop();
        System.out.println(popData);
        stackUingLinkedList.displayStack();
        stackUingLinkedList.peek();
    }
}
