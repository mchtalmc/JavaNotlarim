package day12switchloops;

import java.util.Scanner;

public class DenemeSeslı {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lütfen ay giriniz");
        char letter = input1.next().charAt(0);
        switch (letter) {
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
