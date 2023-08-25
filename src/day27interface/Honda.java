package day27interface;

public class Honda implements Engine, Break{
    @Override
    public void start() {
        System.out.println("Start...");
    }

    @Override
    public void payment() {
        System.out.println("Hangi fonksiyonu odeme istiyorsan burada method body icerisinde belirtirim");
        System.out.println("Her ikisinide karsilamak istersem buraya 2 farkli sekilde kod yazabilirim");
        System.out.println("Ayni isimli method koymak tavsiye edilmez");
    }


    @Override
    public void slow() {
        System.out.println("Slow...");
    }


}
