import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //createFile();
      //getFileInfo();
        readFile();
        writeFile();
        readFile();
    }
    public  static  void createFile(){
        //Yeni bir doya oluşturma
        File file =new File("C:\\javaDemos\\files\\students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya Oluşturuldu");
            }else{
                System.out.println("Dosya Zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
        File file =new File("C:\\javaDemos\\files\\students.txt,true");
        if(file.exists()){
            System.out.println("Dosya adi:"+" "+ file.getName());
            System.out.println("Dosya yolu:"+" "+ file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi?:"+" "+ file.canWrite());
            System.out.println("Dosya okunabilir mi?:"+" "+ file.canRead());
            System.out.println("Dosya boyutu (byte):"+" "+ file.length());
        }
    }
    public static void readFile(){
        File file =new File("C:\\javaDemos\\files\\students.txt");
        try {
            Scanner reader =new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            //okuduktan sonra dosyayı bu kısımda kapatmak zorundasin
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public  static void  writeFile(){
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("C:\\javaDemos\\files\\students.txt",true));
            writer.newLine();
            writer.write("ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}