public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar =new int[]{1,2,3,4};
            System.out.println(sayilar[5]);
        }catch (Exception exception){
            //try de şayet hata varsa catch kısmi çalışır
           // System.out.println("Hatali Kod");
            System.out.println(exception);
        }finally {
            System.out.println("her türlü çalışan kısım kod hatalıda olsa olmasada");
        }
    }
}