/**
 * Create by saurabh
 * Date: 25/02/24
 * Project Name: Tutorial
 */
package string;

import java.util.ArrayList;
import java.util.List;

public class NaivePatternSearch2 {
    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";
        List<Integer> indicesList = naivePatternSearchAlgorithm(text, pattern);
        System.out.println(indicesList);
    }

    private static List<Integer> naivePatternSearchAlgorithm(String text, String pattern) {
        List<Integer> indices = new ArrayList<>();
        int textLength = text.length();
        int patternLength = pattern.length();
        for(int i=0 ; i <= textLength-patternLength;i++){
            int j;
            for(j=0;j<patternLength;j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }
            if(j==patternLength){
                indices.add(i);
            }
        }
        return indices;
    }
}
