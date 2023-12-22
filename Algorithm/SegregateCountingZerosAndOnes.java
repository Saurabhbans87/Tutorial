/**
 * Create by saurabh
 * Date: 22/12/23
 * Project Name: Tutorial
 */
package Algorithm;

public class SegregateCountingZerosAndOnes {
    public static void main(String[] args) {
        int[] array ={0,1,0,0,1,1,1,0,0,0,0,1};
        countingZerosAndOnes(array);
        printZerosAndOnes(array);
    }
    private static void printZerosAndOnes(int[] array) {
        for(int i=0;i< array.length;i++){
            System.out.print(array[i] +",");
        }
    }
    private static int[] countingZerosAndOnes(int[] array) {
        int length = array.length;
        int zeroCount = 0;
        for(int i=0; i <length; i++){
            if(array[i] == 0){
                zeroCount++;
            }
        }
        for (int i=0 ; i<zeroCount ;i++){
            array[i] = 0;
        }
        for(int i = zeroCount ; i<length ;i++){
            array[i] = 1;
        }
        return array;
    }
}
