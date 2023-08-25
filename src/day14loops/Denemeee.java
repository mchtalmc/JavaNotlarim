package day14loops;

import java.util.Scanner;

public class Denemeee {
    public static void main(String[] args) {

        //21 den 180 e kadar hem 4 hem de 6 ile bölünebilen tamsayıları console a yazdıran kodu yazınız
        // size verilen küçük harfle yazılmış stringin indexin çift sayı olan caharterlerini büyük harfe dönüştürünüz
        //miami ==>MiAmI
        //verilen bir stringde ilk a harfinden  önceki tüm charakterleri console yazdırınız
        //hello java ==>hello j
        //verilen bir stringde ilk a harfinden  sonraki  tüm charakterleri ters sırada console yazdırınız
        //tokatci=ict
        //Kullanıcıdan alınan bir tamsayının tekrarsız rakamlarının toplamını bulunuz
        //1838 ==> 1 + 3 =4
        //Bir String'deki tekrarlı karakterleri ekrana yazdıran kodu yazını

        //21 den 180 e kadar hem 4 hem de 6 ile bölünebilen tamsayıları console a yazdıran kodu yazınız
        for (int i = 21; i < 181; i++) {
            if (i%4==0 && i%6==0){
                System.out.print(i+ " ");
            }
        }

        System.out.println();

        // size verilen küçük harfle yazılmış stringin indexin çift sayı olan caharterlerini büyük harfe dönüştürünüz

        String str = "miami";
        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i,i+1);
            if (i%2!=0){
                System.out.print(ch);
                continue;
            }else {
                System.out.print(ch.toUpperCase());
            }
        }
        System.out.println();

        //verilen bir stringde ilk a harfinden  önceki tüm charakterleri console yazdırınız
        //hello java ==>hello j

        String s1 = "Hello Java";
        for (int i = 0; i <s1.indexOf('a') ; i++) {
            String ch1 = s1.substring(i,i+1);
            System.out.print(ch1);
        }
        System.out.println();
        //Kullanıcıdan alınan bir tamsayının tekrarlı rakamlarının toplamını bulunuz
        //1838 ==> 1 + 3 =4

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        String sayı = input.next();





















    }
}
