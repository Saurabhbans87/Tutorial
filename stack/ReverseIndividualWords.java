/**
 * Create by saurabh
 * Date: 13/01/24
 * Project Name: Tutorial
 */
package stack;

import java.util.Stack;

public class ReverseIndividualWords {
    public static void main(String[] args) {
        String str = "Hello World Java";
        reverseIndividualWords(str);
    }

    private static void reverseIndividualWords(String str) {
        Stack<Character> characterStack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !=' '){
                characterStack.push(str.charAt(i));
            }else{
                while(!characterStack.isEmpty()){
                    System.out.print(characterStack.pop());
                }
                System.out.print(" ");
            }
        }
        while(!characterStack.isEmpty()){
            System.out.print(characterStack.pop());
        }
    }
}
