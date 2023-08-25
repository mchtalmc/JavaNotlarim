package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList001 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        //ArrayList'te bir elemanin ilk gorunumu nasil silinir?
        //Remove() methodu bir elemanın ilk görünümünü siler
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        //ArrayList te bir eleman indexi kullanarak nasıl silinir?
        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun, Giresun, Yozgat]

        //remove() methodu eleman ile kullanılırssa ilk gorunumunu siler
        //remove() methodu eleman ile kullanılırsa size o elemanı silip silmediğini ifade eden treu ya da false gondurur

        //Example 1: Bir Integer List olusturun ve 12 elemanını siliniz.
        //ArrayList olusturuken sag tarafa (constructor) ArrayList yazmak zorundasınız
        //Sol tarafa ister ArrayList yazın ister  List yapın ikisi de calısır
        //Dataylaru Collections konusunda görecegiz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //ages.remove((Integer)12);
        //System.out.println(ages);

        //1.Way
        // Integer nonPrimitive = 12;
        // ages.remove(nonPrimitive);
        //System.out.println(ages);

        //2. Way:Recommented
        //ages.remove((Integer) 12);
        //System.out.println(ages);

        //3.Way
        ages.remove(ages.indexOf(12));
        System.out.println(ages);//[23, 7, 4]

        //Kısa yoldan bir Lİst olusturmak icin List.of() methodunu kullanabiliriz
        //List.of () methodu degistirilemez bir List e olusturmak ıcın kullanılır
        //Bu method ile olusturulan List degistirmeye yonelik methodları desteklemez

        List<Character> initials = List.of('a','b','a','c','d');
        System.out.println(initials);//[a, b,a, c, d]
        //initials.add('e');
        //initials.remove(0);
        //initials.set(0,'u');
        System.out.println(initials);//[a, b, a, c, d]

        //indexOf(aranan karakter) methodu arana karakterin ilk gorunumunun indexini verir
        int r1 = initials.indexOf('c');
        System.out.println(r1);//3

        //lastIndexOf() methodu aranan karakterin son indexini verir
        int r2 = initials.lastIndexOf('a');
        System.out.println(r2);//2

        //Example 2: Bir List teki tekrarsız elemanları console yazdırınız

        List<Double> prices =List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for ( Double w : prices ){
            if (prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w+ " ");//3.75 4.0
            }
        }

        //Example 3: Bir List te tekrarlı eleman olup olmadugını gösteren kodu yazınız

        List<Integer> heights = List.of(3,13,3);
        System.out.println();

        int counter = 0;
        for (Integer w : heights){
            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("All element are unique in the List");
        }else {
            System.out.println("At least one element is not unique in the List");
        }




    }
}
