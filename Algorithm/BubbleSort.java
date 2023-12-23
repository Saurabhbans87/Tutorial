/**
 * Create by saurabh
 * Date: 23/12/23
 * Project Name: Tutorial
 */
package Algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12,34,23,18,19,10,45,56,32,43,67,15,76};
        bubbleSortAlgorithm(array);
        printBubbleSortAlgorithm(array);
    }

    private static void printBubbleSortAlgorithm(int[] array) {
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+",");
        }
    }

    private static int[] bubbleSortAlgorithm(int[] array) {
        for(int i=0;i < array.length-1;i++){
            for(int j=0; j< array.length-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
