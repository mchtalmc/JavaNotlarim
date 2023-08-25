package day13incrementdecrementloops;

public class AslıAbladanAldım {

    public static void main(String[] args) {
        // Massachusetts kelimesindeki tüm sesli harfleri konsola yazdırınız

        String s = "Massachusetts";
        for (int i = 0; i < s.length()-1; i++) {
            char ch = s.toUpperCase().charAt(i);
            if (ch=='a' || ch== 'A' || ch=='e'|| ch=='E'|| ch=='u' || ch == 'U'|| ch=='i'|| ch=='I'){
                System.out.print(ch);
            }
        }
















    }
}
