/**
 * Create by saurabh
 * Date: 20/04/24
 * Project Name: Tutorial
 */
package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KMostOccuring {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 4, 5, 2, 6, 1};
        int k = 2;
        int key = kMostOccuringElementIs(array, k);
        System.out.println(key);
    }
    public static int kMostOccuringElementIs(int[] array,int k){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i< array.length;i++){
            if(hashMap.containsKey(array[i])){
                hashMap.put(array[i], hashMap.get(array[i])+1 );
            }else{
                hashMap.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            if (e.getValue() == 2)
                return e.getKey();

        }
        return -1;
    }
}
