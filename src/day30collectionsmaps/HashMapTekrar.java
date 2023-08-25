package day30collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTekrar {
    //Map deyince akla sozcuk gelmeli
    /*
    Map'ler Key- Value kullanir ve 2 deger kullanir.
    Key kismi tekrarsiz , Value kismi tekrarli olabilir

    Bu yapinin ismine(Mapler'deki elemanlara) "ENTRY" deniyor.
    Map'lerde "ENTRY"LERIN TAMAMINA == "ENTRY SET" DENIR.
     */

    /*
    Map'lerde sozcuklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
    "key" kismi tekrarsiz, "value" tekrarli olabilir
    Map'lerde "key"  ve "value" structure'inin kullanir
    Map'lerdeki elemanlara "Entry" denir
    Elemanlarin tamamina ise "EntrySet" denilir
    "Entry'ler tekrarsiz oldugu icin "EntrySet" denir
    "Key" ve "Value"lar ayri ayri data typle'larinda olabilirler.

    Map'ler Collection degildir. Farkli bir yapidir.

    HashMap'ler "entry"leri rastgele siralar, bu yuzden en hizli MAP'TIR
     */
    public static void main(String[] args) {

        HashMap<String, Integer> countryPopulation = new HashMap<>();
        //Map'lere nasil Entry eklenir
        countryPopulation.put("Germany", 8300000);
        countryPopulation.put("Albania", 21312312);
        countryPopulation.put("USA", 2131231);
        countryPopulation.put("Turkey", 21312311);


        System.out.println(countryPopulation);  /// {USA=2131231, Turkey=21312311, Germany=8300000, Albania=21312312}

        //Map'lerde get() methodu  "VALUE" kismini verir.
        int usaPopulation= countryPopulation.get("USA");
        System.out.println(usaPopulation); //2131231

        // Butun key'leri nasil alabilirim
        //Key'leri Java bana "SET"'lerle verdi
        Set<String> keys= countryPopulation.keySet(); // [USA, Turkey, Germany, Albania]
        System.out.println(keys);


        //Butun "value"ler nasil alabilirim

        Collection<Integer> values= countryPopulation.values();// [2131231, 21312311, 8300000, 21312312]
        System.out.println(values);


        //Example 1: countryPopulation map'indaki ulkelerin nufuslarinin ortlamasini nedir

        Collection<Integer> value= countryPopulation.values();


        int sum=0;

        for (Integer w: value){
            sum+=w;
        }
        System.out.println(sum / value.size());

        //entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir.
        //Loop'lar map'ler ile kullanilmaz Sadece entry'ler arasinda gezmek istedigimizde loop kullanilabilir.


        Set<Map.Entry<String,Integer>> entries= countryPopulation.entrySet();

        System.out.println(entries); // [USA=2131231, Turkey=21312311, Germany=8300000, Albania=21312312]


        //Example 2 : countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.
        int toplam =0;

        for (Map.Entry<String,Integer> w: entries){
            toplam= toplam + w.getKey().length()+ w.getValue();

        }
        System.out.println(toplam);

    }
}
