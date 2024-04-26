/**
 * Create by saurabh
 * Date: 20/04/24
 * Project Name: Tutorial
 */
package array;

import java.util.HashMap;
import java.util.Map;

public class LengthEncodind {
    public static void main(String[] args) {
        String str = "AAAABBBCCDAA";
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(characterIntegerMap.containsKey(str.charAt(i))){
                characterIntegerMap.put(str.charAt(i),characterIntegerMap.get(str.charAt(i))+1);
            }else{
                characterIntegerMap.put(str.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry : characterIntegerMap.entrySet()){
            System.out.print(entry.getValue()+""+entry.getKey());
        }
    }
}
