package day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {

        //Kullanıcıdan alınan bir tamsayının tekrarsız rakamlarının toplamını bulunuz
        //1838 ==> 1 + 3 =4
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        String s = input.next();
        int sum = 0;
        for (int i =0; i<s.length(); i++){
          String d = s.substring(i,i+1);
          if (s.indexOf(d)==s.lastIndexOf(d)){
             sum = sum + Integer.valueOf(d);
          }

        }
        System.out.println(sum);

        //Bir String'deki tekrarlı karakterleri ekrana yazdıran kodu yazını

        String a = "Alala";
        String result = "";
        for (int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if ((a.indexOf(ch)!=a.lastIndexOf(ch)) &&!result.contains(""+ch)){
                result=result + ch;
            }


        }
        System.out.println(result);

























    }
}
