/**
 * Create by saurabh
 * Date: 29/02/24
 * Project Name: Tutorial
 */
package stack;

public class StackUingArray {
    private int[] array;
    private int capacity;
    private int top;
    public StackUingArray(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = top;
    }
    public void push(int data){
        if(stackIsFull()){
            System.out.println("Stack is full");
        }
        top++;
        array[top] = data;

    }
    public int pop(){
        if(stackIsEmpty()){
            System.out.println("STack is empty");
        }
        int data = array[top];
        top--;
        return data;
    }
    public int peek(){
        if(stackIsEmpty()){
            System.out.println("STack is empty");
        }
        int data = array[top];
        return data;
    }

    private boolean stackIsEmpty() {
        return top == -1;
    }

    private boolean stackIsFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        StackUingArray stackUingArray = new StackUingArray(10);
        stackUingArray.push(10);
        int pop = stackUingArray.pop();
        System.out.println("Pop element is " +pop);
    }
}
