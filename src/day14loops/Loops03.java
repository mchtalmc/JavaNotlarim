package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        int i =1;
        while(i<1){//while loop'ta loop body'sinin hic calışmaması mumkundur.(Zero execution is possible)
            System.out.println("while loop");
            i++;
        }

        //do-while-loop // genellikle oyunlarda do-while-loop kullanılır
        int k=1;
        do {// do-while loop'da loop body'si en az bir kere calisir
            System.out.println("do-while-loop");
            k++;
        }while (k<1);

        //Kullanıcı bi sayı girsin sayı 100'den kücük ise kullanıcı "kazandınız" mesajı alsın
        //diger durumlarda kaybettiniz mesajı alsın

        Scanner input = new Scanner(System.in);


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

        //Kullanıcıdan alınan bir cümlenin buyuk harfle baslayıp nokta ile bittiğini kontrol eden kodu yazınız

        do {
            System.out.println("Please enter a word");
            String s = input.next();

            if (s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically");
            }else {
                System.out.println("Your sentence has grammatical mistake");
                break;
            }
        }while (true);







    }
}
