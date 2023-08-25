package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {

    /*
    Kullanıcıdan alıgınız sayı cift ise yarısını ekrana yazdırınız tek ise "Bu sayı arttırılmaz" yazdirinız
     */

    /*
    1) Twrnery'de true ve false durumları icin size verilen data type'leri farklı ise olusturdugunuz container'in
       data type'nı "Object" yapın.
    2) "Object" Java'da bir class'dır.
       "Object" Java'daki butun Class'ların "Parent"i dir. Yanı babasıdır, Hz. Adem gibidir
       "Object class"ın "Parent"i yoktur
       Java'da parent'i olmayan tek Class "Object Class"dir.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int num = input.nextInt();

      Object result =  num%2==0 ? num/2 : "Bu sayi ikiye bolunmaz";
        System.out.println(result);


    }
}
