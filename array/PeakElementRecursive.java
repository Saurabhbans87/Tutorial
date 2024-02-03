/**
 * Create by saurabh
 * Date: 03/02/24
 * Project Name: Tutorial
 */
package array;

public class PeakElementRecursive {
    public static void main(String[] args) {
        int[] array = {9,5,10,9,12,7,18,20,15};
        int length = array.length;
        peakElementRecursive(array,0,length-1,length);
    }

    private static void peakElementRecursive(int[] array, int low, int high, int length) {

        int mid = low + (high-low)/2;
        if(array[mid] >= array[mid+1] +1 && array[mid] <= array[mid-1]){
            System.out.println(array[mid]);
        } else if (array[mid-1] >array[mid]) {
            peakElementRecursive(array,low,mid-1,length);
        } else {
            peakElementRecursive(array,mid+1,high,length);
        }

    }

}
