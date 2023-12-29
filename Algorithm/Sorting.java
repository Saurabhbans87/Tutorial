/**
 * Create by saurabh
 * Date: 28/12/23
 * Project Name: Tutorial
 */
package Algorithm;

import java.sql.Array;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int array[] ={12,10,30,42,25,37,32,40,18,24};
        selectionSortingAlgorithm(array);
    }

    private static int[] selectionSortingAlgorithm(int[] array) {
        int length = array.length;
        int smallestNumber = array[0];
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            if(array[i] < smallestNumber){
                smallestNumber=array[i];
                if(array[i] > smallestNumber){
                    int temp = array[i];
                    array[i] = smallestNumber;
                    smallestNumber = temp;
                }
            }
        }
        return array;
    }
}
