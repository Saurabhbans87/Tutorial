/**
 * Create by saurabh
 * Date: 14/01/24
 * Project Name: Tutorial
 */
package stack;

public class DecemialToBinary {
    public static void main(String[] args) {
        int numebr =8;
        decimalToBinary(numebr);
        System.out.println("------------------------------");
        customDecimalToBinary(numebr);
    }

    private static void customDecimalToBinary(int numebr) {
        int[] binary = new int[1000];
        int i=0;
        while(numebr > 0){
            binary[i] = numebr%2;
            numebr = numebr/2;
            i++;
        }
        for(int j = i-1;j >= 0;j--){
            System.out.print(binary[i]);
        }
    }

    private static void decimalToBinary(int numebr) {
        for (int i=1;i <= numebr; i++){
            String binaryString = Integer.toBinaryString(i);
            System.out.println(binaryString);
        }
    }
}
