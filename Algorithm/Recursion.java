/**
 * Create by saurabh
 * Date: 28/12/23
 * Project Name: Tutorial
 */
package Algorithm;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Number");
        int n =5;
        printNumberRecursive(n);
        System.out.println("Factorial of 5 is: "+factorial(5));
    }

    private static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return(n * factorial(n-1));
    }

    private static int printNumberRecursive(int n) {
        System.out.print(n+" ");
        if(n <= 0){
            return 0;
        }else{
            return printNumberRecursive(n-1);
        }
    }
}
