/**
 * Create by saurabh
 * Date: 03/02/24
 * Project Name: Tutorial
 */
package array;

import java.util.Arrays;

public class MinMaxInPair {
    long max;
    long min;

    public MinMaxInPair(long max, long min) {
        this.max = max;
        this.min = min;
    }
    static MinMaxInPair maxAndMin(long[] array, long length) {
        Arrays.sort(array);
        long max = array[array.length-1];
        long min = array[0];
        return new MinMaxInPair(max,min);
    }

    public static void main(String[] args) {
        long[] array = {12,43,25,64,78,69};
        long length = array.length;
        MinMaxInPair minMaxInPair = maxAndMin(array, length);
        System.out.println(minMaxInPair.max);
        System.out.println(minMaxInPair.min);
    }
}
