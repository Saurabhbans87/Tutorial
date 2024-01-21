/**
 * Create by saurabh
 * Date: 21/01/24
 * Project Name: Tutorial
 */
package array;

public class LargestNumber {
    public static void main(String[] args) {
        int[] array = {23,43,12,32,67,89,98,65,43,79};
        int largestNumber = largestNumberIs(array);
        System.out.println("Largest number is " +largestNumber);
    }

    private static int largestNumberIs(int[] array) {
        int largestNumber = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] > largestNumber){
                largestNumber = array[i];
            }
        }
        return largestNumber;
    }
}
