/**
 * Create by saurabh
 * Date: 13/01/24
 * Project Name: Tutorial
 */
package stack;

import java.util.Stack;

public class NumberReverse {
    public static void main(String[] args) {
        int number =343141;
        //using a while loop
        System.out.println(reverseNumber(number));

        //converting to a string
        String convertinToString = Integer.toString(number);
        StringBuilder stringBuilder = new StringBuilder(convertinToString);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);

        //Using Stack
        String reverseString = Integer.toString(number);
        String s = reverseStringUsingStack(reverseString);
        System.out.println(s);

    }

    private static String reverseStringUsingStack(String reverseString) {
        Stack<Character> characterStack = new Stack<>();
        char[] charArray = reverseString.toCharArray();
        for(char ch:reverseString.toCharArray()){
            characterStack.push(ch);
        }
        for (int i=0;i< reverseString.length();i++){
            charArray[i] = characterStack.pop();
        }
        return new String(charArray);
    }

    private static int reverseNumber(int number) {
        int reverseNumber=0;
        while(number!=0){
            int digit = number%10;
            reverseNumber = reverseNumber*10+digit;
            number =number/10;
        }
        return reverseNumber;
    }


}
