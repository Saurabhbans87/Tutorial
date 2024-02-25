/**
 * Create by saurabh
 * Date: 25/02/24
 * Project Name: Tutorial
 */
package string;

import java.util.ArrayList;
import java.util.List;

public class NaivePatternSearch {
    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";
        List<Integer> indicesList = naivePatternSearchAlgorithm(text, pattern);
        System.out.println(indicesList);
    }

    private static List<Integer> naivePatternSearchAlgorithm(String text, String pattern) {

        List<Integer> indices = new ArrayList<>();

        for(int i = 0;i <= text.length() - pattern.length(); i++){
            int j;
            for(j = 0; j < pattern.length(); j++){
                if(text.charAt(i + j) == pattern.charAt(j)){
                    continue;
                }else{
                    break;
                }
            }
            if(j == pattern.length()){
                indices.add(i);
            }
        }

        return indices;
    }
}
