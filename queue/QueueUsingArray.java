/**
 * Create by saurabh
 * Date: 12/01/24
 * Project Name: Tutorial
 */
package queue;

public class QueueUsingArray {
    private int[] array;
    private int capacity = 100;
    private int front;
    private int rear;
    public QueueUsingArray(){
        this.capacity=capacity;
        this.front=-1;
        this.rear=-1;
    }
    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == array.length - 1;
    }
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            return rear - front + 1;
        }
    }

    public void enQueue(int data){
        if(isEmpty()){
            front = 0;
        }
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear++;
        array[rear] = data;
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot dequeue.");
        }
        int dequeuedItem = array[front];
        if (front == rear) {
            // Last element in the queue is dequeued
            front = rear = -1;
        } else {
            front++;
        }
        return dequeuedItem;
    }

    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        queueUsingArray.enQueue(3);
        queueUsingArray.enQueue(4);
        queueUsingArray.enQueue(5);
        queueUsingArray.enQueue(9);
        System.out.println("Front " +queueUsingArray.deQueue());

    }
}
