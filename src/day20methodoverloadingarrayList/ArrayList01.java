package day20methodoverloadingarrayList;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {

        //ArrayList nasıl olusturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //ArrayList console a nasıl yazdırılır?
        System.out.println(ages);//[]

        //ArrayList e eleman nasıl eklenir?
        //ArrayList e elaman eklemek icin add() methodu kullanılır.
        //add() methodu elemanları sizin verdiginiz sırada List e ekler==> insertion order

        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages);//[9, 12, 10]
        ages.add(1,656);
        System.out.println(ages);//[9, 656, 12, 10]
        ages.add(3,777);
        System.out.println(ages);//[9, 656, 12, 777, 10]
        ages.add(888);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List e coklu elemean nasıl eklenir? veya List e baska bir List nasıl eklenir?
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //ArrayList te eleman sayısı nasıl bulunur?
        //size() methodu bir List teki elemen sayısnı verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //ArrayList te specific bir eleman nasıl alınır?
        //get () methodu index kullanarak istediğimix elemanı almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //ArrayList te specific bir eleman nasıl degistirilir
        ages.set(2,313);
        System.out.println(ages);//[9, 656, 313, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        ages.set(4,353);
        System.out.println(ages);//[9, 656, 313, 9, 353, 12, 777, 10, 888, 8, 9, 10]

        //Bir List teki tüm elemenları nasıl silebiliriz?
        //ages.clear();
        //System.out.println(ages);//[]

        //ArrayList ete specific bir elemanın olup olmadıgını nasıl anlarız?
        boolean r = ages.contains(656);
        System.out.println(r);//true

        //Bir ArrayList in bos olup olmadıgını nasıl kontrol ederiz?
        //is empty () methodu ArrayList bos ise true bos degilse false return eder.
        boolean r2 = ages.isEmpty();
        System.out.println(r2);//false

        ages.clear();
        System.out.println(ages);//[]
        boolean r3 = ages.isEmpty();
        System.out.println(r3);//true

        //Example 1: Bir list in os olup olmadıgını kontrol eden kodu yazınız
        ArrayList<String> names = new ArrayList<>();
        names.add("usame");
        names.add("fatih");
        names.add("ali");
        names.add("ufuk");

        //1.Way:burada 2 iş var
        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }//List has at least 1 element

        names.clear();

        //2.Way: Recommended
        if (names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }//List is empty

        //Bir List in baska bir List ile aynı olup olmadıgını nasıl konrol ederiz?
        //İki List in eşit olması icin aynı index te aynı elemanlar olmalıdır

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("usame");
        names1.add("fatih");
        names1.add("ali");
        names1.add("ufuk");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("usame");
        names2.add("fatih");
        names2.add("ufuk");
        names2.add("ali");

        boolean s = names1.equals(names2);
        System.out.println(s);//false

        //Verilen 2 Integer List te tamamıyla aynı elemanların olup olmadıgını kontrol eden kodu yazınız

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        System.out.println(nums1);//[8,9,10]
        Collections.sort(nums2);

        System.out.println(nums1.equals(nums2));


    }

}
