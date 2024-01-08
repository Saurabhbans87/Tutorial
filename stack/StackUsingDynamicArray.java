/**
 * Create by saurabh
 * Date: 07/01/24
 * Project Name: Tutorial
 */
package stack;

public class StackUsingDynamicArray {
    private int[] array;
    private int capacity;
    private int top;

    public StackUsingDynamicArray(int capacity) {
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
            resize(capacity*2);
        }
        array[++top] = element;
        System.out.println("Element added to stack" +element);
    }

    private void resize(int newCapicity) {
        int[] newArray = new int[newCapicity];
        System.arraycopy(array,0,newArray,0,capacity-1);
        array = newArray;
        capacity = newCapicity;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack under flow");
        }
        if(top < capacity/2){
            resize(capacity/2);
        }
        int popEelement = array[top--];
        return popEelement;
    }

    public static void main(String[] args) {
        StackUsingDynamicArray stackUsingDynamicArray = new StackUsingDynamicArray(2);
        stackUsingDynamicArray.push(2);
        stackUsingDynamicArray.push(3);
        System.out.println("Pop element is "+stackUsingDynamicArray.pop());
        stackUsingDynamicArray.push(4);
        stackUsingDynamicArray.push(6);
        stackUsingDynamicArray.push(8);
        System.out.println("Pop element is "+stackUsingDynamicArray.pop());
        stackUsingDynamicArray.push(10);
        stackUsingDynamicArray.push(12);
        stackUsingDynamicArray.push(16);
        System.out.println("Pop element is "+stackUsingDynamicArray.pop());
    }
}
