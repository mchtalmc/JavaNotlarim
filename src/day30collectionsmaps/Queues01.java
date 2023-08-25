package day30collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse= new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");

        //Ilk giren ilk cikmalidir.

        System.out.println(wareHouse); // [Milk, Meat, Bread, Egg, Cheese] Verildigi sirada yazdirir

    }
}
