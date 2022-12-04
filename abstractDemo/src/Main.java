public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CostumerManager costumerManager =new CostumerManager();
        //Bu kısımda stratejiyi belirliyoruz.BU kısımda nerde çaliştigini belirtiyoruz.Bu kısımda Sürekli konfikrasyonu degişiriz.
        costumerManager.databaseManager=new SqlServerDatabaseManager();
        costumerManager.getCustomers();
    }
}