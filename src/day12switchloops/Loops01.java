package day12switchloops;

public class Loops01 {
    public static void main(String[] args) {
        //Ezampla 1 : Ekrana 5 kere "Hi" yazdiriniz

        //1.Yol
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("rümi");

        /*
        Code Standarts
        1) Tekrar (Repetition) olmamalıdır
        2) Dynamic olmalıdır
        3) Tamir(Fix) ve update kolay yapilabilmelidir
         */

        //2.Yol
        //Ayni adimer tekrar yapilması gerektiğinde "Loop" lar kullanılır
        //4 tane Loop var; 1) for-loop 2) while-loop 3) do-while loop 4) for-each loop

        //1) for loop

        /*
         for (Baslangıc Degeri  ;  loop Calısma sartı    ;    Arttırma / Eksiltme){
              çalısılacak kodlar}
         */

        //Baslangıc deger  ;   Loop calısma sartı   ;     Arttırma/Eksiltme
        for ( int i = 1    ;         i<=5             ;         i++ ){
            System.out.println("Hi");
        }

        //Example 2 : 11 den 15'e kadar tüm sayıları ekrana yazdırınız
        for(int i = 11 ;  i<16 ;  i++){
            System.out.println(i);
        }

        //Example 3 : 40'tan 23 ' e kadar tum çift sayıalrı ekrana yazdırınız

        for (int i = 40; i > 22; i--) {
            if (i%2==0){
                System.out.println(i);
            }

        }

        //Example 4 : 18'den 56'ya kadar tüm tek sayıları ekrana yazdırınız
        for(int i =18; i<57; i++){
            if (i%2!=0){
                System.out.print(i+ " ");
            }
        }




































    }
}
