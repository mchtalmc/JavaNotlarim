package day12switchloops;

import java.util.Scanner;

public class DenemeAylar {
    public static void main(String[] args) {


        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12. aya kadar tum aylarin isimlerini yazdiran
        //kodu yaziniz
        //        8==> August  September  October November December

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay giriniz");
        int month = input.nextInt();

        switch (month){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("Jun");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("mal mısın?");
        }


        /*
           kullanıcıdan aldığnız caharkterin sesli harf olup olmadığını kontrol eden kodu yazınız
           sesli harfler aeiou
     */


        Scanner input1 = new Scanner(System.in);
        System.out.println("Lütfen ay giriniz");
        char letter = input1.next().charAt(0);
        switch (letter){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Sesli harf");
                break;
            default:
                System.out.println("dogru karakter gir");

        }




















    }
}
