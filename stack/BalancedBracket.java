/**
 * Create by saurabh
 * Date: 13/01/24
 * Project Name: Tutorial
 */
package stack;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        String str ="[{(}]";
        boolean areBalanced = areBalancedBracket(str);
        System.out.println("Balanced " +areBalanced);
    }

    private static boolean areBalancedBracket(String str) {
        char[] character=str.toCharArray();
        Stack<Character> charStack = new Stack<>();
        for (char ch: character) {
            if(ch=='[' || ch=='{' || ch=='(' ){
                charStack.push(ch);
            } else if (ch==']' && !charStack.isEmpty() && charStack.peek() == '[') {
                charStack.pop();
            } else if (ch=='}' && !charStack.isEmpty() && charStack.peek() == '{') {
                charStack.pop();
            }else if (ch==')' && !charStack.isEmpty() && charStack.peek() == '(') {
                charStack.pop();
            }else{
                return false;
            }
        }
        return true;
    }
}
