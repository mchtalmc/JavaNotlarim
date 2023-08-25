package day27intefaceders2variables;

public interface Animal {


    void eat();


    void drik();


    /*
    1) Interface'lerdeki tum variable'lar otomatik (default) olarak "final"dir

    Bu yuzden intefface icindeki variable'i olusturdugunuzfa mutlaka deger atamasi yapalisiniz
    Bilindigi gibi final variable'larin degeleri degistirelemez

    2) Interface'lerdeki tum variable'lar otomatik(default) olarak "public"tir
    3) Interface'lerdeki tum variable'lar otomatik(default) olarak "statick"tir


     */
    int age = 4;

}
