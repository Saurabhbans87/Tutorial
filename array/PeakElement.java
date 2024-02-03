/**
 * Create by saurabh
 * Date: 03/02/24
 * Project Name: Tutorial
 */
package array;

public class PeakElement {
    public static void main(String[] args) {
        int[] array = {9,5,10,9,12,7,18,20,15};
        int[] arr = {1,2,3};
        int index = peakElementIndex(arr);
        System.out.println(index);
    }

    public static int peakElementIndex(int[] arr)
    {
        //add code here.
        for(int i = 1;i < arr.length-1;i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return i;
            }
        }
        return 0;
    }

    private static void peakElement(int[] array) {
        if(array.length == 1){
            System.out.println("Not valid");
        }
        if(array[0] > array[1]){
            System.out.println(array[0]);
        }
        if(array[array.length-1]> array[array.length-2]){
            System.out.println(array[array.length-1]);
        }
        for(int i=1;i< array.length-1;i++){
            if(array[i] > array[i-1] && array[i] > array[i+1]){
                System.out.println(array[i]);
            }
        }
    }
}
