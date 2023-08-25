package day16arraysforeachloop;

import java.util.Arrays;

public class Deneme04 {
    public static void main(String[] args) {
        String s = "Java is easy. Learn Java earn money.";

        String words[] = s.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println(words.length);
    }
}
