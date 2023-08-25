package day13incrementdecrementloops;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: 21 den 180 e kadar hem 4 hem 6 ile bölünen tam sayıları ekrana yazdıran kodu yazınız

        for (int i = 21; i < 181; i++) {
            if (i % 4 == 00 && i % 6 == 0) {
                System.out.print(i + " "); //24 36 48 60 72 84 96 108 120 132 144 156 168 180
            }
        }
        System.out.println();

        //Example 2: Size verilen kucuk harfle yazimis String'in index'i cift sayi olan
        //           character'lerini buyuk harfle gosterin
        //           ankara==> AKR

        //Note : Bir string'de son index her zaman length()-1
        //Note : Yazdiginiz kod belli senaryolar icin calisiyor ancak tüm senaryolar icin calismiyorsa;
        //bu tarz koda ==> hard-code denir ==> ve mutlaka düzeltilmelidir

        String str = "ankara";
        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());
            }

        }
        System.out.println();


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz...");
        String a = input.next();
        String b = "";

        for (int i = 0; i < a.length(); i++) {
            String ch = a.substring(i, i + 1);
            if (a.indexOf(ch) != a.lastIndexOf(ch) && a.contains(" " + ch)) {
                b = b + ch;
            } else {
                System.out.println(b);
            }
        }


    }
}
