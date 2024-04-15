/**
 * Create by saurabh
 * Date: 14/04/24
 * Project Name: Tutorial
 */
package string;

public class AllSubstring {
    public static void main(String[] args) {
        String string = "abc";
        getAllSubString(string);
    }
    public static void getAllSubString(String string){
        for(int i=0;i<=string.length();i++){
            for(int j=i+1;j<=string.length();j++){
                System.out.print(string.substring(i,j)+",");
            }
        }
    }
}
