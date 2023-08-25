package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    /* Pass by value
       1) Java Pass by Value kullanır.
       2) yani; Java methodların orijinal degeri degistirmesine müsaade etmez
       3) Java methodlara deger yollarken orijinal degerin kopyasını olusturur ve o kopyayı methoda o yolar
          Method kopya deger uzerinde degisiklik yapar, boylece orijinal deger korunmus olur
       4) Java esnek bi dildir, ıstersek yazdıgımız kod ile orijinal degerin degismesini temin edebiliriz
        bakiniz line 31-32:

        Pass By Reference :
        1) Pass by reference da methoda reference yollanir
        2) Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
            Bu yüzden C# C++ gibi Pass by reference kullanan dillerde method variable orjinal degerini degisitirir

     */

    public static void main(String[] args) {

        int shirtPrice = 100;
        //burada pass by value sayesinde shirtPrice degeri koruma altına alınır
        int studentShirtPrice = discount("student", shirtPrice);
        //methoda gönderirken degeri degil kopyasını gonderir ve degisen deger kopyası olur orijinal degil.
        System.out.println("studentShirtPrice = " + studentShirtPrice);
        System.out.println("shirtPrice = " + shirtPrice);

        System.out.println(discount("veteran", shirtPrice));//80
        System.out.println(shirtPrice);//100

        shirtPrice = discount("senior", shirtPrice);
        System.out.println(shirtPrice);


    }

    public static int discount(String type, int price){
        switch (type){
            case "student":
                price = price -10;
                break;
            case "veteran":
                price = price -20;
                break;
            case "senior":
                price = price -5;
            default:
                price = price;
        }
        return price;
    }

}
