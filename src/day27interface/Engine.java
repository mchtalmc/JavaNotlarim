package day27interface;

/*
1) "Interface" icine "concrete method" konulmaz.
2) "interface " icindeki methodlarin abstract oldugunu bilir, bu yuzden
" interfaace" icindeki abstract method'larda "abstract" keyword kullanmaya gerek yoktur.

3) "interface" icindeki tum abstract methodlarin tamami public'dir.
Bu yuzden "interface" icinde abstract method olustururken "access modifier" yazmaya gerek yoktur.

4) Bir "interface"'yi bir class'in parant'i yapmak istedigimizde EXTENDS yerine IMPLEMENTS keywordu kullanilir. ****************************

5) "Concret Child Class" lar "parent interface" deki "abstract method"lari override etmek zorundadirlar.

6- "Interface" Bir application'da "Concrete Child Class"larin yapmak zorunda oldugu fonksiyonlari barindirirlar
     Bu yuzden "interface"lere == TO-DO LIST ' de denir

7) Birden fazla parent "interface" icinde ayni isimli  abstract methodlar olusturabilirsiniz.
Abstract method'larin body'si olmadigi icin "Child Class"'lar ayni isimli method'lardan herhangi birini
override ederek kullanabilirler.

8) Birden fazla parent " interface" icinde ayni ismli abstract methodlar olusturdugunuzda
      Bu methodlarin RETURN TYPE'LARI AYNI OLMAK ZORUNDADIR.

9) Normalde "interface" icerisinde "CONCRETE METHO" konulamaz ama bazi ozel durumlarda
   i-"CONCRETE METHOD KOYMAMIZ GERKIRSE == DEFAULT KEYWORD'UNU ASAGIDA KI GIBI KULLANARAK
      interface icerisine CONCRETE METHOD KOYABILIRIZ.

      default void eco(){        // DEFAULT KEYWORD'UNU KULLANARAK INTERFACE'LARIN ICINE CONCRETE(BODY'SI OLAN) METHOD KOYABILIRIZ.
                                 //DEFAULT KEYWORD'U ACCESS MODIFIER DEGIL. Inteface'lerde CONCRETE method olusturmaya yarayan keyword'dur.
        System.out.println("Uses gas less");
    }





     ii- "Static keyword" unu asagidaki gibi kullanarak "interface" icerisine Concrete method olusturabiliriz.
       static void stop(){
        System.out.println("Stop securely...");
    }


    10) Static ya da default keyword'unu kullanarak olsurdugunuz "Concrete method"'larin
      Concrete Child Class'lar tarafindan kullanilma zorunlulugu yoktur
      Override edilme zorunlulugu yoktur.


    11) DEFAULT KEYWORDUNU KULLANARAK OLUSTURDUGUMUZ CONCRETE METHODLARA ULASMAK ICIN
       OBJECT OLUSTURARAK ULASABILIRIZ



        Static Keywordu kullanarak olusturdugumuz Concrete Method'lara ulasmak iicn

         Inteface ismi yeterlidir. Nesne olusturmaya gerek yoktur.




 */
public interface Engine {
    void start();

    void payment();

    default void eco(){        // DEFAULT KEYWORD'UNU KULLANARAK INTERFACE'LARIN ICINE CONCRETE(BODY'SI OLAN) METHOD KOYABILIRIZ.
                                 //DEFAULT KEYWORD'U ACCESS MODIFIER DEGIL. Inteface'lerde CONCRETE method olusturmaya yarayan keyword'dur.
        System.out.println("Uses gas less");
    }

    static void stop(){
        System.out.println("Stop securely...");
    }
}


