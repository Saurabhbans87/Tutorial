/**
 * Create by saurabh
 * Date: 03/05/24
 * Project Name: Tutorial
 */
package array;

public class MinMaxInSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, -1, 7, -3, -1, -2};
        int k = 4;
        int sum =minMaxSum(arr, k);
        System.out.println(sum);
    }

    private static int minMaxSum(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length - k; i++) {
            int min = arr[0];
            int max = arr[1];
            for (int j = i; j < k; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            sum = sum + min + max;
        }
        return sum;
    }
}
