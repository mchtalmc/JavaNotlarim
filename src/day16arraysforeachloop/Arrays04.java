package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Size verilen bi cümlede kac kelime oldugunnu gösteren kodu yazınız
        String s = "Java is easy. Learn Java earn money.";

        String words[] = s.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println(words.length);

    //Size verilen cumlede kac harf oldugunu gosteren kodu yazdırınız

       String letters [] = s.replaceAll("[^a-zA-Z]", "").split("");//[J, a, v, a, i, s,
        // e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]

        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);














    }




















}
