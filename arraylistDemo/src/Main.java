import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar =new ArrayList();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add("Ankara");
        sayilar.add("rekarrürür");

        System.out.println(sayilar.size());
        System.out.println(sayilar.get(3));
        System.out.println(sayilar);
        System.out.println(sayilar.set(2,"İstanbul"));
        System.out.println(sayilar);
        sayilar.remove(1);//secili indexsi silir
        System.out.println(sayilar);
       // sayilar.clear(); listenin tamamini silir
        System.out.println(sayilar.size());
        for (Object i : sayilar){
            System.out.println(i);
        }
    }
}