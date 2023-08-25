package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {
        List<String> iller= new ArrayList<>(Arrays.asList("Van", "Gumushane", "MUS", "Kutahya", "Ankara", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));


        ex1(iller);
        System.out.println();

        ex2(iller);
    }
    // 1( Tum List elemanlarini buyuk harfle, uzunluklarina gore, artan sirada, tekrarsiz olarak yazdiriniz

    public static void ex1(List<String> iller){
        System.out.print("1)");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+ " "));

    }
    // 2)Tum List elemanlarini buyuk harflem son harflerine gore artan sirada, tekrarsiz olarak yazdiriniz.
public static void ex2(List<String> iller){
    System.out.print("2)");
    iller.
            stream().
            distinct().
            map(t->t.toUpperCase()).
            sorted(Comparator.comparing(t->t.charAt(t.length()-1))).  //Siralama yaparken son harflerine gore siralama yapabilmemiz icin
            forEach(t-> System.out.print(t+ " "));
}

}



