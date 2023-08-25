package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    /*
            Kullanicidan bir sayi aliniz , o sayi pozitif ise ekrana "Pozitif" yazdırın
            değil ise   "pozitif değildir" yazdırın
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your integer...");
        int number = input.nextInt();

        String result = number>0 ? "Pozitif ": "pozitif degildir";
        System.out.println(result);


        if (number>0){
            System.out.println("Pozitif Sayi");
        }else {
            System.out.println("Pozitif degildir");
        }





































    }











}
