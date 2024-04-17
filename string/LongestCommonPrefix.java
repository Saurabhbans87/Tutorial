/**
 * Create by saurabh
 * Date: 14/04/24
 * Project Name: Tutorial
 */
package string;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"geeksforgeeks”, “geeks”, “geek”, “geezer"};
        System.out.println(str.length);
        List<Character> list = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            list.add(str[i].charAt(i));
        }
        System.out.println(list);
    }
}
