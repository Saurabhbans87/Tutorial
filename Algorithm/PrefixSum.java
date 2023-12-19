/**
 * Create by saurabh
 * Date: 19/12/23
 * Project Name: Tutorial
 */
package Algorithm;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 5};
        int[] ints = prefixSumAlgorithm(arr);
        for (int j=0;j< ints.length;j++){
            System.out.println(ints[j] +" ");
        }
    }

    private static int[] prefixSumAlgorithm(int[] arr) {
        int[] prefixSum =new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1; i< arr.length;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }
}
