/**
 * Create by saurabh
 * Date: 05/05/24
 * Project Name: Tutorial
 */
package array;

public class LeftAndRightRotation {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
         String leftRotation = leftRotation(str);
         String rightRotation = rightRotation(str);
         System.out.println(leftRotation);
        System.out.println(rightRotation);
    }
    public static String leftRotation(String str){
        String leftRotation = str.substring(2,str.length()-1) + str.substring(0,2);
        return leftRotation;
    }
    public static String rightRotation(String str){
        String rightRotation = str.substring(str.length()-2,str.length()) + str.substring(0,str.length()-2-1);
        return rightRotation;
    }
}
