/**
 * Create by saurabh
 * Date: 07/01/24
 * Project Name: Tutorial
 */
package stack;

public class StackUsingArray {
    private static final int size = 100;
    private int[] array = new int[size];
    private int top = -1;

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public int size(){
        return (top+1);
    }
    public void push(int num){
        if(top >= size-1){
            throw new IllegalStateException("Stack overflow exception");
        }
        top = top+1;
        array[top] = num;
    }
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack underflow exception");
        }
        int popNumber = array[top];
        top= top-1;
        return popNumber;
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack underflow exception");
        }
        int peekNumber = array[top];
        return peekNumber;
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push(2);
        stackUsingArray.push(3);
        stackUsingArray.push(5);
        System.out.println("Pop element is " +stackUsingArray.pop());
        System.out.println("Peek element is "+stackUsingArray.peek());
        System.out.println("Pop element is " +stackUsingArray.pop());
    }
}
