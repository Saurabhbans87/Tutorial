/**
 * Create by saurabh
 * Date: 22/01/24
 * Project Name: Tutorial
 */
package array;

public class ZeorAndOne {
    public static void main(String[] args) {
        int[] array ={2,3,0,5,0,6,9,0};
        moveZeorAtend(array);
        for (int arr:array) {
            System.out.print(arr+",");
        }
    }

    private static void moveZeorAtend(int[] array) {
        int left =0;
        int right =0;
        int length = array.length;
        for(int i=0;i<length;i++){
            if(array[i] !=0){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
            }
            right++;
        }
    }

}
