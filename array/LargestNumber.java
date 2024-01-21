/**
 * Create by saurabh
 * Date: 21/01/24
 * Project Name: Tutorial
 */
package array;

public class LargestNumber {
    public static void main(String[] args) {
        int[] array = {23,43,12,32,67,89,98,65,43,79,110};
        int largestNumber = largestNumberIs(array);
        System.out.println("*********************************Largest number is*************************************");
        System.out.println(largestNumber);
        int secondLargeNumber = secondLargestNumber(array);
        System.out.println("*****************************Second Largest number is**********************************");
        System.out.println(secondLargeNumber);
        int thirdLargestNumber = thirdLargestNumber(array);
        System.out.println("*****************************Third Largest number is**********************************");
        System.out.println(thirdLargestNumber);
        System.out.println("************************First Second Third largest Number is***************************");
        firstSecondThirdLargestNumber(array);

    }

    private static void firstSecondThirdLargestNumber(int[] array) {
        int firstNumber = array[0];
        int secondNumber =array[1];
        int thirdNumber = array[2];
        for(int i =0;i<array.length;i++){
            if(array[i] > firstNumber){
                thirdNumber = secondNumber;
                secondNumber = firstNumber;
                firstNumber = array[i];

            } else if (array[i] > secondNumber && array[i] < firstNumber) {
                thirdNumber =secondNumber;
                secondNumber = array[i];
            } else if (array[i] > thirdNumber && array[i] <secondNumber) {
                thirdNumber = array[i];
            }
        }
        System.out.println("First Largest number is " +firstNumber);
        System.out.println("Second Largest number is " +secondNumber);
        System.out.println("Third Largest number is " +thirdNumber);
    }

    private static int thirdLargestNumber(int[] array) {
        int firstLargestNumber = array[0];
        int secondLargestNumber = array[1];
        int thirdLargestNumber = array[2];
        for(int i=0;i<array.length;i++){
            if(array[i] > firstLargestNumber){
                thirdLargestNumber = secondLargestNumber;
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = array[i];
            } else if (array[i] > secondLargestNumber && array[i] < firstLargestNumber ) {
                thirdLargestNumber =  secondLargestNumber;
                secondLargestNumber = array[i];
            } else if (array[i] > thirdLargestNumber && array[i] < secondLargestNumber) {
                thirdLargestNumber = array[i];
            }
        }
        return thirdLargestNumber;
    }

    private static int secondLargestNumber(int[] array) {
        int firstlargestNumber = array[0];
        int secondLargestNumber = array[1];
        for(int i =0;i<array.length;i++){
            if(array[i] > firstlargestNumber){
                secondLargestNumber = firstlargestNumber;
                firstlargestNumber = array[i];
            }
        }
        return secondLargestNumber;
    }

    private static int largestNumberIs(int[] array) {
        int largestNumber = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] > largestNumber){
                largestNumber = array[i];
            }
        }
        return largestNumber;
    }
}
