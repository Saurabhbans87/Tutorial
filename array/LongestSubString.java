/**
 * Create by saurabh
 * Date: 20/04/24
 * Project Name: Tutorial
 */
package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "ABCDEFGABEF";
        int longestSubStringLength = longestSubStringWithoutRepeating(str);
        System.out.println(longestSubStringLength);
    }
    public static int longestSubStringWithoutRepeating(String str){
        Set set = new HashSet();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        return set.size();
    }
}
