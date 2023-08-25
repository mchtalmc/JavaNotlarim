package day16arraysforeachloop;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        //Specific bir elemanın array de olup olmadıgını anlamak ıcın gerekn kodu yazınız
        String names [] = {"K" ,"C", "R", "A", "S"};
        String el = "E";

        //1.Way
        int counter = 0;

        for (String w : names){

            if (w.equals(el)){
                counter++;
                break;
            }
        }

        if (counter>0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array does not have " + el);
        }

        //2.Way: binarySearch() method hızlı arama yapar
        Arrays.sort(names);

        //1)binarySearch() methodu sort() kullanmadan kullanmayınız cunku binarySearch() mantıgı sureklı sıralı
        //elemanlar ıcın gereklıdır
        //2)binarySearch() methodu var olan elemanlar icin size o elemanın index'ini verir
        //3)binarySearch() methodundan aldıgınız index 0 veya 0 dan butuk ise bu o eleman array de var demektir
        //4)binarySearch() methodu olmayan elemanlar ıcın negatif tam sayi degeri verir.eman olacak
        //"-" isaretinin anlamı o eleman yok demektirtı
        //"sayi" ise o eleman olsaydi kacıncı eleman olurdu demektir

       int result = Arrays.binarySearch(names, el);
        System.out.println(result);//0


        if (result<0){
            System.out.println("Array does not have " + el);
        }else{
            System.out.println("Array has " + el);
        }













    }
}
