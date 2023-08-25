package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        // Kullanicinin coklu data'yi bir array'e yerlestirebilmesi icin gereken kodu yaziniz.
        /*
           1)Kullanıcıdan data almak ıcın Scanner object olusturulur
           2)Coklu datayı yerleştirmek icin bir array olusturmalıyım
           3)Array olustumak ıcın kullanıcıdan array e kac tane eleman koyacagını almalıyım
           4)Loop olusturup eleman ekleme işlemini tekrar tekrar yapabilmeiliyim

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elemets you want to add");
        int numOfElements = input.nextInt();

        String stdNames[] = new String[numOfElements];

        System.out.println("To stop adding press 'q'");
        for (int i=0; i<stdNames.length; i++){
            System.out.println("Enter the " + (i+1) + ".student name");

            String name = input.next();

            if (name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdNames));

















    }




}


