package day31maps;

import java.util.HashMap;
import java.util.Map;

public class TekrarMaps01 {
    public static void main(String[] args) {
        //Example:1 verilen 1 string'de hangi harfin kac defa tekrarlandigini gosteren methodu yaziniz
        //"Hello Henry!" ==> H=2, e=2 l=2, a=1 ,n=1, r=1, y=1


        String input = "Hello Henry!";
        Map<Character, Integer> characterCount = countCharacters(input);
        System.out.println(characterCount);
    }

    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> characterCount = new HashMap<>();

        // Diziyi karakterlere ayır
        char[] characters = input.toCharArray();

        // Her bir karakterin sayısını say
        for (char c : characters) {
            if (Character.isLetter(c)) { // Sadece harfleri saymak için
                c = Character.toLowerCase(c); // Büyük/küçük harf farkını yok saymak için
                characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
            }
        }

        return characterCount;
    }
}




