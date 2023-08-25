package day31maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);

        //"key"i tekrarli kullandigimizda hata vermez ,en son verilen entry'nin degerini kabul eder
        //Bu yontem value guncellemede kullanilabilir.
        //Buna "overwrite" denir.

        stdAges.put("Tom", 83);


        //HashMap verilen entry'leri random siralar. Bu yuzden cok hizli calisir .
        //Map'ler entry'leri siralarken "key"lere bakarak siralama yapar.
        System.out.println(stdAges); // {Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}


        stdAges.replace("Ezel", 39); // Ezel 38 yasindaidi 39 yasina update ettik.
        System.out.println(stdAges); // Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}
        //Replace methodu value'leri , keyleri kullanarak , uptade(guncellemek) icin kullanilir.

        stdAges.replace("Angeline", 57,61); //
        //replace("Angeline" , 57, 61); methodu Map icin de "Angelina" , 57 varsa 57 i 61 e donusturur. Yoksa donusturmez.
        System.out.println(stdAges); // {Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}


        stdAges.putIfAbsent("Ali", 60);
        //putIfAbsent("Ali" , 60); methodu Map'de "Ali" key olarak yoska Map'e "Ali=60" i ekler, varsa eklemez.
        System.out.println(stdAges); // {Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39, Ali=60}

        System.out.println(stdAges.get("Tom"));



    }
}
