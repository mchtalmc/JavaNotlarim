package javaders.day14loops;

import java.util.Scanner;

public class S01 {

    //Kullanıcıdan alınan bir tamsayının tekrarsız rakamlarının toplamını bulunuz
    //1838 ==> 1 + 3 =4



    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        String s= input.next();

        int sum=0;

        for (int i=0; i<s.length(); i++){
            String a= s.substring(i,i+1);

            if (s.indexOf(a)==s.lastIndexOf(a)){
                sum= sum+ Integer.valueOf(a);
            }
        }
        System.out.println(sum);




        //Bir String'deki tekrarlı karakterleri ekrana yazdıran kodu yazını

        String a= "alala";
        String result= "";

        for (int i=0; i<a.length(); i++){
            char ch= a.charAt(i);
            if ((a.indexOf(ch)!=a.lastIndexOf(ch)) &&!result.contains(""+ch)){
                result=result+ch;
            }
        }
        System.out.print(result);



    }
}
