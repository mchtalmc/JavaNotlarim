package javaders.day14loops;

import java.util.Scanner;

public class Deneme03 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayı için carpım tablosu olusturan kodu yazınız
        //3*1=3, 3*2=6, 3*3=9.... 3*10=30
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen carpim icin 1 sayi giriniz");
        int num = input.nextInt();

        int a = 1;
        while (a <= 10) {
            System.out.println(a + "*" + num + "=" + (num * a));
            a++;
            System.out.println();
        }

        System.out.println();

        //Kullanıcıdan aldıgınız String'teki sessiz harfleri console'a yazdıran kodu yazınız

        System.out.println("Lutfen bir kelime giriniz");
        String s = input.next();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean x = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
            if (x) {
                continue;
                // if (x) {} z++ ve continue yazmasan da olur
                // if(!x) {
                //System.out.print(ch);} da yapılabilir
            } else {
                System.out.print(ch);
            }

        }
        System.out.println();

        //Kullanıcı bi sayı girsin sayı 100'den kücük ise kullanıcı "kazandınız" mesajı alsın
        //diger durumlarda kaybettiniz mesajı alsın


        do {
            System.out.println("Please enter an integer");
            int n = input.nextInt();

            if (n<100){
                System.out.println("Won!");
            }else{
                System.out.println("Lost!");
                break;
            }

        }while (true);
    }
}