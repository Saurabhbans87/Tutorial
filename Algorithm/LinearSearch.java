/**
 * Create by saurabh
 * Date: 31/12/23
 * Project Name: Tutorial
 */
package Algorithm;

import java.util.Arrays;
import java.util.HashSet;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {12,13,42,16,76,43,28,27,97,45};
        int key =97;
        //Time Complexity is O(n) as we need to traverse the complete array in worst case
        //Space Complexity is O(1) no extra memory is used to allocate the array.
        int index = linearSearch(array, key);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index " +index);
        }
        hashTableLinearSearch(array, key);
    }

    private static void hashTableLinearSearch(int[] array, int key) {
        HashSet hashSet = new HashSet();
        for (int i =0; i< array.length -1 ;i++){
            if(hashSet.contains(array[i])){
                System.out.println("Key found at " +i);
            }else{
                hashSet.add(array[i]);
            }
        }
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
