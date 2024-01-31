/**
 * Create by saurabh
 * Date: 01/02/24
 * Project Name: Tutorial
 */
package sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] array = {8,5,9,2,7,10,9,12};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for(int i=1;i< array.length;i++){
            int temp = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
