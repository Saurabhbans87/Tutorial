package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class BruteForceAlgorithm {
    
    public static List<List<Integer>> findPairsWithSum(int[] arr, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        
        // Iterate through all pairs of elements
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    pairs.add(pair);
                }
            }
        }
        
        return pairs;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9,12};
        int target = 7;
        List<List<Integer>> pairs = findPairsWithSum(arr, target);
        
        if (pairs.isEmpty()) {
            System.out.println("No pairs found with sum equal to " + target);
        } else {
            System.out.println("Pairs with sum equal to " + target + ":");
            for (List<Integer> pair : pairs) {
                System.out.println(pair.get(0) + ", " + pair.get(1));
            }
        }
    }
}
