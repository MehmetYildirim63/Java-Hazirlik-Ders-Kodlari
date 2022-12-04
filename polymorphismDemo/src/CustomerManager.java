public class CustomerManager {
    //Bu kısımda bir filt oluşturuyoruz
    private BaseLogger logger;

    //Bu kısımda bir constractır oluşturuyoruz
    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void Add() {
        System.out.println("Müşteri Eklendi");
        this.logger.log("log mesajı");

    }
}
