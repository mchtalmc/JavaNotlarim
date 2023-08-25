package day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {


    public StaticNonStaticBlocks02() {
        System.out.println("I am constructor 1");
    }

    public StaticNonStaticBlocks02(int price) {
        System.out.println("I am constructor 2");
    }

    public StaticNonStaticBlocks02(String name) {
        System.out.println("I am constructor 3");
    }

    public StaticNonStaticBlocks02(boolean isOld) {
        System.out.println("I am constructor 4");
    }

    //non-static block constructor'larda ortak calistirilmasi gereken ortak kodlari icerir
    //non-static block icindeki kodlar her constructor icin kullanilir.
    //Bir den fazla non-static block varsa üstteki önce calıstırılır

    {
        System.out.println("I am constructor- 2");
    }
    {
        System.out.println("I am constructor- 1");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);
    }


    /*
      I am constructor- 2
      I am constructor- 1
      I am constructor 1
      I am constructor- 2
      I am constructor- 1
      I am constructor 2
      I am constructor- 2
      I am constructor- 1
      I am constructor 3
      I am constructor- 2
      I am constructor- 1
      I am constructor 4
     */




}
