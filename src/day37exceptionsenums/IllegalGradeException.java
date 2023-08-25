package javaders.day37exceptionsenums;

public class IllegalGradeException extends  Exception{
    /*
    1) Custom Exception Class olsturmak icin Exception Class'a extend etmeliyiz.
    Exception Class'a extend ederek olusturdugunuz Custom Exception "Compile Time Exception" olur.

    2) Custom Exception Class olusturueken "Cosntructor" olusturmalisiniz.


      3) Custom Exception Class olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmalisiniz
      IllegalGraddeException


     */
    public IllegalGradeException(String message){
        super(message);
    }
    public IllegalGradeException(){
        super();
    }

}
