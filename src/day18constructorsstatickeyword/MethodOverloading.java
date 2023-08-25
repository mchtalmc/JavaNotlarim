package day18constructorsstatickeyword;

public class MethodOverloading {

    /*
       1)Bir method aynı isim ve farklı parametrelerle olusturulursa  buna "method overloading" denir.
       2)"method overloading" Java da "iyi organizasyon" icin onemlidir
       3)Method overloading yapılırken parametre 3 sekilde degistirilebilir
         i)Parametrelerin sayıları degistirilebilir.
         ii)Parametrelerin data type ları degistirilebilir.
         iii)Parametrelerin data type ları farklı ise yerleri degistirilebilir.
       4)"Method Overloading" bir class'ın icinde oluur bu yuzden "private" methodlar da overload olabilir.
       5)"static" methodlar "overload" edilebiirler

     */


    public static void main(String[] args) {

        System.out.println(add(3, 5));

    }

    private static int add(int a , int b){

       return a+b;
    }

    private static int add(int a, int b, int c){

        return  a+b+c;
    }

    private static double add(double a,int b ) {

        return a + b;
    }

    private static double add(int a, double b){
        return a+b;
    }














}
