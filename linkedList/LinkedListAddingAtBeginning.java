/**
 * Create by saurabh
 * Date: 10/01/24
 * Project Name: Tutorial
 */
package linkedList;

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
    public void dispalyLinkedList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListAddingAtBeginning linkedListAddingAtBeginning = new LinkedListAddingAtBeginning();
        linkedListAddingAtBeginning.addingAtBeginning(5);
        linkedListAddingAtBeginning.addingAtBeginning(8);
        linkedListAddingAtBeginning.addingAtBeginning(12);
        linkedListAddingAtBeginning.dispalyLinkedList();
    }
}
