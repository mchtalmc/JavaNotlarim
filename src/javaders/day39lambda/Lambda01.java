package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();

        printEl(myList);
        System.out.println();

        printElExceptStartsWithT(myList);
        System.out.println();

        printElLengthLessThanFour(myList);
        System.out.println();

        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();

        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();

        tkrszBuyukHrfAlfabetikSiraYazdir(myList);
        System.out.println();

        printElUniqueLowerCaseSortWithLength(myList);
        System.out.println();

        ilkHarfBykDigerKucukYazdir(myList);
        System.out.println();

        IlkHarfveyaSoOlanlariYazdir(myList);
        System.out.println(myList);
        System.out.println();



    }
    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:
    public static void printElements(List<String> myList){
        for(String w : myList){
            System.out.print(w + " ");
        }
    }

    //2.Yol:
    public static void printEl(List<String> myList){
        myList.stream().
                forEach(t-> System.out.print(t + " "));
    }

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElExceptStartsWithT(List<String> myList){
        myList.stream().
                filter(t->!t.startsWith("T")).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElLengthLessThanFour(List<String> myList){
        myList.
                stream().
                filter(t->t.length()<4).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourWithUpper(List<String> myList){
        myList
                .stream().
                filter(t->t.length()>4).
                map(t->t.toUpperCase()).
                 forEach(t-> System.out.print(t + " "));
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

    public static void tkrszBuyukHrfAlfabetikSiraYazdir(List<String >iller) {
        System.out.print("6) ");
        iller.
                stream().
                distinct().//tekrarsiz
                map(t->t.toUpperCase()).//yapisi gegisir buyuk harfe cevirdi
                sorted().//siralama yapar
                forEach(t-> System.out.print(t+" "));

/*
     sorted()==> 2 turlu kullanimi vardir.
     i) Icerisine arguman verilmezse,burada oldugu gibi
        sorted()natural order'a gore kucukten buyuge dogal siralaam yapar
     ii) sorted(Comparator) icerisine arguman verilirse bizim belirledigimiz parametreye gore siralama yapar
 */
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));
    }
//Example 8: Bir List'teki elemanlarin ilk harfini buyuk diger harflerini kucuk yazdiran methodu yaziniz.
    public static List<String> ilkHarfBykDigerKucukYazdir(List<String >myList) {
        System.out.print("8) ");
        myList.
                stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                forEach(t-> System.out.print(t+" "));
        return myList;
    }
// Example 9: Ilk Harfi "E" veya "S" olanlari yazdiran methodu olusturunuz

    public static List<String> IlkHarfveyaSoOlanlariYazdir(List<String>myList){
        System.out.println("9");
        return myList.
                stream().
                filter(t->t.startsWith("E") || t.startsWith("S")).
                collect(Collectors.toList()); // Bir akisin sonuclarini listin icinde toplamak icin kullanilir.

    }
}