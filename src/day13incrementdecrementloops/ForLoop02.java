package day13incrementdecrementloops;

public class ForLoop02 {
    public static void main(String[] args) {

        //Example 1: Verilen bir String'te ilk "a" harfinden önceki tüm karakterleri console yazdırın
        //           "I love Java" ==> "I love J"

        String s = "I love Java";
        for (int i =0; i<s.length(); i++){

            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));
        }

        System.out.println();


        //Example 2: Verilen bir String de son  'a' dan sonraki tüm characterleri ters sirada yazdırımız
        //           "Germany" ==> yn

        String str = "Germany";
        for (int i = str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }




















    }
}
