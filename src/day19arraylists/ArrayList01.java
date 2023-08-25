package day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    /*
       1)Aynı data type' ındaki coklu data'ları depolamak icin array kullanırız
       2)Array'ların bir negatif yanı var; icine koyacagınız eleman sayısını en basta belirlemek zorundasınız.
       3)Array'lar eleman sayıısında esnek degildirler, bu yüzden Java "ArrayList" adlı yeni bir yapı olusturdu
         bu yapı eleman sayısında esnektir. Hic eleman koymazsanız eleman sayısını sıfır olarak ayarlar, 1000
         eleman koyarsanız eleman sayısını 1000 olarak ayarlar
       4)"ArrayList" yerine sadece "List" de diyebiliriz.
       5)Java ArrayList leri olusturduktan sonra Array ları iptal etmedi cunku;
          i)Array lar süper hızlıdır.
          ii)Array ler memory de cok az yer kaplar.
       6)Array ler "primitve data" type ları ve "reference" ları depolayabilir ama "ArrayList" ler non-primitive data
         type larını depolar bu yuzden ArrayList ler Array lerden daha cok yer kaplar.

     */

    public static void main(String[] args) {

        //ArrayList nasıl olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[]

        //ArrayList e eleman nasıl eklenır?

        //1.Way
        ages.add(12);
        ages.add(24);
        ages.add(9);//add() methodu elemanları giris sırasına göre list e yerlestirir
        System.out.println(ages);//[12, 24,9]

        //2.Way
        ages.add(1,99);
        System.out.println(ages);

        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

        //3.Way
        ages.addAll(price);
        System.out.println(ages);//[12, 99, 24, 9, 23, 33]

        //4.Way
        ages.addAll(3,price);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 33]

        //ArrayList'te eleman sayısı nasıl bulunur?
        int numOfElement = ages.size();//size () methodu bir List teki eleman sayısını verir
        System.out.println(numOfElement);//8

        //ArrayList te specific bir eleman nasıl alınır
        int el1 = ages.get(3);//get() methodu index kullanarak istegimiz elamanı almaya yarar
        System.out.println(el1);//23

        //
        ages.set(6,111);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 111, 33]

        //ArrayList te specific bir elemanın oluo plmadıgını nasıl anlarız?
        boolean r1 = ages.contains(99);
        System.out.println(r1);//true

        //Bir ArrayList in bos olup olmadıgını nasıl kontrol ederiz?
        boolean r2 = ages.isEmpty();
        System.out.println(r2);//false

        //ArrayList te tüm elemanları nasıl sileriz?
        ages.clear();
        System.out.println(ages);//[]

        boolean r3 = ages.isEmpty();
        System.out.println(r3);//true

        //Example 1: Bir List in bos olup lmadııgını kontrol eden kodu yazınız
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1.Way:
        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        //2.Way:
        if (names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }





    }
}
