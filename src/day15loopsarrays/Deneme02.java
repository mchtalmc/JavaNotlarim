package javaders.day15loopsarrays;

import java.util.Arrays;

public class Deneme02 {
    public static void main(String[] args) {
        int grades[] = {67,98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));// [67, 98, 100, 34, 76]

        //Example 1: Grades array'ındeki en küçük  ve en buyuk grade'in toplamını ekrana yazdıran kodu yazınız

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

        System.out.println(grades[0] + grades[grades.length-1]);


        System.out.println("-------------------");

        //Example 2: Size verilen bir String array ' deki isimlerden 5 karakterden az karakter icerenleri
        //           console a yazdırınız


        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w: stdNames){
            if (w.length()<5){
                System.out.println(w);
            }
        }

        //Example 3: Size verilen bir String array ' deki isimleri alfabetik sıraya koyduktan sonra F ile baslayan
        //           kisilerden onceki isimleri console a yazdırınız

        Arrays.sort(stdNames);// [Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for(String w : stdNames){
            System.out.println(w); //[Ajda, Ayhan, Cuneyt, Filiz]
            if(w.startsWith("F")){
                break;
            }
        }
    }
}
