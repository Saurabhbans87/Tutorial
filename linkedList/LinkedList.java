/**
 * Create by saurabh
 * Date: 10/01/24
 * Project Name: Tutorial
 */
package linkedList;

public class LinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public LinkedList() {
        this.head = head;
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data +" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        //Creating linked list
        LinkedList linkedList = new LinkedList();
//        linkedList.head = new Node(2);
//
//        Node second = new Node(5);
//        Node third = new Node(8);
//
//        linkedList.head.next=second;
//        second.next=third;
//        linkedList.display();
        //Creating node
        Node first = new Node(5);
        Node second = new Node(12);
        Node third = new Node(14);
        Node fourth = new Node(15);
        //assigning reference
        linkedList.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        linkedList.display();


    }
}
