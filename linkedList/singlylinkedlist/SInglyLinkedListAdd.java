/**
 * Create by saurabh
 * Date: 17/02/24
 * Project Name: Tutorial
 */
package linkedList.singlylinkedlist;

public class SInglyLinkedListAdd {
    SinglyNode head;
    public SInglyLinkedListAdd(){
        head = null;
    }
    static class SinglyNode{
        private int data;
        SinglyNode next;
        public SinglyNode(int data){
            this.data = data;
        }
    }

    public void printLinkedList(){
        SinglyNode current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtBeginning(int data){
        SinglyNode singlyNode = new SinglyNode(data);
        if(head == null){
            head = singlyNode;
        }
        singlyNode.next = head;
        head = singlyNode;
    }
    public void inseratAtEnd(int data){
        SinglyNode singlyNode = new SinglyNode(data);
        SinglyNode current = head;
        if(head == null){
            head = singlyNode;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = singlyNode;
    }

    public void inseartAtPosition(int data, int position){
        SinglyNode singlyNode = new SinglyNode(data);
        int count = 0;
        if(position <= 0){
            System.out.println("Not valid");
            return;
        }
        if(position == 1){
            singlyNode.next = head;
            head = singlyNode;
            return;
        }
        SinglyNode current = head;
        while(current.next != null && count < position -1){
            current = current.next;
            count++;
        }
        singlyNode.next = current.next;
        current.next = singlyNode;
    }

    public static void main(String[] args) {
        SInglyLinkedListAdd sInglyLinkedListAdd = new SInglyLinkedListAdd();
        SinglyNode first = new SinglyNode(5);
        SinglyNode second = new SinglyNode(10);
        SinglyNode third = new SinglyNode(15);
        sInglyLinkedListAdd.head = first;
        first.next = second;
        second.next = third;
        sInglyLinkedListAdd.printLinkedList();
        sInglyLinkedListAdd.insertAtBeginning(20);
        sInglyLinkedListAdd.printLinkedList();
        sInglyLinkedListAdd.inseratAtEnd(25);
        sInglyLinkedListAdd.printLinkedList();
        sInglyLinkedListAdd.inseartAtPosition(35,2);
        sInglyLinkedListAdd.printLinkedList();
    }

}
