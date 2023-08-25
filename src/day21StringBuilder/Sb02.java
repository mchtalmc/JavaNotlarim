package day21StringBuilder;

import java.util.Locale;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();//String lerin cevrilmesi loop lar la da yapılır reverse daha kısa yol
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7);
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5,"X");//replace (2,5, "X")==> 2 dahil 5 haric index 2,3, ve 4 deki character ler
                                          //yerine X KOYAR
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3,"2023");
        System.out.println(sb1);//ysX2023vaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);//Sonuc 0==> Alfabetik olarak ayni siradalar demektir.
                              //Sonuc mesela -3 ise sb1 den alfabetik olarak 3 onde demektir.
                              //Sonuc mesela 3 ise sb1 den alfabetik olarak 3 onde demektir.

        //sb2.toString(); bu method StringBuilding i Stringe cevirir böylece daha cok methoda ulasılır

        //StringBuilder nasil String'e cevrilir?
        String str = sb1.toString().toUpperCase(Locale.ROOT);
        System.out.println(str);//String YSX2023VAJ

        //String nasil StringBuilder'e cevrilir?
        StringBuilder newSb1 = new StringBuilder (str);
        System.out.println(newSb1);//StringBuilder YSX2023VAJ






    }
}
