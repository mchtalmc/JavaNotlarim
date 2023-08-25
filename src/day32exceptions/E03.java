package day32exceptions;

public class E03 {
    public static void main(String[] args) {
       //System.out.println(getNumOfChars("Java")); //4
     // System.out.println(getNumOfChars("Money")); // 5
     //  System.out.println(getNumOfChars(""));

      System.out.println(getNumOfChars(null));

    }
    //Bir string'deki character sayisini veren method olusturunuz.

    public static int getNumOfChars(String s){
        int result= 0;

        try {
            result= s.length();

        }catch (NullPointerException e){ // "NullPointerException" String Class'da "null" ile uyumlu olmayan methodlar kullanildiginda atilir.

            System.out.println("Some String methods do no work with nul...");
            System.out.println(e.getMessage()); // Java'nin Excaption icin urettogo teknik mesaji varsa verir.
           // e.getMessage()== JAVANAIN EXCEPTION HAKKINDA URETTIGI MESAJI VERIR

        }
        return result;
    }
}
