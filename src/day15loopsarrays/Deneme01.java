package javaders.day15loopsarrays;

import java.util.Arrays;

public class Deneme01 {
    public static void main(String[] args) {
        String stdNames [] = new String[5];
        stdNames[0]= "ALI";
        stdNames[1]= "ALI";
        stdNames[2]= "ALI";
        stdNames[3]= "ALI";
        stdNames[4]= "ALI";

        System.out.println(Arrays.toString(stdNames));

        for (int i=0; i<stdNames.length; i++){
            System.out.print(stdNames[i] + "*");
        }
        System.out.println();

        for (String w: stdNames){
            System.out.print(w + "*");
        }

        //Example 2: Bir Integer Array olusturunuz, 5 eleman ekleyiniz,elemanların toplamını bulup console'a yazdırın

        int ages[] = new int[5];
        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 9;
        ages[3] = 38;
        ages[4] = 27;
        System.out.println(Arrays.toString(ages)); //[12, 23, 9, 38, 27]

        int sum=0;

        for (int w: ages){
            sum=sum+w;
        }
        System.out.println(sum);
        System.out.println();

        //Example 3: Bir char array olusturunuz 3 eleman ekleyiniz elamanların çarpımıbı bulup console'a yazdırınız

        char initials[] = new char[3];
        initials[0] = 'J';
        initials[1] = 'P';
        initials[2] = 'A';


        int results = 1;
        for (char a : initials){
            results = results * a;
        }
        System.out.println(results); // 384800

    }
}
