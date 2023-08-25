package day24datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-03-21T13:40:44.772189200

        DateTimeFormatter dtf = DateTimeFormatter .ofPattern("dd/MMMM/yyyy * HH : mm ");
        String formattedLdt = dtf.format(ldt);
        System.out.println(formattedLdt);//21/Mart/2023 * 13 : 48















    }
}
