package javaders.day14loops;

import java.util.Scanner;

public class Deneme04 {
    public static void main(String[] args) {
        //Kullanıcı username ve password'u girsin.
        //3 kereden fazla yanlıs girerse "Your account was blocked" mesajı alsın
        //3 kereye kadar yanlıs girerse "Invalid username or password,try again" mesajı alsın
        //Dogru girerse "Welcome to your account" mesajı alsın

        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUserName = "techpro123";
        String validPassWord = "Education12?";

        do{
            if(counter==3){
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("Please enter your username");
            String userName = input.next();

            System.out.println("Please enter your password");
            String passWord = input.next();

            counter++;

            if(userName.equals(validUserName) && passWord.equals(validPassWord)){
                System.out.println("Welcome to your account");
                break;
            }else{
                System.out.println("Invalid username or password");
                System.out.println((3-counter) + " right left");
            }
        }while(true);
    }
}
