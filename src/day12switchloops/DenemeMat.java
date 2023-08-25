package day12switchloops;

import java.util.Scanner;

public class DenemeMat {

    public static void main(String[] args) {

        // Example 1 : Kulanıcıdan iki sayi ve yapılacak işlemi alan +, -, *,/,% işlemierini yapan kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapılacak işlemi giriniz. +, -, *,/,% den birini seçiniz");
        char opr = input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a*b/100);
                break;
            default:
                System.out.println("lütfen gecerli bi işlem giriniz");
        }

















    }
}
