package day18constructorsstatickeyword;

/*
    1)Constructor nasıl olusturulur?
          Access Modifier + Class Ismı + () + {}
    2)"Method" ile "Constructor" arasındaki farklar nelerdir?
          i)"Method"larda "return type" olur, "Constructor"larda olmaz
          ii)"Method" lar yaptıkları ise göre isimlendirilirler, "Constructor" lar ise her zaman "Class ismi"
              ile isimlendirilir.
          iii)"Method" lar bir aksiyn yapmak icin olusturulur, "Constructor" lar ise object olusturmak icindir
          iv)"Method" isimleri kıcık harfle baslar "Constructor" isimleri "Class Ismi" ile ayni oldugu icin
              buyuk harfle baslar

    3)3)Parametreli Constructor'lar olusturarak ayni class'dan farkli ozelliklere sahip object'ler olusturabiliriz

 */

public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;



    //Default Constructor
    //Default Constructor'lar "parametre" kullanmazlar.
    //Default Constructor'ların body si bostur.
    //Java kıskanctır. Siz Default Constructor ' ı elle yazdıgınızda
    // Java Object  Class icindeki Default Constructor'ı kullandırmaz

    public  Car(){

    }

    //Custom Constructor
    public Car(String make, String model, int year, int price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    //Custom Constructor
    public Car(String make){
        this.make = make;
    }


    //Custom Constructor
    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }

















}
