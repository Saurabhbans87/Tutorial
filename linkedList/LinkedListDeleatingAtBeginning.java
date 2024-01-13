/**
 * Create by saurabh
 * Date: 12/01/24
 * Project Name: Tutorial
 */
package linkedList;

public class LinkedListDeleatingAtBeginning {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public LinkedListDeleatingAtBeginning(){
        this.head=null;
    }
    public void printLinkeList(){
        Node current = head;
        while(current !=null){
            System.out.print(current.data +"->");
            current=current.next;
        }
    }
    public void deleteFirstNode(){
        Node current = head;
        //current=current.next;
        head =current.next;
    }

    public static void main(String[] args) {
        LinkedListDeleatingAtBeginning linkedListDeleatingAtBeginning = new LinkedListDeleatingAtBeginning();
        Node first = new Node(4);
        Node second = new Node(6);
        Node third = new Node(8);
        Node fourth = new Node(10);
        Node fifth = new Node(12);

        linkedListDeleatingAtBeginning.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next =fifth;
        System.out.println("Printing LinkedList");
        linkedListDeleatingAtBeginning.printLinkeList();
        System.out.println(" ");
        System.out.println("Deleting first node");
        linkedListDeleatingAtBeginning.deleteFirstNode();
        linkedListDeleatingAtBeginning.printLinkeList();

    }
}
