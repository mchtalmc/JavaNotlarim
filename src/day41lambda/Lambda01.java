package day41lambda;

import javax.sound.midi.Patch;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SignedObject;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file icindeki text'i consol'a yazdiran kodu yaziniz.
        /*
        files isimli text'imize ulasmamizi saglayan Paths.get icindeki sifreli kismi aldiktan sonra
         java text icindeki metni bir stream halinde satir satir alt alta siraliyor.
         files.lines kismi kizardiginda main metod yanina exemption'i throws keywordu ile ekladik ve kizariklik sona erdi.
         forEach ile yazdirma islemi yapiliyor.

         forEach methodu icinde lambda expression yerine System.out::println yazdik. Makbul olan budur.
         */

        Files.lines(Paths.get("src/day41lambda/myTextFile.txt")).forEach(System.out::println);

        System.out.println("--------------------------");

        //Example 2: Verilen bir text file icindeki text'i buyu harflerle consol'a yazidran kodu yaziniz.
        /*
        Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiracagiz.
          files.Lines(Paths.get ve devami bize bir stream verir. sirasiyla map kullanacagiz.
           Varolan satirlar buyuk harfle yazilacagindan, yapilari degiseceginden map kullandik.
           Map icinde String::toUpperCase ile harflerin tamami buyuk harfe cevrildi ve sonrasinda forEach ile yazdirdik.

         */

        Files.lines(Paths.get("src/day41lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("--------------------------");

        //Example 3: Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden kodu yaziniz.

        /*
        Example 3:Text'imiz icinde "Java" kelimesi var mi diye bakacagiz.
     Basta files.lines kismini yazdik. Sonra anyMatch methodu ile Java kelimesini aradik.
     Aramayi yaparken contains("Java") yazdik. anyMatch bize boolean vereceginden bir boolean conteyner olusturup files ve devamini
     o boolean'a assign ettik. Burada forEach degil yazdirmayi sout ile yaptik. Sout icine boolean'in ismini
      yazdik.
         */


        boolean r1 = Files.lines(Paths.get("src/day41lambda/myTextFile.txt")).anyMatch(t -> t.contains("Java"));
        System.out.println(r1);

        System.out.println("--------------------------");


        //Example 4: Verilen text file icindeki text'lerde farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/day41lambda/myTextFile.txt")).

                map(t -> t.replaceAll("\\p{Punct}", " ").split(" ")). // Noktalama isaretlerini sil ve bosluktan kes dedim

                        flatMap(Arrays::stream).  // Array'leri yikmak icin kullanilir ve daha sonra array'leri stream icerisine koyar.
                ///flatMap() methodu arrayleri istenen sekle cevirir. Biz burada stream'e cevirdik

                        distinct(). //Benzersiz olanlari alamak icin kullanilir

                        collect(Collectors.toList()); // List icerisinde aktarmak icin kullanilir.

        System.out.println(words);

        System.out.println("--------------------------");

        // Example 5: Verilen text file icerisinde verilen text'de toplam kac harf kullanildigini gosteren kodu yazinizi.

        Long numOfLetters = Files.
                lines(Paths.get("src/day41lambda/myTextFile.txt")).
                map(t -> t.replaceAll("[^A-Za-z]", "")).
                map(t -> t.split("")).
                flatMap(Arrays::stream).
                count();
        // Keninden sorna method kullanilmayan methodlara "TERMINAL METHOD" denir.
        //Cound, anymMatch ve forEach methodu kendinden sonra method kullanilmayan methodlara ornektir.
        System.out.println(numOfLetters);

        System.out.println("--------------------------");

        // Example 6: Verilen text icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        // icinde return eden kodu yaziniz.

        /*
        Example: Text file icinde kullanilan tum harfleri alfabetik olarak ters sirada bir list icinde return  edecegiz.

     1. adim:List olustur

      2.adim:text file'i dosyaya ulasacak sekilde al, Files.lines(Paths...

        3.adim:map metodu ile harf disindaki karakterleri sil

          4.adim:2.map ile split metodu ile hiclikten keserek harfleri al. Array olarak verir.

            5.adim:flatMap ile duvari kir ve harflere ulas

             6.adim:sorted(Comparator.reverseOrder() ile ters sirada harfler sirala

               7.adim:collect(Collectors.toList() ile harfleri list icine yerlestir.

                sout icine listin ismini yaz ve calistir
         */

        List<String> letters = Files.
                lines(Paths.get("src/day41lambda/myTextFile.txt")).
                map(t -> t.replaceAll("[^A-Za-z]", "")). // Harfler disindaki her seyi bosluk karakterine cevirir
                        map(t -> t.split("")). // Kelimeleri array icerisinde alir
                        flatMap(Arrays::stream).  // Arayy'in icine atamak icin yazilir
                        sorted(Comparator.reverseOrder()). //Tersten siralama kodu
                        collect(Collectors.toList()); // List icerisinde return ettirmek icin yazilan kod

        System.out.println(letters);  // Listi yazdir.

        System.out.println("--------------------------");





    }
}
