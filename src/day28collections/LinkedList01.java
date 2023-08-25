package day28collections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
    1) LinkedList'ler node silme ve ekleme'de cok basarili olduklari icin
    silme ve ekleme islemlerini coklukla yapacaginiz zaman LinkedList kullanininiz.

    2) ArrayList'ler index'leri adres gibi kullanir, bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
    Note: Ihtiyaciniz olan collection cogunluk silme ve ekeleme islemleri yapacaksa(muze ziyaretcileri) gibi LinkedList,
            "search" islemleri yapaacaksa(Amerika eyaletleri gibi) ArrayList kullaniniz.


     */
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        //Verilen String sirasina gore siralar.
        s.add("Steve");
        s.add("Ajda");
        s.add("Esra");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");

        s.add(2, "Esen"); // Istenilen indexe istenilen String'i koyabiliriz
        s.addFirst("Kemal"); // Baslangic kismina ekler
        s.addLast("Ajdar");  // En son kisima ekler

        System.out.println(s); //[Ajdar, Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra]

        s.remove(2);

        s.remove("Ajdar");

        s.remove(); // Parametressiz kullanirsak direkt ilk elemani siler

        System.out.println(s); //[Steve, Esen, Esra, Muge, Cuneyt, Esra]
        //s.removeFirstOccurrence("Esra"); //[Steve, Esen, Muge, Cuneyt, Esra] Ilk gordugu Esrayi siler
        System.out.println(s);

        s.removeLastOccurrence("Esra"); //[Steve, Esen, Esra, Muge, Cuneyt] Son gordugu Esra'yi siler
        System.out.println(s);

        String s1 = s.peek(); // Ilk elemani ilmeen size verir Copy+paste
        System.out.println(s1); //Steve
        System.out.println(s);//[Steve, Esen, Esra, Muge, Cuneyt]

        String s2 = s.poll(); // Ilk elemani size verir ve siler cut+paste
        System.out.println(s2);// Steve
        System.out.println(s);//[Esen, Esra, Muge, Cuneyt

        /*
        Note: peek() ile element() ikisi de ilk elemani silmeden size verir.
          Ama peek() list bos oldugunda size null verir, element() ise hata verir.
         */

        String s3 = s.element(); //Ilk elemani silmeden size verir copy+paste
        System.out.println(s3); //Esen
        System.out.println(s); //[Esen, Esra, Muge, Cuneyt]


        /*
        Note: pool() ile (pop) ikisi de ilk elemani siler ve size verir
             Ama pool() list bos oldugunda size "null" verir pop() ise "hata" verir.
         */
        String s4= s.pop(); // Ilk elemani siler ve size verir cut+paste
        System.out.println(s4); //Esen
        System.out.println(s); //[Esra, Muge, Cuneyt]

    }
}
