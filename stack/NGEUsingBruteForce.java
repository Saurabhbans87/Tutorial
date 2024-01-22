/**
 * Create by saurabh
 * Date: 13/01/24
 * Project Name: Tutorial
 */
package stack;

public class NGEUsingBruteForce {
    public static void main(String[] args) {
        int[] array = {6,10,8,12,9};
        int[] nextGreaterElementArray = nextGreaterElementUsingBruteForce(array);
        for(int i=0;i<nextGreaterElementArray.length;i++){
            System.out.print(nextGreaterElementArray[i]);
        }
    }

    private static int[] nextGreaterElementUsingBruteForce(int[] array) {
        int[] newArray = new int[array.length];
        int next;
        for(int i=0;i<array.length;i++){
            next =-1;
            for(int j=i+1;j< array.length;j++){
                if(array[i]<array[j]){
                    next = array[j];
                    break;
                }
            }
            System.out.println(array[i] + " -- " + next);
        }
        return newArray;
    }
}
