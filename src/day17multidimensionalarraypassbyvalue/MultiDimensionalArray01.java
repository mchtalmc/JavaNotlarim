package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        /*
           1)1 array ın elemanları da array olursa bu tarz array lere "Multidimensional Array " denir.
         */
        String names [][] = new String[3][2];

        names[1][0]="P";
        names[2][1]="Z";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";

        //"Multidimensionall Array"leri console'a yazdırmak ıcın "toString()"
        // methodu degil deepToString() methodunu kullanırız
        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]

        //Multidimensional Array icinden specific bir eleman nasıl yazdırılır

        System.out.println(names[1][1]);//M

        //Multidimensional Array icindeki bir array ı yazdırmak
        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P, M]

        //Kısa yoldan Multidimensional Array nasıl olusturulur
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan","Seyhan"},{"Ceyhan", "Kayahan"} };

        //Example 1:Yukarıdaki student array ınde toplam kac isim oldugunu bulunuz.
        int sum =0;

        for (String[] w : students){
            sum = sum +w.length;
        }
        System.out.println(sum);

        //Example 2: Yukarıdaki students array inde icinde "m" olan isimleri console a yazdırınız

        for (String[] w : students){

            for (String k : w){
                if (k.contains("m")){
                    System.out.println(k);//Kemal, Cemal
                }

            }

        }

        //Example 3 : Bir integer multidimesional array olusturunuz. tum elemeların carpımını hesaplayınız
        int nums [][] = {{5,4}, {2,3,2}, {7}};
        int result = 1;

        for (int [] w : nums){

            for (int k : w){
                result = result*k;
            }
        }
        System.out.println(result);//1680

        //Example 4: Ikı boyutlu bir array ı tek boyutlı bir array a ceviriniz

        int numbers [][] = {{5,4}, {2,3,2}, {7}};

        //1.step: İki boyutlu array de kac eleman oldugunu bulan kodu yazmalıyız
        int toplamElemanSayısı = 0;

        for (int [] w : numbers){
            toplamElemanSayısı = toplamElemanSayısı + w.length;

        }

        //2.Step: Tek boyutlu array ı iki boyutlu array ın eleman sayısını kullanarak olusturmalıyız
        int newArr [] = new int[toplamElemanSayısı];

        //3.Step: Ikı boyutlu array deki elemanları tek boyutlu array e transfer etmeliyim
        int idx = 0;

        for (int [] w : numbers){

            for (int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2, 7]

        //Example 5: Bir integer multidimensional array dakı en kucuk ve en buyuk elemanın toplamını bulunuz

        int ages [][] = {{15,4}, {12,43,21}, {7}};

         int small = ages [0][0];
         int big = ages [0][0];

        // { {15, 4}, {12, 43, 21} }
        for(int[] w : ages){

            for(int k : w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small + big);





































    }

}
