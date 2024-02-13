/**
 * Create by saurabh
 * Date: 11/02/24
 * Project Name: Tutorial
 */
package linkedList.doublyLinkedList;

public class DoublyLinkedListAdd {
    private Node head;
    private Node tail;
    private class  Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    public void inseartAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    public void inseartAtEnd(int data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
    }

    public static void main(String[] args) {
       DoublyLinkedListAdd doublyLinkedListAdd = new DoublyLinkedListAdd();
       doublyLinkedListAdd.inseartAtBeginning(5);
       doublyLinkedListAdd.inseartAtBeginning(10);
       doublyLinkedListAdd.inseartAtBeginning(15);
       doublyLinkedListAdd.inseartAtEnd(20);
       doublyLinkedListAdd.inseartAtEnd(25);
       doublyLinkedListAdd.inseartAtEnd(30);

    }
}
