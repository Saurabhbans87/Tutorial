/**
 * Create by saurabh
 * Date: 21/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.HashMap;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] array = {12,34,23,54,34,67,76,89,47};
        int duplicate = duplicateElementIs(array);
        System.out.print("Duplicate element is " +duplicate);
    }

    private static int duplicateElementIs(int[] array) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int arr:array) {
            if(hashMap.containsValue(arr)){
                return arr;
            }else{
                hashMap.put(arr,arr);
            }
        }
        return 0;
    }
}
