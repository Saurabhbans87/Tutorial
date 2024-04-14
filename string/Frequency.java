/**
 * Create by saurabh
 * Date: 13/04/24
 * Project Name: Tutorial
 */
package string;

import java.util.Map;
import java.util.TreeMap;

public class Frequency {
    public static void main(String[] args) {
        String string = "aaaasdssddsdaaaahhkhk";
        frequencyOfEachCharacter(string);
    }

    private static void frequencyOfEachCharacter(String string) {
        Map<Character,Integer> characterIntegerMap = new TreeMap<>();
        for(int i=0 ;i<string.length() ; i++){
            if(characterIntegerMap.containsKey(string.charAt(i))){
                characterIntegerMap.put(string.charAt(i),characterIntegerMap.get(string.charAt(i))+1);
            }else{
                characterIntegerMap.put(string.charAt(i),1);
            }
        }
        System.out.println("All character in string with their frequency :");
        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}
