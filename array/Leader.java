/**
 * Create by saurabh
 * Date: 23/01/24
 * Project Name: Tutorial
 */
package array;

public class Leader {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2,7,8};
        leaderElement(array);
    }

    private static void leaderElement(int[] array) {
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i] <= array[j]){
                   break;
                }
                if(j== array.length){
                    System.out.print(array[i]+" ");
                }
            }
        }
    }
}
