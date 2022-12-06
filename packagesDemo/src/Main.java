
import Matematik.DortIslem;
import Matematik.Logaritma;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Adinizi Giriniz...");
        String isim=scanner.nextLine();
        System.out.println("Merhaba" +" "+isim);
        DortIslem dortIslem  = new DortIslem();
        dortIslem.topla(6,4);
        Logaritma logaritma =new Logaritma();
        logaritma.logaritmaHesapla();
    }
}