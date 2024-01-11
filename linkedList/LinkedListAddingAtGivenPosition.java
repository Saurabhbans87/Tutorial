/**
 * Create by saurabh
 * Date: 11/01/24
 * Project Name: Tutorial
 */
package linkedList;

public class LinkedListAddingAtGivenPosition {
    static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public LinkedListAddingAtGivenPosition(){
        this.head=null;
    }
    public void insertAtgivenNode(int givenNode,int data){
        Node newNode = new Node(data);
        Node current =head;
        while(current != null && current.data != givenNode){
            current=current.next;
        }
        if(current!=null){
            newNode.next=current.next;
            current.next=newNode;
        }else{
            System.out.println("Node not found");
        }

    }
}
