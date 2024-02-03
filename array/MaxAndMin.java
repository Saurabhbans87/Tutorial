/**
 * Create by saurabh
 * Date: 22/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {3,5,7,8,9,12};
        int max= maxNum(array);
        System.out.println("Max number is " +max);
        int min =minNumber(array);
        System.out.println("Min number is " +min);
    }

    public static int minNumber(int[] array){
        int min = array[0];
        for(int i=1;i< array.length;i++){
            min = Math.min(min,array[i]);
        }
        return min;
    }

    private static int maxNum(int[] array) {
        int max = array[0];
        for(int i=1;i< array.length;i++){
            max = Math.max(max,array[i]);
        }
        return max;
    }


}
