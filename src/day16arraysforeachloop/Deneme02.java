package day16arraysforeachloop;

import java.util.Scanner;

public class Deneme02 {
    public static void main(String[] args) {


        /*
        1) kullanıcıdan data almak için scanner oluşturulmalı
        2) çoklu data yerleştirmek için bir array oluşturulmaı
        3) arrayı oluşturabilmek için kullanıcıdan arrayakaç tane eleman koyulaccaanını öğrenmeliiym
        4) loop oluşturup elemen akleme işlemini tekara tekrar yapılabilmelidir
         */

        //toplama çıkarma çarpma bölme üzde ilemlerinin yapabilen bir hesap makşnasıyapınız
        // kullanıcı q ya basmadığıs sürece işlem seçip yapabilmeye devam edebilsin


        Scanner input = new Scanner(System.in);

        System.out.println("To stop calculation press 'q'");
        char opr = ' ';

        do{
            System.out.println("Please enter the operation among +, -, *, /, %");
            opr = input.next().toLowerCase().charAt(0);

            if(opr=='q'){
                System.out.println("See you again");
                break;
            }
            boolean r = opr=='+' || opr=='-' || opr=='*' || opr=='/' || opr=='%';

            if(!r){
                System.out.println("Undefined operation");
                break;
            }

            System.out.println("Enter the first number");
            int n1 = input.nextInt();
            System.out.println("Enter the second number");
            int n2 = input.nextInt();

            switch(opr){
                case '+':
                    System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
                    break;
                case '-':
                    System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
                    break;
                case '*':
                    System.out.println(n1 + "x" + n2 + "=" + (n1*n2));
                    break;
                case '/':
                    System.out.println(n1 + ":" + n2 + "=" + (n1/n2));
                    break;
                case '%':
                    System.out.println(n1 + "%" + n2 + "=" + (n1*n2)/100);
                    break;
            }

        }while(true);



















    }
}
