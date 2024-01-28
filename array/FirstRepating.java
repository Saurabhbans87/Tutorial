/**
 * Create by saurabh
 * Date: 28/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.HashSet;
import java.util.Set;

public class FirstRepating {
    public static void main(String[] args) {
        int[] array = {12,10,14,15,12,20,24,30,35};
        firstRepatingElement(array);
    }

    private static void firstRepatingElement(int[] array) {
        Set<Integer> integerSet = new HashSet<>();
        for(int i=0;i< array.length;i++){
            if(!integerSet.add(array[i])){
                System.out.println("Reapting element is " +array[i]);
            }
        }
    }
}
