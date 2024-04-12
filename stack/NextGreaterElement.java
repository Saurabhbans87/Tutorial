/**
 * Create by saurabh
 * Date: 13/01/24
 * Project Name: Tutorial
 */
package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] array = {5,6,3,12,10};
        int[] nextGreatElement = nextGreaterElement(array);
        for (int i=0;i<array.length;i++){
            System.out.print(nextGreatElement[i]+" ");
        }
    }

    private static int[] nextGreaterElement(int[] array) {
        int[] result = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< array.length;i++){
            while(!stack.isEmpty() && array[i] > array[stack.peek()]){
                int index = stack.pop();
                result[index] = array[i];
                //result[i] =result[index];
            }
            stack.push(i);
        }
        return result;
    }
}
