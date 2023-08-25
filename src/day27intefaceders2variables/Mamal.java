package day27intefaceders2variables;

/*
    1) Class --> Class'in  Child'i olacaksa: EXTENDS
      Interface --> Interface'nin Child'i olacaksa : EXTENDS
      Class --> Interface'nin Child'i olacaksa: IMPLEMENTS

      Ama "INTERFACE" CLASS'IN PARANT'I OLMAZ
     */
/*
ABSTRACT CLASS ILE INTERFACE ARASINDA KI FARKLAR NELERDIR.

 1) Abstract Class'lar hem "abstract" hemde "concrete" method'lar icrebilir fakat Interface'ler sadece abstract method icerir
 Ama interface'lerde istersek "default" ve "static" keywordunu kullanarak "concrete method" uretebiliriz

 2) Abstract Class'lar multiple inheritence'yi desteklemez ama interface'ler destekler

 3) Abstract Class'lar icinde her turlu variable olusturulabilir
    Interface icerisinde olusturulan variableler "public, static , final" olmak zorundadir.

 4) Interface Class'in child'i olamaz ama
 Abstract Class, Class'in child'i olabilir

 5) Abstract Class'larda Concstructor vardir ama object uretemez

 Interface'lerde Constructor yoktur bu yuzden object uretilemez
 */

public interface Mamal extends Animal{

    String feedBaby= "Milk";

    int age= 6;


}



