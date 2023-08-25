package day18constructorsstatickeyword;

    /*
        1)"static block" lar "static variable" lara "ilk degerlerini atamak" (initialize) icin kullanılır
        2)static bir variable deger atamak icin kod yazmaniz gerekirse static block kullaniniz
        3)static bir variablea deger atamak icin yazilmasi gereken kod main method icine de yazilabilir
          ama static block icine yazilan kod main method icine yazilandan once calistirilir.
        4)bir classda birden fazla static block varsa ustteki once calistirilir

     */

import java.time.LocalDate;

public class StaticNonStaticBlocks01 {

    //static variable lar static block kullanılmadan da "initialize" edilebilirler
    public static double pi = 3.14;

    //static variable lar "static block" kullanarak da "initialize" edilebilirler

    //Asagıdaki gibi "static" ler bir variable' a deger atamak ıcın kod yazmanız gerekirse "static block" kullanınız
    public static double price;

    public static void main(String[] args) {
        System.out.println("Hey I am a main method");

    }

    static {
        System.out.println("Hey I am a static block 1");
        LocalDate d = LocalDate.now();
        if (d.getMonthValue()==3){
            price = 1000;
        }else {
            price = 1200;
        }
    }

    static {
        System.out.println("Hey I am a static block 2");
    }

    /*
    Hey I am a static block 1
    Hey I am a static block 2
    Hey I am a main method
     */




}
