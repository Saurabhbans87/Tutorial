/**
 * Create by saurabh
 * Date: 13/04/24
 * Project Name: Tutorial
 */
package string;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String string = "Noida";
        String reverseString = new StringBuffer(string).reverse().toString();
        System.out.println(reverseString);

        String reverseStringUsingStack = usingStackReverseString(string.toCharArray());
        System.out.println(reverseStringUsingStack);

        String reverseStringUisngLoop = usingLoopReverseString(string);
        System.out.println(reverseStringUisngLoop);

        String reverseStringUsingTwoPointer = reverseStringUsingTwoPointer(string);
        System.out.println(reverseStringUsingTwoPointer);
    }

    public static String usingStackReverseString(char[] str){
        Stack<Character> characterStack = new Stack<>();

        for(int i=0 ;i< str.length ; i++){
            characterStack.push(str[i]);
        }
        for(int i=0;i<str.length;i++){
            str[i] = characterStack.peek();
            characterStack.pop();
        }
        return String.valueOf(str);
    }

    public static String usingLoopReverseString(String str){
        String reverseString ="";
        for(int i = str.length()-1 ; i>=0;i--){
            reverseString = reverseString + str.charAt(i);
        }
        return reverseString;
    }

    public static String reverseStringUsingTwoPointer(String str){
        char[] chr = str.toCharArray();
        int len = str.length();
        for(int i =0,j=len-1;i<j;i++,j--){
            char temp = chr[i];
            chr[i] = chr[j];
            chr[j] = temp;
        }
        return String.valueOf(chr);
    }
}
