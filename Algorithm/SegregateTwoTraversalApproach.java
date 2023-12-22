/**
 * Create by saurabh
 * Date: 22/12/23
 * Project Name: Tutorial
 */
package Algorithm;

public class SegregateTwoTraversalApproach {
    public static void main(String[] args) {
        int[] array = {0,1,1,1,0,0,0,1,0,1,0,1};
        segregateTwoTraversalApproach(array);
        PrintSegregateTwoTraversalApproach(array);
    }

    private static void PrintSegregateTwoTraversalApproach(int[] array) {
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] +",");
        }
    }

    private static int[] segregateTwoTraversalApproach(int[] array) {
        int zeroCount=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==0){
                zeroCount++;;
            }
        }
        for(int i =0 ;i< array.length ;i++){
            if(zeroCount>0){
                array[i]=0;
                zeroCount--;
            }else {
                array[i]=1;
            }
        }
        return array;
    }
}
