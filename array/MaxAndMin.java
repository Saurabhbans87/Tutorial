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
        maxAndMIn(array);
        System.out.println(Arrays.toString(array));
    }

    private static void maxAndMIn(int[] array) {
        int max = array.length-1;
        int min=0;
        for(int i=0;i< array.length;i++){
            if(array[i] < max){
                int temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
            max--;
        }
    }
}
