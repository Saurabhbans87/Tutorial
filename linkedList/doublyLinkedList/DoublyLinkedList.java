/**
 * Create by saurabh
 * Date: 11/02/24
 * Project Name: Tutorial
 */
package linkedList.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    private class Node{
        private int data;
        private Node next;
        private Node prev;
        public Node(int data){
            this.data =  data;
            this.next = null;
            this.prev = null;
        }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty() {
        return length == 0; // or head == null
    }

    public int length() {
        return length;
    }

    public void displayForward() {
        if(head == null) {
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        if(head == null) {
            return;
        }
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }


}
