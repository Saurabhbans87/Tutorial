/**
 * Create by saurabh
 * Date: 13/04/24
 * Project Name: Tutorial
 */
package string;

public class StringRotation {
    public static void main(String[] args) {
        String string = "asdfgdfhjkagfk";
        int d = 2;
        System.out.println("*************Original String************");
        System.out.println(string);

        String leftRotation= leftRotation(string,d);
        System.out.println(leftRotation);

        String rightRotation= rightRotation(string,d);
        System.out.println(rightRotation);
    }

    public static String leftRotation(String str,int d){
        String first = str.substring(0,d);
        String second = str.substring(d,str.length());
        String leftString = second + first;
        return leftString;
    }

    public static String rightRotation(String str,int d){
        String first = str.substring(str.length()-d,str.length());
        String second = str.substring(0,str.length()-d);
        String leftString = first + second;
        return leftString;
    }
}
