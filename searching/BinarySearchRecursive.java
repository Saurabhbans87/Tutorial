/**
 * Create by saurabh
 * Date: 26/01/24
 * Project Name: Tutorial
 */
package searching;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] array = {12,14,23,26,28,35,40,45,48,50,56,58,65,70};
        int searchElement = 56;
        int left = 0;
        int right = array.length-1;
        int index = searchUsingBinaryRecursiveWay(array, searchElement,left,right);
        if(index == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found at " +index);
        }
    }

    private static int searchUsingBinaryRecursiveWay(int[] array, int searchElement, int left, int right) {
        while (left <= right){
            int mid = left + (right - left) /2;
            if(array[mid] == searchElement){
                return mid;
            } else if (array[mid] < searchElement) {
                return searchUsingBinaryRecursiveWay(array,searchElement,mid+1,right);
            }else{
                return searchUsingBinaryRecursiveWay(array,searchElement,left,mid-1);
            }
        }
        return searchElement;
    }


}
