import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Dosyayı belleğe alan sonra okumamızı saglayan class
        BufferedReader reader=null;
        int totoal=0;
        try {
             reader =new BufferedReader(new FileReader("C:\\javaDemos\\readingFileDemo\\src\\sayilar.txt"));
             String line=null;
             while((line=reader.readLine()) !=null){
                 totoal += Integer.valueOf(line);
             }
             System.out.println("Toplam= "+ totoal);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            reader.close();
        }

    }
}