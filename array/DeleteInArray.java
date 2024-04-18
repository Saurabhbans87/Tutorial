/**
 * Create by saurabh
 * Date: 18/04/24
 * Project Name: Tutorial
 */
package array;

public class DeleteInArray {
    public static void main(String[] args) {
        int[] array = {10,15,20,25,28,30};
        int deleteItem = 28;
        int[] newArray = deleteItem(array,deleteItem);
        for(int i=0;i< newArray.length;i++){
            System.out.print(newArray[i] + ",");
        }
    }
    public static int[] deleteItem(int[] array,int deletedItem){
        int[] newArray = new int[array.length - 1];
        for(int i = 0;i< newArray.length;i++){
            if(array[i] == deletedItem){
                newArray[i++] = array[i];
            }else{
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
}
