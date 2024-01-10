/**
 * Create by saurabh
 * Date: 11/01/24
 * Project Name: Tutorial
 */
package linkedList;

public class LinkedListAddingAtEnd {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    Node head;
    public LinkedListAddingAtEnd(){
        this.head=null;
    }
    public void inserAtEnd(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListAddingAtEnd linkedListAddingAtEnd = new LinkedListAddingAtEnd();
        linkedListAddingAtEnd.inserAtEnd(2);
        linkedListAddingAtEnd.inserAtEnd(3);
        linkedListAddingAtEnd.display();
    }
}
