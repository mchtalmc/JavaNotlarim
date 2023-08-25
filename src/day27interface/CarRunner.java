package day27interface;

public class CarRunner {
    public static void main(String[] args) {

        Engine.stop(); // STATIC KEWORDLA OLUSTURULAN CONCRETE METHODA INTERFACE CLASS ISMIYLE ULASABILIYORUZ.


        Honda h= new Honda();

        h.eco(); // Default keywordu ile olsuturuldugundan Object ile ulasabilirim.
                 // Eco() method'u static olmadigi icin(DEFAULT METHOD) "object" ismi ile ulastim.




    }
}
