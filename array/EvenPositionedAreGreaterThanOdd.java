package array;

import java.util.Arrays;

public class EvenPositionedAreGreaterThanOdd {
    public static void rearrangeEvenGreaterThanOdd(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] < arr[i + 1]) {
                // Swap elements at even and odd positions
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 4, 2, 7, 5, 8};
        System.out.println("Original array: " + Arrays.toString(myArray));

        rearrangeEvenGreaterThanOdd(myArray);

        System.out.println("Array after rearrangement: " + Arrays.toString(myArray));
    }
}
