package day24datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
       LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//12:35:47.024163100

        int hour = myCurrentTime.getHour();
        System.out.println(hour);//12

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//36

        int second = myCurrentTime.getSecond();
        System.out.println(second);//41

        int nano = myCurrentTime.getNano();
        System.out.println(nano);//617939700

        //Gelecek ve gecmış zamana nasıl gidilir
        LocalTime next = myCurrentTime.plusMinutes(10).minusHours(1);
        System.out.println(next);//saat 12.42 idi 11:52:05.788184900 saati 1 saat geri aldı

         //Zaman formatı nasıl degistirilir?
        //DateTimeFormatter.ofPattern(); methodu kullanarak degistireblirliz

        /*
        *********Date time class ta kullanılan tarih saat formatları****
        1)"HH" : "mm" ==> 24'lu saat sistemi
        2)"hh" a: "mm" ==> 12'li saat sistemi AM , PM gosterilmez
        3)pm ==> ogleden sonra am ==> ogleden once
        4)"hh" : "mm" : "ss" saniyeyi gosterir
        5)"HH" : "MM" yanlsi formattir cunku MM aylar icin kullanilir
        6)"mm" minute demektir , "MM" month demektir
        7)"dd" : "MM" : "yyyy" gun - ay - yil
        8)"MMM" Aug olarak bize verecektir
        9)"MMMM" August olarak bize verecektir
        10)"yy" 23 seklinde bize verir
 */


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh : mm : ss a");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);//01 : 05 : 51 ÖS

        LocalDate myCurrentDate = LocalDate.of(2023,8,25);
        System.out.println(myCurrentDate);//2023-08-25

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);//08/25/2023

        //Tarihi Gun / Ay isminin ilk 3 harfi verecek sekle ceviriniz 25/Aug/23

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String format = dtf3.format(myCurrentDate);
        System.out.println(format);//25/Ağu/23

        //Tarihi 25/August/2023 sekline cevirin

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String format1 = dtf4.format(myCurrentDate);
        System.out.println(format1);//25/Ağustos/2023

        //Baska bir zaman dilimindeki tarih ve zamanı nasıl alırız?

        //Tokyo da ayın kacı?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-21

        //Amsterdam'da ayın kacı?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2023-03-21

        //Tokyo'da saat kac
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//19:36:32.901178200



















    }
}
