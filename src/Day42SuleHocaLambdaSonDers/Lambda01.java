package Day42SuleHocaLambdaSonDers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //EX 1) Bir metin dosyasındaki tüm satırları okuyun ve ekrana yazdırın.
        System.out.println("Ex 1) ");

        Files.lines(Paths.get("src/Day42SuleHocaLambdaSonDers/Txt.File")).
                forEach(System.out::println);


        // Ex 2) Bir metin dosyasındaki tüm satırları büyük harflerle okuyun ve ekrana yazdırın.
        System.out.println("Ex 2) ");

        Files.lines(Paths.get("src/Day42SuleHocaLambdaSonDers/Txt.File")).
                map(String::toUpperCase).
                forEach(System.out::println);


        // Ex 3) Bir metin dosyasındaki herhangi bir satırda "Java" kelimesi var mı yok mu kontrol edin.
        System.out.println("Ex 3) ");

       boolean varMI= Files.lines(Paths.get("src/Day42SuleHocaLambdaSonDers/Txt.File")).
               anyMatch(t->t.contains("Java"));

        System.out.println(varMI);


        // Ex 4) Bir metin dosyasındaki tüm farklı kelimeleri bir liste içinde döndürün.
        System.out.println("Ex 4) ");
        List<String> newList=
        Files.lines(Paths.get("src/Day42SuleHocaLambdaSonDers/Txt.File")).
                map(t->t.replaceAll("[\\p{Punct}], "," ").
                        split(" ")).
                flatMap(Arrays::stream).
                collect(Collectors.toList());

        System.out.println(newList);


        // Ex 5) Bir metin dosyasındaki tüm harflerin sayısını hesaplayın.
        System.out.println("Ex 5) ");

        Long second = Files.
                lines(Paths.get("src/Day42SuleHocaLambdaSonDers/Txt.File")).
                map(t -> t.replaceAll("[^A-Za-z]", "")).
                map(t -> t.split("")).
                flatMap(Arrays::stream).
                count();

        System.out.println(second);


        // Ex 6) Bir metin dosyasındaki tüm harfleri alfabetik olarak ters sırayla bir listeye ekleyin.
        System.out.println("Ex 6) ");

        List<String> third=
                Files.lines(Paths.get("src/Day42SuleHocaLambdaSonDers/Txt.File")).
                        map(t->t.replaceAll("[^A-Za-z]", "").split("")).
                        flatMap(Arrays::stream).
                        sorted(Comparator.reverseOrder()).
                        collect(Collectors.toList());

        System.out.println(third);


    }
}

