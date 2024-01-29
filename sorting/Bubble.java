/**
 * Create by saurabh
 * Date: 30/01/24
 * Project Name: Tutorial
 */
package sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] array = {8,6,9,5,4,2,3};
        bubbleSorting(array);
        System.out.println("Bubble Sorting");
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSorting(int[] array) {
        for(int i=0;i< array.length-1;i++){
            for(int j=0;j< array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
