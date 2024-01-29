/**
 * Create by saurabh
 * Date: 26/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] array = {2,4,1,6,8,3,5,8,9};
        int givenSum = 11;
        subArrayWithGivenSum(array,givenSum);
    }

    private static void subArrayWithGivenSum(int[] array,int givenSum) {
        Arrays.sort(array);
        int first = 0;
        int last = array.length-1;
        while(first < last){
            if(array[first] + array[last] == givenSum){
                System.out.println(array[first] +" && " +array[last]);
                first++;
                last--;
            } else if (array[first] + array[last] == givenSum) {
                last--;
            }else{
                first++;
            }
        }
    }
}
