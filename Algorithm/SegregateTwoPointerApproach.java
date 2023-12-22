/**
 * Create by saurabh
 * Date: 22/12/23
 * Project Name: Tutorial
 */
package Algorithm;

public class SegregateTwoPointerApproach {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,0,0,0,0,1,0,1,0};
        segregateTwoPointerApproach(array);
        printSegregateTwoPointerApproach(array);
    }

    private static void printSegregateTwoPointerApproach(int[] array) {
        for(int i=0;i< array.length;i++){
            System.out.print(array[i] +",");
        }
    }

    private static void segregateTwoPointerApproach(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left<right){
            while (array[left] == 0 && left <= right) {
                left++; // Move left pointer until a 1 is found
            }
            while (array[right] == 1 && left <= right) {
                right--; // Move right pointer until a 0 is found
            }
            if (left <= right) {
                // Swap elements at left and right pointers
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}
