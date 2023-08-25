package day17multidimensionalarraypassbyvalue;

public class PassByValue01 {
    /*
         Method olusturmak ıcın asagıdakı 5 adımı takip ediniz
         1)Access Modifier
         2)Return Type
         3)Method Name
         4)Method Parantez
         5){} method body icin

         Note:"main method" un icindeki tum methodlar static olmalıdır.
               Bir methpdu static yapmak ıcın "access modifier" ile "return type"
               arasına "static" yazmak yeterlidir.

         Pas by Value:
           1)Java "Pass by Value" kullanır
           2)Yani; Java methodların orijibal degeri degistirmesine müsaade etmez
           3)Java methodllara deger yollarken orijinal degerin kopyasını kopyasini olusturur
             ve o kopyayi methoda yollar, method da kopya uzerinde degisiklik yapar
             java bunu yaparak orijinal degeri korur.
           4)java esnek bir dildir. istersek yazdigimiz kod ile orijinal degerin
             degismesini de temin edebiliriz
             Bakınız

           Pass by Reference:
             1)Pass by Reference da method a reference yollanır.
             2)Reference adres demektir. Adres yollanınca method adresi kullanarak orijinal degere ulasır ve
               orijinal degeri degistirir.
               Bu yüzden "C#" gibi Pass by Reference kullanan dillerde method variable'nin orijinal degerini degistirir


     */
    public static void main(String[] args) {

        int shirtPrice = 200;
        System.out.println(discount("student", shirtPrice));
        System.out.println(shirtPrice);

        shirtPrice = discount("veteran", shirtPrice);
        System.out.println(shirtPrice);



    }
    //Discount Methodu olusturunuz
    public static int discount (String type, int price){
        switch (type){
            case "student":
                price = price - 20;
                break;
            case "veteran":
                price = price - 40;
                break;
            case "senior":
                price = price - 30;
                break;
            default:
                price = price;
        }
        return price;

    }
}
