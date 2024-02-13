/**
 * Create by saurabh
 * Date: 12/02/24
 * Project Name: Tutorial
 */
package linkedList.singlylinkedlist;

public class SinglyLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public SinglyLinkedList(){
        this.head = null;
    }
    public void inseartAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printSinglyLinkedList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(" ");
    }
    public void inseartAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void inseartAtPosition(int data,int position){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node first = new Node(20);
        Node second = new Node(25);
        singlyLinkedList.head = first;
        first.next = second;
        singlyLinkedList.printSinglyLinkedList();
        singlyLinkedList.inseartAtBeginning(5);
        singlyLinkedList.printSinglyLinkedList();
        singlyLinkedList.inseartAtEnd(35);
        singlyLinkedList.printSinglyLinkedList();

    }
}
