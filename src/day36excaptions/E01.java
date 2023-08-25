package day36excaptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E01 {
    /*
    1- Run Button'una basiktiktan sonra colsole'da alinan Exception'lara "Runtime Exception" denir
      Arithmetic Exception, NullPointerException, NumberFormatExceptions, ArrayIndexOutOfBoundsException, StringIndexOfBoundsException
      "Runtime Exception"'an orenktir.
      "Runtime Exception"lara "unchecked Exception" da denir.



    2- Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
       FileNotFoundException, IOException "Compile Time Exception"'a ornektir.

       a- FILE NOT FOUNT EXCEPTIONS: Java'ya bir dosyayi bul dedigimizde, Java "dosyanin adresi" ve "dosyanin varligi" konusunda
         hata olusursa ne yapmasi gerektigini soylemenizi ister.


       b- Input Output Exception== IOException:
            Note: IOExceptions, FileNotFoundException'in parent'idir.




-------------------------------------------------------------------------------------------------------------------------------------------------------------
     4- Java'da hatalar temelde 2 ye ayrilir
        i-Exceptions'



        ii-Error'lar
        a- StackOverflow Error==> Stack Memory'nin dolmasi ve is yapamaz hale gelmesi. Application'un yavaslamasi.
        b- Out of Memory Error==> Heap Memory'nin dolmasi sonucunda alinir.
        c- Virtual Machine Erorr==> Java'nin icinde ki sanal bir makine var ve o makine arizalnirsa. Java calisamaz.


     */

    public static void main(String[] args) throws IOException {


        FileInputStream TextFile= new FileInputStream("C:\\Batch151\\Batch151\\src\\javaders\\day36excaptions\\TextFile");


        int i= 0;

        while((i= TextFile.read())!=-1){ // Butun okumasi gereken karakterler bittiginde -1 olacacak o yuzden -1e kadar devam etmesi isteniyor

            System.out.print((char)i);// Ascii degerleri okudugu icin burada char kullanarak harf harf aldik

        }
// TEXTFILE I YAZDIRMAK ICIN DONGU OLUSTURULDU.
        //Read methodu ascii degerleri okudugu icin

    }




}
