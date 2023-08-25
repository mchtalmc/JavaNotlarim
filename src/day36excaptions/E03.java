package day36excaptions;

public class E03 {
    /*
    INTERWIEW SORUSU OLABILIR:::::
    "throws" ile "throw" arasinda ki farklar nelerdir??
      1- "THROWS" method signature satirinda kullanilir, "THROW" ise method body icerisinde kullanilir.
      2- "THROWS" method signature satirinda bir veya birden fazla "exception" ile bir kere kullanilabilir.
           "throw" ise method body icerisinde tekrar tekrar kullanilabilir.
      3-" THROWS"'dan sonra sadece Exception Class isimleri yazilir,
              "throw"'dan sonra ise Exception Class'dan object olusturulur.



     */
    public static void main(String[] args) {


        printAge(23);
        try {  // Burda kendi olusturdugumuz Excaptions'u argume ettik. Handling
            printAge(-10);
        }catch (IllegalArgumentException e){
            System.out.println("Negative argument are not valid");
        }

        printAge(-9);



    }

    //Example 1: Kullanicidan alinan yasi consola yazdiran method'u olusturunuz yaziniz
    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();// Yas 0 dan kucukse kodu blokla ve durdur.
        }
        System.out.println(age);
    }
}
