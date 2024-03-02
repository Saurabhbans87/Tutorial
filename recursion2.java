/**
 * Create by saurabh
 * Date: 02/03/24
 * Project Name: Tutorial
 */

public class recursion2 {
    public static void main(String[] args) {
        int n = 10;
        int number = fibonacchiSeries(n);
        for(int i=0;i<n;i++){
            System.out.println(fibonacchiSeries(i));
        }
    }

    private static int fibonacchiSeries(int n) {
        if(n==0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int left = fibonacchiSeries(n-1);
        int right = fibonacchiSeries(n-2);
        return left+right;
    }
}
