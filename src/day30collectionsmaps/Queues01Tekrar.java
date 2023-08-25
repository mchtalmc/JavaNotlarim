package day30collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01Tekrar {
    public static void main(String[] args) {
        Queue<String > wareHaouse= new LinkedList<>();
                                       // Concstrucotr olarak LinkedList kullandigimiz icin Elemanlari verdigimiz sekilde listeledi.





        //Queue First in first out mantigiyla calisir ilk giren ilk cikar
        //Banka'da ilk fisi alan ilk siraya girer ve ilk onun isi gorulur. Queue bu sekilde calisir

        wareHaouse.add("Milk");
        wareHaouse.add("Meat");
        wareHaouse.add("Bread");
        wareHaouse.add("Egg");
        wareHaouse.add("Cheese");


        //Queue'de ilk yazilan ilk cikar mantigiyla calisir Bu yuzden asagidaki methodlarin hepsi overloadingsiz bir sekilde verilmistir Queue'de

        //add(),remove(ilk elemani siler), peek(Ilk elemani size verir), element(ilk elemani size verir), pool(ilk elemani size verir)


        System.out.println(wareHaouse); //[Milk, Meat, Bread, Egg, Cheese]

        wareHaouse.remove(); // Milk'i sildik
        System.out.println(wareHaouse); // [Meat, Bread, Egg, Cheese]

        System.out.println(wareHaouse.peek()); // Meat' silmeden verdi
        System.out.println(wareHaouse); //[Meat, Bread, Egg, Cheese]
        //peek() bos Queue'ler icin "NULL" VERIR*************


        System.out.println(wareHaouse.element()); // Meat'i silmeden verdi.
        System.out.println(wareHaouse); // [Meat, Bread, Egg, Cheese]
        // Element() bos Queue'ler icin "HATA" VERIR**********


        System.out.println(wareHaouse.poll()); // Meat'i verir ve siler
        System.out.println(wareHaouse); // [Bread, Egg, Cheese]
        // pool() bos Queue'ler icin "NULL" verir**********

        wareHaouse.clear();

        System.out.println(wareHaouse.poll()); // Null
        System.out.println(wareHaouse.remove());// Exception


    }
}
