package javaders.day34exceptions;

public class E01 {


        //Exceptions== Umulmadik problem
        //Exceptions Handling== Umulmadik problemleri idader etmek, cozum bulmak.
        /*
        1- "Exceptions" beklenmedik problem demektir.
        2- "Exceptions"'lari halledbilmek icin iki temel yol vardir;
            i- Exceptions'a uygun cozumler uretebilirsiniz. Buna Exceptions Handling denir
            ii- Exceptions olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exception" denir.
         3- Exeception'a uygun cozumler uretmede ( TRY- CATCH) kullanilir.
            i- "Try Block'ta" yapilmasi gereken islemi Java'dan yapmasi istenir.
            Java islemi problemsiz bir sekilde yaparsa"catch block" Java tarafindan okunmaz.
            ii- "Try block'ta" islem yapilirken "Exceptions" olusursa, "CATCH BLOCK" devreye girer ve
            "catch block" icerisindeki kodlar calisir.

         4- "Try Block'da" islem yapilriken "Exception" olusursa "try block" icerisindeki Exceptions'tan sonra ki kodlar calistirilmaz.


         */
        public static void main(String[] args) {

            System.out.println(divide1(12,3));
            System.out.println(divide1(6,0));

            System.out.println(divide2(12,3));
            System.out.println(divide2(6,0));


        }

    //1.Way: Exception'i handle etmede ilk ve igrenc yol. KULLANMAYIN KESINLIKLE////// HANDLING YAPILMAZ BU SEKILDE
    public static int divide1(int a, int b){
        if(b==0){
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way: Exception'i handle etmede harika yol
    public static int divide2(int a, int b){
        int result = 0;

        try{
            result = a/b;
            System.out.println("I am here"); // Eger EXCEPTIONS VARSA KOD DIREKT BURAYI GECER VE CATCH ICERISINE GECER.
        }catch(ArithmeticException e){ // ArithmeticException Matematikle ilgili herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("There is an issue in division");
        }
        return result;
    }
}
