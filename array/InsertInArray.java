/**
 * Create by saurabh
 * Date: 18/04/24
 * Project Name: Tutorial
 */
package array;

public class InsertInArray {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12};
        int position = 2;
        int item = 5;
        int[] newArray = insertElementAtPosition(array,position,item);
        for(int i=0;i< newArray.length;i++){
            System.out.print(newArray[i]+",");
        }
    }
    public static int[] insertElementAtPosition(int[] array,int position,int item){
        int[] newArray = new int[array.length+1];
        for(int i=0; i<position ;i++){
            newArray[i] = array[i];
        }
        newArray[position] = item;

        for(int i = position;i< array.length;i++){
            newArray[i+1] = array[i];
        }
        return newArray;
    }
}
