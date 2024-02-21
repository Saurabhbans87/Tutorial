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
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void inseartAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void forwardLinkedListPrint(){
        Node current = head;
        while(current != null){
            System.out.print(current.data +"->");
            current = current.next;
        }
        System.out.println("null");
    }
    public void backwardLinkedListPrint(){
        Node last = tail;
        while (last != null){
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       DoublyLinkedListAdd doublyLinkedListAdd = new DoublyLinkedListAdd();
       doublyLinkedListAdd.inseartAtBeginning(5);
       doublyLinkedListAdd.inseartAtBeginning(10);
       doublyLinkedListAdd.inseartAtBeginning(15);
       doublyLinkedListAdd.forwardLinkedListPrint();
       doublyLinkedListAdd.backwardLinkedListPrint();
       doublyLinkedListAdd.inseartAtEnd(20);
       doublyLinkedListAdd.inseartAtEnd(25);
       doublyLinkedListAdd.inseartAtEnd(30);
        doublyLinkedListAdd.inseartAtEnd(30);
       doublyLinkedListAdd.forwardLinkedListPrint();
       doublyLinkedListAdd.backwardLinkedListPrint();

    }
}
