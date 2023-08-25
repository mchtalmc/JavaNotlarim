package day19passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = "Tom Hanks";
        System.out.println(name);

        String updatedName = updateName(name, "ali");
        System.out.println(updatedName);//Tom Hanks Ali
        System.out.println(name);//Tom Hanks

        name = updateName(name, "senior");
        System.out.println(name); // Tom Hanks senior


    }
    public static String updateName(String name, String add){
       name = name + " " + add;
       return name;
    }



}
