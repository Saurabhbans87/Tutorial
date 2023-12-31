/**
 * Create by saurabh
 * Date: 31/12/23
 * Project Name: Tutorial
 */
package Algorithm;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {12,13,42,16,76,43,28,27,97,45};
        int key =100;
        //Time Complexity is O(n) as we need to traverse the complete array in worst case
        //Space Complexity is O(1) no extra memory is used to allocate the array.
        int index = linearSearch(array, key);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index " +index);
        }
        //Time Complexity is O(n) as we need to traverse the complete array in worst case
        // but in average case i t would be more efficent
        //Space Complexity is O(1) no extra memory is used to allocate the array.
        int sortedIndex = sortedLinearSearch(array, key);
        if(sortedIndex == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index " +sortedIndex);
        }
    }

    private static int sortedLinearSearch(int[] array, int key) {
        Arrays.sort(array);
        for (int i=0; i < array.length-1; i++){
            if(array[i] == key){
                return i;
            }
            if(array[i] > key){
                return -1;
            }
        }
        return -1;
    }

    private static int linearSearch(int[] array, int key) {
        for (int i=0; i < array.length-1; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}
