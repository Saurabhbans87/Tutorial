/**
 * Create by saurabh
 * Date: 28/01/24
 * Project Name: Tutorial
 */
package array;

public class CloseToZero {
    public static void main(String[] args) {
        int[] array = {-2,-1,0,3,1,4,-5,-4};
        closeTozeor(array);
    }

    private static void closeTozeor(int[] array) {
        int zeorSum = 0;
        int closeToZeorSum = 0;
        int first =array[0];
        int second =array[0];
        for(int i=0; i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i] + array[j] <= zeorSum){
                    closeToZeorSum = zeorSum;
                    first =array[i];
                    second= array[j];
                }
            }
        }
        System.out.println(first +" " +second);
    }
}
