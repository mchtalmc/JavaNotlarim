package day30collectionsmaps;

import java.awt.desktop.QuitEvent;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02Tekrar {
    public static void main(String[] args) {

        Queue<String> line= new PriorityQueue<>();
                                // Concstructor olarak PriorityQueue Kullandik
// Kendi icinde bir sistem ile siralama yapar. Istenilirse belirlenen sartlara gore siralama yapilabilir
        // Bir bankanin ozel musterisi ve normal mustersine karsi yaptigi oncelik gibi dusunelim


        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");

        System.out.println(line); // [Egg, Milk, Meat, Orange, Tomatoes] ==> Kendi sistemine gore siraladi


        Deque<String> d = new LinkedList<>();
         // Double Ended= deq kullanilir. Mesela otobuse ilk binen arka kapidan rahat iner.
        // Son binen ise on kapidan rahat bir sekilde iner
        // Iki uclu senaryolar iicn DOUBLE ENDED QUE Kullanilir.

        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");



    }
}
