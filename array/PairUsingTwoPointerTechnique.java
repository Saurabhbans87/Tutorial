/**
 * Create by saurabh
 * Date: 26/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.Arrays;

public class PairUsingTwoPointerTechnique {
    public static void main(String[] args) {
        int[] array = {12,23,15,34,25,15,20,35,40,5,10};
        int targetSum = 40;
        pairUsingTwoPointerTechnique(array,targetSum);
    }

    private static void pairUsingTwoPointerTechnique(int[] array, int targetSum) {
        Arrays.sort(array);
        int first = 0;
        int last =array.length-1;

        while(first < last){
            if(array[first] + array[last] == targetSum){
                System.out.println("Pair is " + array[first] +"&& " +array[last]);
                first++;
                last--;
            } else if (array[first] + array[last] > targetSum) {
                last--;
            }else {
                first++;
            }
        }
    }
}
