/**
 * Create by saurabh
 * Date: 26/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.Arrays;

public class MaxAndMinUsingTwoPointerTechnique {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        maxAndMinUsingTwoPointerTechnique(array);
        System.out.println(Arrays.toString(array));
    }

    private static void maxAndMinUsingTwoPointerTechnique(int[] array) {
        int first = 0;
        int last = array.length - 1;
        while(first < last){
            if(last > first){
                int temp = array[first];
                array[first] = array[last];
                array[last] = temp;
            }
            first++;
            last--;
        }
    }
}
