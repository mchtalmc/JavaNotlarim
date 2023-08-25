package day20methodoverloadingarrayList;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        String s = "Java";
        // 1) Method Overloading ne demek?
        // Aynı isimde farklı işler yapabilen methodlar olusturmak demek
        // 2) Ne için var?
        // Daha derli toplu bir yapı olsun diye, her parametreye göre yeni method olusturmamak adına var.
        //Ornek: substring methodu a) tek parametre  b) iki parametre

        add(3,5);

        /*
           1) Method Overloading yaparken method ismi değiştirilmez
           2) Method Overloading yaparken parametreler degistirilir
              a) Parametre degiştiriken, parametrelern data type ları degistirilebilir
              b) Parametre degiştiriken,, parametrelerin data type ları farklı ise yerleri degistirilebilir
              c) Parametre degiştiriken, parametrelerin sayısı degistirilebilir
           3) Java icin ismi ve parametreleri aynı olan iki method aynıdır
              Bu yüzden ismi ve parametre ==> "method signature" olarak adlandırılır
           4) Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur
              Method Overloading olustururken access modifier i degistirmenin hicbir etkisi yoktur
              Method Overloading olustururken methodu stativ ya da non-static yapmanın hicbir etkisi yoktur
               Method Overloading olustururken method body i degistirmenin hicbir etkisi yoktur
           5) "Private" methodlar overload edilebilir. Cunku method overloading sadece bir class ın icinde olur
              "private" olmak ise baska class lara gidildiginde problem olusturur
           6) "static" methodlar overload edilebilirler

         */


    }

    public static void add (int a, int b){
       System.out.println(a+b);
    }
    public static void add (double a, double b){
        System.out.println(a+b);
    }

    public static void add (double a, int b){
        System.out.println(a+b);
    }
    public static void add (int a, double b){
       System.out.println(a+b);
    }

    public static void add (int a, int b, int c){
        System.out.println(a+b+c);
    }














}
