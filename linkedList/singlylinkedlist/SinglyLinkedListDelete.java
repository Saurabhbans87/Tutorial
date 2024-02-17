/**
 * Create by saurabh
 * Date: 17/02/24
 * Project Name: Tutorial
 */
package linkedList.singlylinkedlist;

public class SinglyLinkedListDelete {
    static class SinglyNode {
        int data;
        SinglyNode next;
        public SinglyNode(int data){
            this.data = data;
        }
    }
    SinglyNode head;
    public SinglyLinkedListDelete(){
        this.head = null;
    }
    public void printLinkedList(){
        SinglyNode current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current =current.next;
        }
        System.out.println("null");
    }

    public void deleteAtBiginning(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        SinglyNode prev = null;
        SinglyNode current = head;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }
    public void deleteAtPosition(int position){
        int count = 0;
        if (position <= 0) {
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        SinglyNode current = head;
        SinglyNode previous = null;
        while(current != null && count < position){
            previous = current;
            current = current.next;
            count++;
        }
        previous.next = current.next;

    }

    public static void main(String[] args) {
        SinglyLinkedListDelete singlyLinkedListDelete = new SinglyLinkedListDelete();
        SinglyNode first = new SinglyNode(5);
        SinglyNode second = new SinglyNode(10);
        SinglyNode third = new SinglyNode(15);
        SinglyNode fourth = new SinglyNode(15);
        singlyLinkedListDelete.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        singlyLinkedListDelete.printLinkedList();
        singlyLinkedListDelete.deleteAtBiginning();
        singlyLinkedListDelete.printLinkedList();
        singlyLinkedListDelete.deleteAtEnd();
        singlyLinkedListDelete.printLinkedList();
        singlyLinkedListDelete.deleteAtPosition(1);
        singlyLinkedListDelete.printLinkedList();
    }
}
