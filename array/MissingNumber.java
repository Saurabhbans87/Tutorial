/**
 * Create by saurabh
 * Date: 28/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7,8,9};
        //missingNumber(array);
        int[] array1 = {12,10,14,8,9,13,15,25,22,25};
        //missingNumberTwoPointer(array1);
        missingNumberChecking(array);
    }

    private static void missingNumberChecking(int[] array) {
        System.out.print("and the missing element is ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                System.out.println(i + 1);
        }
    }

    private static void missingNumberTwoPointer(int[] array) {
        int first =0;
        int last =array.length-1;
        Arrays.sort(array);
        while(first <=last){
            if(array[first] ==array[last] ){
                System.out.println("Repeating element is " +array[first]);
            }
            last--;
        }
    }

    private static void missingNumber(int[] array) {
        for(int i=0;i< array.length;i++){
            if(array[i] != i+1){
                System.out.println("Missing numebr is " +array[i]);
                break;
            }
        }
    }
}
