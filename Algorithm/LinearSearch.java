/**
 * Create by saurabh
 * Date: 31/12/23
 * Project Name: Tutorial
 */
package Algorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {12,13,42,16,76,43,28,27,97,45};
        int key =100;
        int index = linearSearch(array, key);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index " +index);
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
