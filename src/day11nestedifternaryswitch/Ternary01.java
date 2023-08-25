package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {

        /*
        Kullanidan alinan iki sauidan kücük olanı ekrana yazdiriniz
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  integers...");
        int first = input.nextInt();
        int second = input.nextInt();

        //1.yol:
        if (first<second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }

        //2.Yol: Use Ternary
        int result =(first < second) ? first: second;
        System.out.println("Kucuk sayi " + result);



















































    }
}
