package day30collectionsmaps;
import java.util.Collection;
import  java.util.HashMap;

public class HasMaps01 {
    /*
    MY NOTES:
    Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
            "key" kismi tekrarsiz, "value kismi birden fazla olabilir.
    Mapler "key" ve "value" structur'ini kullanir.
    Map'lerdeki elemanlara "entry" denir.
    Elemanlarin tamanina ise "entry set" denilir.
    Tekrarsiz kullanim oldugu icin "Entry Set"denilir

 */

    public static void main(String[] args) {

        HashMap<String, Integer> countryPopulation= new HashMap<>();


        countryPopulation.put("Germnay", 83000000);
        countryPopulation.put("Albenia", 3000000);
        countryPopulation.put("USA", 450000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);

        System.out.println(countryPopulation);


        //Verilen ulkelerini nufusunun ortalamasini aliniz.

        Collection<Integer> values= countryPopulation.values();
        int sum=0;
        for (Integer w : values){
            sum= sum+w;
        }
        System.out.println(sum/values.size());

    }


    }
