/**
 * Create by saurabh
 * Date: 26/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,10};
        segerateEvenAndOdd(array);
        System.out.println(Arrays.toString(array));
    }

    private static void segerateEvenAndOdd(int[] array) {
        int left =0;
        int right =0;
        int length = array.length;
        for(int i=0;i<length;i++){
            if(array[i]%2 == 0){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
            }
            right++;
        }

    }
}
