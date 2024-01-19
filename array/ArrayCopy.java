/**
 * Create by saurabh
 * Date: 19/01/24
 * Project Name: Tutorial
 */
package array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        int[] arrayCopy = array;
        for (int arr:arrayCopy) {
            System.out.print(arr+",");
        }
        System.out.println("");
        for(int i=0;i< arrayCopy.length;i++){
            System.out.print(arrayCopy[i]+",");
        }
        array[0] = 9;
        System.out.println("");
        System.out.println("Both array pointing the same object");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println("");
        System.out.println("Both array pointing the same object");
        for(int i=0;i< arrayCopy.length;i++){
            System.out.print(arrayCopy[i]+",");
        }
    }
}
