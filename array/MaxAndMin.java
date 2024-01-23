/**
 * Create by saurabh
 * Date: 22/01/24
 * Project Name: Tutorial
 */
package array;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {3,5,7,8,9,12};
        maxAndMIn(array);
    }

    private static void maxAndMIn(int[] array) {
        int max =0;
        int min=0;
        for(int i=0;i< array.length;i++){
            if(array[i] > max){
                int temp = array[max];
                array[min] = array[max];
                array[max] = temp;

            }
        }
    }
}
