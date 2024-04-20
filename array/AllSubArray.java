/**
 * Create by saurabh
 * Date: 20/04/24
 * Project Name: Tutorial
 */
package array;

public class AllSubArray {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        generatingAllSubArray(array);
    }
    public static void generatingAllSubArray(int[] array){
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                System.out.print(array[i+j]+"");
            }
        }
    }
}
