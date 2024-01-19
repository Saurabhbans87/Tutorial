/**
 * Create by saurabh
 * Date: 19/01/24
 * Project Name: Tutorial
 */
package array;

import java.util.Arrays;
        /*
        1) Using for loop
        2) Using Arrays.copyOf() method
        3) Using System.arraycopy() method
        4) Using clone() method
         */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        int[] arrayCopy = array;
        for (int arr:arrayCopy) {
            System.out.print(arr+",");
        }
        System.out.println("");
        for(int i=0;i< arrayCopy.length;i++){
            System.out.print(arrayCopy[i]+",");
        }
        array[0] = 9;
        System.out.println("");
        System.out.println("Both array pointing the same object");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println("");
        System.out.println("Both array pointing the same object");
        for(int i=0;i< arrayCopy.length;i++){
            System.out.print(arrayCopy[i]+",");
        }
        System.out.println("*************************Copying An Array Using for Loop********************************");
        int[] a = {12, 21, 0, 5, 7};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        a[2] = 56;
        System.out.println(b[2]);
        b[4] = 100;
        System.out.println(a[4]);

        System.out.println("*************************Copying An Array Using copyOf method********************************");
        int[] c = {12, 21, 0, 5, 7};
        int[] d = Arrays.copyOf(c,c.length);
        for (int i = 0; i < a.length; i++)
        {
            d[i] = d[i];
        }
        d[2] = 56;
        System.out.println(d[2]);
        System.out.println(c[2]);
        d[4] = 100;
        System.out.println(d[4]);
        System.out.println(c[4]);
        System.out.println("*************************Copying An Array Using clone method********************************");
        int[] e = {12, 21, 0, 5, 7};
        int[] f = e.clone();
        for (int i = 0; i < a.length; i++)
        {
            f[i] = e[i];
        }
        f[2] = 56;
        System.out.println(f[2]);
        System.out.println(e[2]);
        e[4] = 100;
        System.out.println(e[4]);
        System.out.println(f[4]);
        System.out.println("*************************Copying An Array Using System.arraycopy method********************************");
        int[] g = {12, 21, 0, 5, 7};
        int[] h = new int[g.length];
        System.arraycopy(g,0,h,0,g.length);
        for (int i = 0; i < a.length; i++)
        {
            h[i] = g[i];
        }
        g[2] = 56;
        System.out.println(g[2]);
        System.out.println(h[2]);
        h[4] = 100;
        System.out.println(g[4]);
        System.out.println(h[4]);
    }
}
