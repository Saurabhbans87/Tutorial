/**
 * Create by saurabh
 * Date: 11/02/24
 * Project Name: Tutorial
 */
package linkedList.circularLinkedList;

public class CircularLinkedList {
    private ListNode tail;
    private int length;
    private class ListNode {
        private ListNode next;
        private int data;
        public ListNode(int data) {
            this.data = data;
        }
    }
    public CircularLinkedList() {
        tail = null;
        length = 0;
    }
    public int length() {
        return length;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        tail = fourth;
    }
    public void display() {
        if(tail == null) {
            return;
        }
        ListNode first = tail.next;
        while(first != tail) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.createCircularLinkedList();
        cll.display();
    }
}
