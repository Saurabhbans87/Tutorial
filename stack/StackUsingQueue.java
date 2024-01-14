/**
 * Create by saurabh
 * Date: 14/01/24
 * Project Name: Tutorial
 */
package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue mainQueue;
    private Queue auxlryQueue;
    public StackUsingQueue(){
        mainQueue = new LinkedList();
        auxlryQueue = new LinkedList();
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }
    public void push(int data){
        mainQueue.offer(data);
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        while(mainQueue.size() > 1){
            auxlryQueue.offer(mainQueue.poll());
        }
        int popedItem = (int) mainQueue.poll();
        Queue<Integer> temp = mainQueue;
        mainQueue = auxlryQueue;
        auxlryQueue = temp;
        return popedItem;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        while(mainQueue.size() > 1){
            auxlryQueue.offer(mainQueue.poll());
        }
        int popedItem = (int) mainQueue.peek();
        Queue<Integer> temp = mainQueue;
        mainQueue = auxlryQueue;
        auxlryQueue = temp;
        return popedItem;
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(5);
        stack.push(3);
        stack.push(8);

        System.out.println("Pop: " + stack.pop());
    }
}
