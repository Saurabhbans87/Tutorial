/**
 * Create by saurabh
 * Date: 03/02/24
 * Project Name: Tutorial
 */
package array;

import java.util.HashMap;

public class CountOccurence {
    public static void main(String[] args) {
        int[] array = {2,3,5,6,6,6,6,6,6,6,8,9};
        int k= 6;
        //int count = count(array, k);
        //System.out.println(count);
        int count = countWithHashMap(array,k);
        System.out.println(count);
    }

    private static int countWithHashMap(int[] array, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i< array.length;i++){
            if(hashMap.containsValue(k)){
                hashMap.put(k,hashMap.get(k)+1);
            }
        }
        int count = hashMap.get(k);
        return count;
    }

    private static int count(int[] array, int k) {
        int count =0;
        for(int i=0;i< array.length;i++){
            if(array[i]  == k){
                count++;
            }
        }
        return count;
    }
}
