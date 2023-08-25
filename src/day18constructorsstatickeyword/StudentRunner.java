package day18constructorsstatickeyword;


import day21StringBuilder.Student;

public class StudentRunner {
    public static void main(String[] args) {

        //static olmayan "numOfRegisteredStd" variable ini cagırmak icin sadece class ismini kullandık,
        // object olusturmadık.
        System.out.println(Student.numOfRegisteredStd);

        //static olmayan "num" variabble' ini cagırmak icin object kullandık.
        Student s1 = new Student();
        System.out.println(s1.num);

        //static olan "numOfRegisteredStd" variable' ina object üzerinden de ulasabilirsiniz ama hatadır
        System.out.println(s1.numOfRegisteredStd);

















    }
}
