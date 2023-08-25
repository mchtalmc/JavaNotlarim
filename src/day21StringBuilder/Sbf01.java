package day21StringBuilder;

public class Sbf01 {
    /*
        1)StringBuffer Java da String ureten bir Class'tır
        2)StringBuffer, StringBuilder a cok benzer, Yani ikisi de mutable String üretir
        3)StringBuffer "multi-thread" dır ama StringBuilder "multi-thread" degildir.
        4)Java StringBuffer' i, StringBuilder' dan once olusturdu.
        5)StringBuilder "multi-thread" olmadıgı ıcın StringBuffer' dan daha hızlı calısır
        6- "multi-thread" yapilirken yapilan islemlerin siralamsi onem arz eder.
                        -yapilan islemleri mantikli bir siraya koymak "synchranization" olarak adlandirilir.
                       - Stringbuffer multu-thread oldugu icin ayni zamanda "synchranized" dir

        3 tane String olusturan Class ogrendik
        1)immutable string lazımsa; String Class
        2)mutable string lazımsa; StringBuilder veya StringBuffer
                                 i)StringBuilder i multi-thread gerekmezse kullanırız
                                 ii)StringBuffer' ı multi-thread gerekirse kullanırız
     */

    public static void main(String[] args) {
        StringBuffer sbf1 = new StringBuffer("Java");
    }

}
