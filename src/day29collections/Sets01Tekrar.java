package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01Tekrar {
    /*
    1) Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir
    2) 3 tane Set Class vardir;
         i)HashSet Class:
                   "Hash" benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
                   "HashSet" elemanlari rastgele siralar.
                   "HashSet" elemanlari siralamadigindan cok hizli calisir.
                   "HashSet"ler "null"i eleman olarak kabul eder.
                   "HashSet"ler tekrarsiz eleman depolamak icindir

          ii)LinkedHashSet Class:
          "          "LinkedHashSet"ler elemanlari sizin verdiginiz siraya gore dizdiklerinden "HashSet"lere gore yavastirlar.
                     "HashSet"lere gore yavastirlar.
                     "LinkedHashSet"ler tekrar elaman depolamak icindir

          iii)TreeSet Class:
                     "TreeSet"ler elemanlari natural order'a gore dizerler
                     "TreeSet"ler elemanalari natural order'a dizdiklerinden cooook yavastirlar
                     En yavas Set "TreeSet"tir.

       3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz.
     */
    public static void main(String[] args) {


        HashSet<String> hs= new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt"); //Tekrarli eleman koydugumuzda 1 tanesini alir ve onu gosterir.Hata vermez
        hs.add(null); // Her zaman en basa koyar. Degeri 0 oldugundan

         //Elemanlari rastgele siralama yapti. Bu yuzden daha hizli
        System.out.println(hs); //[null, Zeki, Ajda, Cuneyt, Esra, Ezel]


        System.out.println(hs.hashCode()); //2038751948


        LinkedHashSet<Integer > lhs= new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);

        //Elemanlari verdigimiz siraya gore dizer.
        System.out.println(lhs); //[234, 87, -32, 124]

        LinkedHashSet<Integer > ls= new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        System.out.println(ls); //[451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs + "Ilk LinkedHS"); //[87, 124]  **// ==> Ilk LinkedHS'deki farkli elemanlari siler
        System.out.println(ls+ " 2. LinkedHS");  //[451, 87, 231, 124]


        TreeSet<Character> ts= new TreeSet<>();

        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
       // ts.add(null); // TreeSet'lere null eklenemez.

        System.out.println(ts); // Natural orde (Alfabetik siraya) gore siraladi. [A, G, R, U, Z]


        System.out.println(ts.first()); // A

        System.out.println(ts.last()); // Z

        System.out.println(ts.lower('R')); // G==> Verilen eleman olan R'den bir once ki elemani verir.

        //Lower method'u var olan ve var olmayan methodlar icin kullanilabilir.

        System.out.println(ts.lower('D')); // A==> Verilen eleman Set icerisinde olmamasina ragmen bi onceki elemani verir.
        //Lower a dan once NULL VERIR


        System.out.println(ts.higher('K'));// R==> Verilen eleman olan K'dan bir sonraki elemani verir.
        //Higher Z'Den sonra NULL verir.

        System.out.println(ts.headSet('R')); // [A,G] ==> Parantez icindeki R dahil dehildir. (R'den oncekileri ver)
        System.out.println(ts.headSet('R',true)); // True diyerek R'yi dahil ediyorum

        System.out.println(ts.tailSet('G')); //[G,R,U,Z]==> Parantez icindeki G dahildir. (G ve G'den sonraki elemanlari verir)
        System.out.println(ts.tailSet('G',false));// False diyerek G'yi dahil etmiyorum.


        System.out.println(ts.ceiling('R')); // R==> Elaman set'in icinde varsa eleman'in kendisi return eder

        System.out.println(ts.ceiling('K'));// R==> Elaman set'in icinde yoksa, sonra ki eleman return eder.

        System.out.println(ts.subSet('G', 'Z'));// [G,R,U] ==> Ilk parametre dagil ikinci parametre dahil degil

        System.out.println(ts.subSet('G', false, 'Z', true)); // [R,U,Z]



    }
}
