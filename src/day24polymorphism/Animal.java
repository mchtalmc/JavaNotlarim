package day24polymorphism;

public class Animal {

    /*
       1) Parent Class taki methodu Child Class icinde özellestirerek kullanmya overriding yapmak denir

       2) Overriding de methodun parantezinde ve method ismine dokunulmaz (==> Method signature)

       3) private methodlar override edilemez

       4) Child Class taki methodun access modifier i Parent Class taki methodun access modifier inden dar olamaz,

       5)Child class da override edilen methodun return tye i ile Parent taki methodun return type i arasinda
        IS-A iliskisi varsa return type degistirelebilir

       6)Methodun return type i primitive ise Overriding yaparken primitive type degistirilemez. Cunku return type
        ya ayni olur yada parent tan secilir, ama primitiveler arasinda parent-child iliskisi olmadigindan parent tan
        secmek mevzu bahis olamaz o zaman tek secenek aynisi olmalidir

        7)Child'da override edilen methodun return type i ile parent taki methodun return type i arasinda
         IS-A ilisikis yoksa return type DEGİSTİRİLEMEZ
         Mesela ;
      Integer Wrapper classi ile Long Wrapper classi arasinda IS-A iliskisi yoktur o yuzden return type i
      degistiremedik

      IIII--- Return Type Wrapper Class oldugunda, Overriding yaparken "Return type" degistirilemez.

      8)Methodun return type i void ise Overriding yaparken return type DEGISTIRILEMEZ

      9) static methodlar override edilemezler.
       Çünkü static methodlar tüm childler için ortak methoddur.
        Bir child bir ortak methodu değiştirdiğinde diğer child'lar bundan olumsuz etkilenebilir.
        Bu yüzden java static methodların override edilmesine izin vermez.

       10)final methodlar override edilemezler. final methodların body si degistirilemez ama Override ederken
          method body ı degistirriz bu bir celiskidir. Bu yüzden java final methodlar override edilmesine müsaade etmez.
          a)final keyword unu Variable ler ile kullanabiliriz
            i)final variable ise mutlaka deger atanmalıdır
            ii)ilk atanan deger degistirilmez
          b)final keyword unu Methodlar ile kullanabiliriz
            i)method final ise methodun body si degistirilemez
            ii)methodun body si degistirilmeyince override yapmak mumkun olamaz
          c)Final keyword unu Class lar ile kullanabiliriz
                    => class final ise O classin child i olamaz

          ==>Polymorphism==> Method Overloading + Method Overriding;



     */

   public void move(){
       System.out.println("Animals move...");
   }
   public   int add(int a, int b){
       return  a+b;
   }

   public Animal create(){
       return new Animal();
   }
   public Integer multiply(Integer a, Integer b){
       return a+b;
   }

   public final double circleArea(double r){ // FINAL OVERRIDE EDILEMEZ.
       return 3.14*r*r; //Cunku final methodlarin body'si degistirilemez. Override body degistirilebilir bu celiskiden java izin vermez Override'a
   }
















}
