/**
 * Create by saurabh
 * Date: 12/01/24
 * Project Name: Tutorial
 */
package linkedList;

public class LinkedListDeletingAtEnd {
    static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public LinkedListDeletingAtEnd(){
        this.head=null;
    }
    public void printingLinkedList(){
        Node current =head;
        while(current!=null){
            System.out.println(current.data +"->");
            current=current.next;
        }
    }
    public void deleteNodeAtEnd(){
        Node current =head;
        //while(current.next!)
    }
}
