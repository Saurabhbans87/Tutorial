/**
 * Create by saurabh
 * Date: 01/01/24
 * Project Name: Tutorial
 */
package Algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {12,23,25,36,48,49,52,58,60,65,78,82};
        int key = 36;
        int index = binarySearchAlgorithm(array, key);
        if(index == -1){
            System.out.print("Element not found");
        }else{
            System.out.println("Element is found at " +index);
        }
    }

    private static int binarySearchAlgorithm(int[] array, int key) {
        int first = 0;
        int last =array.length-1;
        while (first <= last){
            int mid = first + (last-first)/2;
            if(array[mid] == key){
                return mid;
            }else if(array[mid] < key){
                first = mid + 1;
            }else{
                last = mid -1;
            }
        }
        return -1;
    }
}
