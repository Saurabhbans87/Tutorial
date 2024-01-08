/**
 * Create by saurabh
 * Date: 08/01/24
 * Project Name: Tutorial
 */
package stack;

public class StackImplUsingArray {
    private int[] array;
    private int capacity;
    private int top;

    public StackImplUsingArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean size(){
        return top == capacity-1;
    }
    public void push(int element){
        if(size()){
            System.out.println("Stack overflow");
        }
        array[++top] = element;
        System.out.println("element added into stack" +element);
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            //return 0;
        }
        int popElement = array[top--];
        return popElement;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            //return 0;
        }
        int peekElement = array[top];
        return peekElement;
    }

    public static void main(String[] args) {
        StackImplUsingArray stackImplUsingArray = new StackImplUsingArray(1);
        stackImplUsingArray.push(2);
        stackImplUsingArray.push(4);
        System.out.println(stackImplUsingArray.pop());
        System.out.println(stackImplUsingArray.peek());
    }
}
