/**
 * Create by saurabh
 * Date: 17/12/23
 * Project Name: Tutorial
 */
package Algorithm;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-3, 2, -1, 6, 3, -6, 2, -1, -3};
        int maximumSubarraySum = maxSubArrayProblem(arr);
        System.out.println("Kadane’s Algorithm maximum sum of a subarray is: " + maximumSubarraySum);
    }

    private static int maxSubArrayProblem(int[] arr) {
        int max_sum = 0;
        int max_sum_at_index = 0;
        for (int i = 0; i < arr.length; i++){
            max_sum_at_index = max_sum_at_index + arr[i];
            if(max_sum < max_sum_at_index){
                max_sum = max_sum_at_index;
            }
            if(max_sum_at_index < 0){
                max_sum_at_index = 0;
            }
        }
        return max_sum;
    }
}
