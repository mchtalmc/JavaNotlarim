package day15loopsarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        /*
            1)Application larda "data" ile bu dataları işleyen kodlar(logic) birbirinden ayrılır
              Yani; logic data'ya bagımlı olmamalıdır
              Data'ya bagımlı olarak yazılan kod'lara "hard code" denir
              "hard code" hatalı kod demektir

              Asagıdakı grades array'ındakı son elemanı almak içic "4" veya "grades.length-1" kullanılabilir
              "4" kullanırsanız array e bir eleman eklendiğinde kodunuz yanlıs cıktı verir ama
              "grades.length-1" kullanırsanız hep dogru sonuc alırsınız

         */

        //Array lerı kısa yoldan nasıl olıstırabiliriz?
        int grades[] = {67,98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));// [67, 98, 100, 34, 76]

        //Example 1: Grades array'ındeki en küçük  ve en buyuk grade'in toplamını ekrana yazdıran kodu yazınız
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));// [34, 67, 76, 98, 100]

        System.out.println(grades[0] + grades[grades.length-1]);

        //Example 2: Size verilen bir String array ' deki isimlerden 5 karakterden az karakter icerenleri
        //           console a yazdırınız


        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames){
            if (w.length()<5){
                System.out.println(w); // Ajda Tom

            }

        }

        //Example 3: Size verilen bir String array ' deki isimleri alfabetik sıraya koyduktan sonra F ile baslayan
        //           kisilerden onceki isimleri console a yazdırınız

        Arrays.sort(stdNames);
        System.out.println(stdNames);
        for (String w : stdNames){
            if (w.startsWith("F")){
                break;
            }
            System.out.println(w);//Ajda, ayhan, cuneyt,
        }

        //Example 4: Size verilen bir String array ' deki isimleri alfabetik sıraya koyduktan sonra F ile baslayan
        //           kisilerden onceki isimleri ve ""F" ile baslayanları console a yazdırınız

        Arrays.sort(stdNames);// [Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for(String w : stdNames){
            System.out.println(w); //[Ajda, Ayhan, Cuneyt, Filiz]
            if(w.startsWith("F")){
                break;
            }
        }

        System.out.println();

        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        //           isimler haric diger isimleri console'a yazdiriniz

        Arrays.sort(stdNames);//sort() method'u numeric dataları kucukten buyuge (ascending) dizer
                              //String leri ise alfabetik sırada (alphabetically) dizer
                              // ascending + alphabetically ==> Natural Order

        for (String w : stdNames){
            if (w.startsWith("F")){
                continue;
            }else {
                System.out.println(w); //Ajda, Ayhan, Cuneyt, Tom
            }
        }















    }
}
