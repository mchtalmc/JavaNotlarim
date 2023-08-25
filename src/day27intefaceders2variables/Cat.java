package day27intefaceders2variables;

public class Cat implements Mamal{

    @Override
    public void eat() {

    }

    @Override
    public void drik() {

    }

    public static void main(String[] args) {
        System.out.println(Animal.age+ ": ANIMAL INTERFACEDE KI AGE"); // Degistirlemez FINAL METHOD
        //Age variable'si default olarak static oldugu icin Inteface adiyla ulasabiliyoruz
        System.out.println(Mamal.feedBaby);
        System.out.println(Mamal.age+": Mamal INTERFACEDE KI AGE");

        //***System.out.println(age);
        // Bu sekilde yapilirsa inheritance mantigiyla
        // bir ust parent'a gider bulamazsa onun bir ustune gider
        //NOT: Interface'larda Interface adini yazmadan variable cagirlmamalidir cunku
        //Kimin variable'si oldugu anlasilmaz ve okunurluk acisindan zararlidir.




    }
}
