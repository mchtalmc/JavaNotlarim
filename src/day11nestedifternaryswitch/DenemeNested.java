package day11nestedifternaryswitch;

import java.util.Scanner;

public class DenemeNested {
    public static void main(String[] args) {

         /*
         Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
         1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
         2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year...");
        int year = input.nextInt();

        String result = year%100==0? (year%400==00? "Leap": "Not Leap"): (year%4==0? "Leap":"Not Leap");
        System.out.println(result);

        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalı-
        ğa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        125 yukarı yuvarlanacak ve değer 130 olacaktır. 123 aşağı yuvarlanacak ve değer 120 olacaktır.
         */

        int sayı = 123;

        String result1 = sayı%10>=5 ? ("son basamagı bir üst onluga yuvarla: " + 10*(sayı/10+1)) :
                ("Son basamagı bil alt onluga yuvarla: " + 10*(sayı/10));
        System.out.println(result1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int a = scan.nextInt();

        String x = a%10>=5 ? ("son basamagı bir üst onluga yuvarla: " + 10*(a/10+1)) :
                ("Son basamagı bil alt onluga yuvarla: " + 10*(a/10));
        System.out.println(x);






























    }
}
