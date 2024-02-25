/**
 * Create by saurabh
 * Date: 25/02/24
 * Project Name: Tutorial
 */
package string;

import java.util.Stack;

public class Reduce {
    public static void main(String[] args) {
        String str = "qddxxxd";
        int k = 3;
        String s = reduceStringByK(str, k);
        System.out.println(s);
    }

    private static String reduceStringByK(String str, int k) {
        Stack<Character> characterStack = new Stack<>();
        int i=0;
        while(i<str.length()){
            char ch = str.charAt(i++);
            characterStack.push(ch);
            int count = 0;
            while(characterStack.size() > 0 && characterStack.peek() == ch){
                count++;
                characterStack.pop();
            }
            if(count == k){
                continue;
            }else{
                while(count>0){
                    characterStack.push(ch);
                    count--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : characterStack)
            sb = sb.append(ch);
        return sb.toString();
    }
}
