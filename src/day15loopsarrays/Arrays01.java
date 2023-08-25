package day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
            1)Array, Java'nın "aynı data tipi" inde "coklu data" depolamak icin olusturdugu bir yapıdır.
            2)Array'ler "primitive data type"leri veya "reference" lar ile calısır
            3)Array' ler "super fast" dir ve "memory" de cok az yer kaplar
         */

        //Aray nasıl olusturulur
        String stdNames [] = new String[5];

        //Array nasıl yazdırılır
        System.out.println(Arrays.toString(stdNames));
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames)); //[Ajda, Ayhan, Kemal, Cuneyt, Filiz]

        //Array'deki bir elemanı nasıl alırız
        System.out.println(stdNames[3]);

        //Example 1: stdNames array'ındeki her ismin sonuna yıldız koyarak console'a yazdırınız

        //1.Way:
        for (int i =0; i<stdNames.length; i++){//Length String'lerde parantezli(method),
            // Array'lerde parantezsiz(methodsuz) kullanılır
            System.out.println(stdNames[i] + "*");
        }

        //2.Way: for-each-loop ==> Enchanced(Zenginleştirilmiş) Loop - Mümkünse hep for-each-loop kullanın
        for (String w : stdNames){
            System.out.println(w + "*");

        }

        //Example 2: Bir Integer Array olusturunuz, 5 eleman ekleyiniz,elemanların toplamını bulup console'a yazdırın

        int ages[] = new int[5];
        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 9;
        ages[3] = 38;
        ages[4] = 27;
        System.out.println(Arrays.toString(ages)); //[12, 23, 9, 38, 27]

        int sum = 0;
        for (int w : ages){
            sum = sum + w;
        }
        System.out.println(sum);//109

        //Example 3: Bir char array olusturunuz 3 eleman ekleyiniz elamanların çarpımıbı bulup console'a yazdırınız

        char initials[] = new char[3];
        initials[0] = 'J';
        initials[1] = 'P';
        initials[2] = 'A';


        int results = 1;
        for (char w : initials){
            results = results * w;
        }
        System.out.println(results); // 384800


































    }
}
