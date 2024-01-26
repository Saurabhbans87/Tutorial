/**
 * Create by saurabh
 * Date: 26/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.Arrays;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int[] array = {3,5,0,2,0,12,54,0,6,32,0,0,43,76};
        moveZeroToEnd(array);
        System.out.println(Arrays.toString(array));
    }

    private static void moveZeroToEnd(int[] array) {
        int nonZerorIndex = 0;
        for(int i=0; i< array.length;i++){
            if(array[i] != 0){
                array[nonZerorIndex] = array[i];
                nonZerorIndex++;
            }
        }
        while(nonZerorIndex< array.length){
            array[nonZerorIndex] = 0;
            nonZerorIndex++;
        }
    }
}
