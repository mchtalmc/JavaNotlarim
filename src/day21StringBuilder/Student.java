package day21StringBuilder;

public class Student {

    public static boolean numOfRegisteredStd;
    //stdName "public" oldugu icin diger class'lardan ulasılabilir
    public String stdName = "Ali Can";

    //Access Modifier i 1default" olan ile "public" olan class member lar aynı package icinde
    //kullanıldıklarında aynı özellikleri gösterirler.
    //Fakat farklı package a gectiginizde, "public" olanlara ulasılabilir,
    //default olanlara ulasılamaz
    public int age = 23;
    public boolean num;

    //Access Modifier i "private" olanlar Class Member lar sadece olusturdukları
    //Class icinden gorülebilirler
    //Olusturulduklari class'in disina ciktigimizda gorunmez, ulasilmaz olurlar.
    private String healthCondition = "Cancer";


    //Access Modifier'i "protected" olan Class Member'lar ayni package icinde iken "public"gibi davranirlar.
    protected int salary = 3000;

    //NOTE :Class'a private yazamayiz Java hata verir. Cunku Class'lar kaliptir. Kalip private olursa ona kimse ulasamaz
    //Note: Class'lar public veya default olabilir ama private ve protected olamazz
}
