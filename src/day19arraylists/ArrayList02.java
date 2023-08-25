package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        /*
          method ogrenirken 3 seye dikkat!!
          1)method ne is yapar,
          2) o method nasil kullanilir,
          3) o method size ne verir
         */

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

        //Array
        System.out.println(cities.remove("Miami"));//true

        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun, Giresun, Yozgat]

        //ArrayList olusturuken en basa ArrayList yerine List de yazabilirsiniz. Sebebi Collections konusunda görecegiz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example 1: 12 elemanını ages List ten siliniz
        ages.remove((Integer) 12);
        System.out.println(ages);
        // primitiv int olur, primitiv int remove() method icinde kullanilinca Java onu index sanar.
       // Java'ya 12 nin index olmadigini soylemek icin primitive int yerine wrapper class integer kullanmaliyiz.

        //Bir ArrayList teki bir elemanın tüm görünümleri nasıl silinir?
        List<String>citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");
        System.out.println(cities.removeAll(citiesToRemove));//true
        System.out.println(cities);//[Miami]


        //Kısa yoldan bir List olusturmak icin asagıdaki List.of() methodu kullanılabilir
        List<Character> initials = List.of('a','k','c','d','k');
        System.out.println(initials);//[a, k, c, d, k]

        List<Character> letters = List.of('a','k','c','d','k');
        System.out.println(letters);//[a, k, c, d, k]

        //2 ArrayList in birbirine esit olup olmadıgını nasıl anlarız?
        //equals() methodu aynı elemanlar aynı index te oldugu surece true verir
        boolean r1 = initials.equals(letters);
        System.out.println(r1);//true

        int r2 = initials.indexOf('k');
        System.out.println(r2);//1

        int r3 = initials.lastIndexOf('k');
        System.out.println(r3);//4

        //Ezample 1: Tekrarsız elemanları console a yazdırın
        List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for (Double w : prices){
            if (prices.indexOf(w) == prices.lastIndexOf(w)){
                System.out.print(w + " ");//3.75 4.0
            }
        }

        //Example 2: Bir Lİst te tekrarlı elaman olup olmadıgını gosteren kodu yazınız
        List<Double> heights = List.of(2.5,1.25,3.75,1.25,4.0);
         int counter = 0;

         for (Double w : heights){
             if (heights.indexOf(w) != heights.lastIndexOf(w)){
                 counter++;
             }
         }
         if (counter==0){
             System.out.println("All elements are unique in the List");
         }else {
             System.out.println("At least one element is not unique in the List");
         }


    }
}
