/**
 * Create by saurabh
 * Date: 17/02/24
 * Project Name: Tutorial
 */
package linkedList.circularLinkedList;

public class CircularLinkedListAdd {

    static class CircularNode{
        int data;
        CircularNode next;
        public CircularNode(int data){
            this.data = data;
        }
    }
    CircularNode head;
    public CircularLinkedListAdd(){
        this.head = null;
    }
    public void inseartAtBiginning(int data){
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            newNode.next = newNode; // Point newNode's next to itself to create a circular structure
            head = newNode;
        } else {
            CircularNode lastNode = head;
            while (lastNode.next != head) {
                lastNode = lastNode.next;
            }
            newNode.next = head;
            lastNode.next = newNode;
            head = newNode;
        }
    }
    public void printCircularLinkedList(){
        CircularNode current = head;
        System.out.print(current.data + " -> ");
        current = current.next;
        while (current != head) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(" null ");
    }

    public static void main(String[] args) {
        CircularLinkedListAdd circularLinkedListAdd = new CircularLinkedListAdd();
        circularLinkedListAdd.inseartAtBiginning(5);
        circularLinkedListAdd.inseartAtBiginning(10);
        circularLinkedListAdd.inseartAtBiginning(15);
        circularLinkedListAdd.printCircularLinkedList();
    }
}
