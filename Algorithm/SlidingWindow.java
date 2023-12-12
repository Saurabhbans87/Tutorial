package Algorithm;

/**
 * Create by saurabh
 * Date: 12/12/23
 * Project Name: Tutorial
 */

public class SlidingWindow {
    public static int maxSubarraySum(int[] arr, int k) {
        if (k > arr.length) {
            return -1; // Invalid input
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i]; // Calculate sum of the first window
        }
        int maxSum = windowSum;

        for (int i = 1; i <= arr.length - k; i++) {
            windowSum = windowSum - arr[i - 1] + arr[i + k - 1]; // Slide the window
            maxSum = Math.max(maxSum, windowSum); // Update the maximum sum
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int k = 3;
        int result = maxSubarraySum(arr, k);
        System.out.println("The maximum sum of a subarray of size " + k + " is: " + result);
    }
}
