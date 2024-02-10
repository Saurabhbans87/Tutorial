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
        if(current == null){
            System.out.println("Linkedlist is empty");
        }
        while(current != null){
            System.out.print(current.data +" ");
            current = current.next;
        }
    }
    public void linkedListLength(){
        int count = 0;
        Node current = head;
        if(current == null){
            System.out.println("Linkedlist is empty");
        }
        while(current != null){
            count++;
            current=current.next;
        }
        System.out.println("Length of linkelist is " +count);
    }
    public void insertNodeAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertNodeAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node current = head;
        while(current.next!= null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAfterNode(int afterNodeData, int data){
        Node newNode = new Node(45);
        Node current = head;
        if(current== null);
        {
            head = newNode;
        }
        while(current.next != null && current.data != afterNodeData)
        {
                current = current.next;
        }
        if (current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Node with existingData not found");
        }
    }

    private void search(Node head, int i) {
        Node current = head; // Initialize current
        while (current != null) {
            if (current.data == i){
                System.out.println("Data found");
            }
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
        System.out.println(" ");
        System.out.println("Search node in linkedlist");
        linkedList.search(linkedList.head, 14);
        System.out.println("Adding node at beginning of linkedlist");
        linkedList.insertNodeAtBeginning(30);

        linkedList.display();
        System.out.println(" ");
        System.out.println("Length of linkedlist");
        linkedList.linkedListLength();

        System.out.println(" ");
        System.out.println("Adding node at End of linkedlist");
        linkedList.insertNodeAtEnd(40);
        linkedList.display();

        System.out.println(" ");
        System.out.println("Adding node at given position of linkedlist");
        linkedList.insertAfterNode(15,48);
        linkedList.display();
    }
}
