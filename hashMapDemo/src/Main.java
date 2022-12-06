import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk =new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");

        System.out.println(sozluk);
        System.out.println(sozluk.get("table"));
        //sozluk.remove("book");//bu kısımda anahtar sözcük ile veriyi silme işlemi yapar.
        System.out.println(sozluk);
        for (String item:sozluk.keySet()){
            System.out.println("Element-"+item+" "+"Deger-"+sozluk.get(item));
        }

    }
}