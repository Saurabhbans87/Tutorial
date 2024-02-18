/**
 * Create by saurabh
 * Date: 10/01/24
 * Project Name: Tutorial
 */
package linkedList;

import java.util.Stack;

public class LinkedListAddingAtBeginning {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
         }
        }
        Node head;
    public LinkedListAddingAtBeginning(){
        this.head = head;
    }
    public void addingAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public Node reverseLinkedList(){
        Node current = head;
        Node next =  null;
        Node previous = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public void reverseLinkedListUsingStack(){
        Stack<Node> nodeStack = new Stack<>();
        Node current = head;
        while(current != null){
            nodeStack.push(current);
            current = current.next;
        }
        head = current;
        while(!nodeStack.isEmpty()){
            current.next = nodeStack.peek();
            System.out.println(nodeStack.pop());
            current = current.next;
        }
        current.next = null;
    }
    public void dispalyLinkedList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListAddingAtBeginning linkedListAddingAtBeginning = new LinkedListAddingAtBeginning();
        linkedListAddingAtBeginning.addingAtBeginning(5);
        linkedListAddingAtBeginning.addingAtBeginning(8);
        linkedListAddingAtBeginning.addingAtBeginning(12);
        linkedListAddingAtBeginning.dispalyLinkedList();
        Node newHead = linkedListAddingAtBeginning.reverseLinkedList();
        linkedListAddingAtBeginning.head = newHead;
        linkedListAddingAtBeginning.dispalyLinkedList();
        linkedListAddingAtBeginning.reverseLinkedListUsingStack();
    }
}
