/**
 * Create by saurabh
 * Date: 09/03/24
 * Project Name: Tutorial
 */
package Algorithm;

public class SlidingWindow2 {
    public static void main(String[] args) {
        int[] array = {2,3,5,6,8,9,12,14};
        int k = 3;
        int maxSum = maximumSum(array,k);
        System.out.println("Max Sum is " +maxSum);
    }

    private static int maximumSum(int[] array, int k) {
        if(k > array.length){
            return -1;
        }
        int maxSum;
        int windowSum = 0;
        for(int i =0; i< k;i++){
            windowSum += array[i];
        }
        maxSum = windowSum;
        for(int i =k;i< array.length;i++){
            windowSum += array[i] - array[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
