/**
 * Create by saurabh
 * Date: 02/03/24
 * Project Name: Tutorial
 */

public class RecursionUsingDynamic {
    public static void main(String[] args) {
        int n = 5;
        int[] table = new int[n];
        int[] ints = fibonacchiSeriesDynamic(table, n);
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }

    }
    private static int[] fibonacchiSeriesDynamic(int[] table, int n) {
        table[0] = 0;
        table[1] = 1;
        for(int i=2;i<n;i++){
            table[i] = table[i-1]+table[i-2];
        }
        return table;
    }
}
