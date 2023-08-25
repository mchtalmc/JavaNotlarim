package day14loops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        //Kullanıcı username ve password'u girsin.
        //3 kereden fazla yanlıs girerse "Your account was blocked" mesajı alsın
        //3 kereye kadar yanlıs girerse "Invalid username or password,try again" mesajı alsın
        //Dogru girerse "Welcome to your account" mesajı alsın

        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUserName = "techpro123";
        String validPassWord = "Education12?";

      do {

          System.out.println("username giriniz");
          String kullanıcıuser=input.next();
          System.out.println("password girin");
          String kullanıcıpassword=input.next();
          counter++;

          if (validUserName.equals(kullanıcıuser) && validPassWord.equals(kullanıcıpassword)){
              System.out.println("hesabınıza hos geldiniz");
              break;

          }else System.out.println("username ya da password yanlıs tekrar deneyin " + (3-counter)+ " hakkınız kaldı");
          if (counter==3){
              System.out.println("Bloke oldu");
              break;
          }

      }while (true);














    }
}
