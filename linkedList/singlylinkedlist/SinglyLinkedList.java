/**
 * Create by saurabh
 * Date: 12/02/24
 * Project Name: Tutorial
 */
package linkedList.singlylinkedlist;

public class SinglyLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public SinglyLinkedList(){
        this.head = null;
    }
    public void inseartAtHead(int data){
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
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.inseartAtHead(5);
        singlyLinkedList.printSinglyLinkedList();
    }
}
