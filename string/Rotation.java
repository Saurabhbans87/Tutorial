/**
 * Create by saurabh
 * Date: 13/04/24
 * Project Name: Tutorial
 */
package string;

public class Rotation {
    public static void main(String[] args)
    {
        String  str = new String("Noida");
        printRotatedString(str);
    }
    static void printRotatedString(String str)
    {
        int n = str.length();
        StringBuffer sb = new StringBuffer(str);
        //sb.append(str);
        for (int i = 0; i < n; i++)
        {
            for (int j=0; j != n; j++)
                System.out.print(sb.charAt(i + j));
            System.out.println();
        }
    }
}
