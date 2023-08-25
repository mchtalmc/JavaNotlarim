package javaders.day14loops;

import java.util.Scanner;

public class Deneme02 {
    public static void main(String[] args) {
        //3'ten 8 'e kadar tum sayıları console'a yazdıran kodu yazınız

        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz

        int i = 21;
        while (i < 180) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
//miami ==> MiAmI

        String s = "miami";
        int m = 0;
        while (m < s.length()) {
            String ch = s.substring(m, m + 1);
            if (m % 2 == 0) {
                System.out.print(ch.toUpperCase());
            } else {
                System.out.print(ch);
            }
            m++;
        }
        System.out.println();
        //Size verilen tamsayının rakamları toplamını console'a yazdıran kodu yazınız

        int r = -578;
        r = Math.abs(r);
        int sum = 0;
        while (r>0){
            sum = sum + r%10;
            r=r/10;
        }
        System.out.println(sum);


        System.out.println();
        //Kullanıcıdan aldığınız sayı için carpım tablosu olusturan kodu yazınız
        //3*1=3, 3*2=6, 3*3=9.... 3*10=30
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen carpim icin 1 sayi giriniz");
        int num= input.nextInt();

        int a= 1;
        while (a<=10){
            System.out.println(num * a);
            a++;
        }



    }
}