import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Aydın");
        sehirler.add("Şanlıurfa");
        sehirler.add("Erzurum");
        sehirler.add("Bursa");

        //Bu kısımda bir sıralama gerçekleştiriyoruz
        Collections.sort(sehirler);

        // For ile dizi elemanlarının döngü yardımı ile tek tek dönerek  System.out.println(sehir); ekrana basıyoruz
        for (String sehir : sehirler) {
            System.out.println(sehir);
        }


    }
}