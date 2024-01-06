/**
 * Create by saurabh
 * Date: 06/01/24
 * Project Name: Tutorial
 */
package stack;

import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String str = "INDIA";
        String reverseString = reverseString(str);
        System.out.print(reverseString);
    }

    private static String reverseString(String str) {
        Stack<Character> characterStack = new Stack<>();
        char[] charArray = str.toCharArray();
        for(int i= 0;i<charArray.length;i++){
            characterStack.push(charArray[i]);
        }
        for(int i=0;i<charArray.length;i++){
            charArray[i] = characterStack.pop();
        }
        return new String(charArray);
    }
}
