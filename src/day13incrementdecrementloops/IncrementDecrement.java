package day13incrementdecrementloops;

public class IncrementDecrement {
    public static void main(String[] args) {

            //Increment
        int a = 5;
        System.out.println(a);//5
        a = a+2;
        System.out.println(a);//7

        //Example 1: Bir tane int variable olusturun

        int b = 10;
        System.out.println(b);//10
        b = b+5;
        System.out.println(b);//15
        b+=5;
        System.out.println(b);//20

        //Decrement
        int c = 8;
        System.out.println(c);
        c = c-3;
        System.out.println(c);
        c-=3;
        System.out.println(c);

        //Increment 2:
        int d =6;
        System.out.println(d);//6
        d = d*2;
        System.out.println(d);//12
        d*=2;
        System.out.println(d);//24


        //Decrement 2:

        int e = 24;
        System.out.println(e);//24
        e = e/2;
        System.out.println(e);//12
        e/=2;
        System.out.println(e);//6

        //"1" ile increment
        int f = 12;
        f = f+1;
        f+=1;
        f++;

        //"1" ilr decrement
        int h = 10;
        h = h-1;
        h-=1;
        h--;

        //post-increment ve pre increment

        int i = 10;
        int k = i++; //post-increment cunku variable isminden sonra increment işlemi yapıldı
        System.out.println(k);// 10 ==>"i" artirilmadan k sepetine konuldugu icin k nin degeri 10 olur
        System.out.println(i);//11 ==>  "i" satir sonunda artirildigi icin "i" nin degeri 11 olur

        int m = 15;
        int n = ++m; //pre-increment cunku variable isminden önce inrement işlemi yapıldı
        System.out.println(m);//16 ==> "m" satir sonunda artirildigi icin "m" nin degeri 16 olur
        System.out.println(n);//16 ==>"m" artirildiktan sonra n sepetine konuldugu icin "n" nin degeri 16 olur

        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;

        System.out.println(s);//19
        System.out.println(t);//19

        /*
        * 1) Increment arttırmak demektir. Decrement azaltmak demektir
        * 2) Increment toplama ce carpma ile, Decrement cıkarma ya da bölme ile yapılabilir
        * 3) Increment ve Decrement 3 yolla yapılabilir
        *        a) int i = 12; ==> i = i+5;
        *        b) int i = 12; ==> i +=5;
        *        c) int i = 12; ==> i++;
        *           Note: 3. yol sadece 1 arttırmak için kullanılır
        *
        *        a)  int i = 12; ==> i = i -5;
         *       b)  int i = 12; ==> i -=5;
         *       c)  int i = 12; ==> i--;
         *           Note : 3. yol sadece 1 azaltmak icin kullanilabilir
        *
         */






































    }
}
