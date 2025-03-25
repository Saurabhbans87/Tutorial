/**
 * Create by saurabh
 * Date: 30/04/24
 * Project Name: Tutorial
 */
package array;

public class InsertInArray2 {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12};
        int position = 2;
        int item = 5;
        insertionElementAtPosition(array,position,item);
        for(int i=0;i< array.length;i++){

        }
    }

    private static void insertionElementAtPosition(int[] array, int position, int item) {
        for(int i = array.length-1;i>=position;i--){
            array[i+1] = array[i];
        }
        array[position] = item;
    }
}
