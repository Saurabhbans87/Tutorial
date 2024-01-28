/**
 * Create by saurabh
 * Date: 26/01/24
 * Project Name: Tutorial
 */
package searching;

public class LinearSerach {
    public static void main(String[] args) {
        int[] array = {3,2,12,34,56,76,43,17,76,90};
        int searchElement = 76;
        int index = searchElement(array, searchElement);
        if(index == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found at " +index);
        }
    }

    private static int searchElement(int[] array, int searchElement) {
        for(int i=0;i<array.length;i++){
            if(array[i] == searchElement){
                return i;
            }
        }
        return -1;
    }
}
