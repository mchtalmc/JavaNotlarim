package javaders.day27encapsulatıon;
public class Student {

    public  String stdName= "Tom Hanks";
    public int age =23;
    //Encapsulation ==> kelime anlami itibari ile kapsulleme demektir
    //Encapsulation Data Hiding (==>Veri saklamak)
    //Data nasil saklanir?
    //Acces Modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm. Boylece datayi saklarim
    private String stdId = "AC2023102T";

    private double notOrt = 3.53;
    private boolean succesful = false;
    //Encapsulation yaptigimiz data yi istersek diger classlardan okuyabiliriz
    //Nasil okuruz?
    //"get method" olusturarak Encapsulate edilmis datanin degerini okuyabiliriz
    //get method lar public olur
    //get methodun return type i okudugu variable in return type i ile ayni olur
    //get method bir boolean variable icin olusturulduysa eger ismi "is" ile baslar


    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }
    public boolean isSuccesful() {
        return succesful;
    }

    /*
    Encapsulation yaptigimiz datayi istersek diger classlardan degistirebiliriz
    Nasil degistirebiliriz?  
    "set method" olusturarak Encasupal ettigimiz datanin degerini degistirebiliriz
         a- set methodlar her zaman "public" olur
         b- set methodlarin return type'i her zaman void olur
         c- set methodlar parametre kullanir. parametrenin data type'i variable ile ayni
         olmak zorundadir


     ==>  Set mehod kullanarak varolan object uzerinde degisliklikler yaparak o object'i
       sanki yeni bor object gibi kullanabiliriz.

       get methodlar == getter
       set methodlar== setter  DENIR
     */




    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }
    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}