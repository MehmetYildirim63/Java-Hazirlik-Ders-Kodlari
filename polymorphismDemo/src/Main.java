import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
//      BaseLogger[] loggers =new BaseLogger[] {new FileLogger(), new EmailLogeer(), new DataBaseLogger(), new ConsoleLogger()};
//      for(BaseLogger logger:loggers){
//          logger.Log("Log Mesajı");
//      }
        //Bu kısım polimofihism new Emaillogeer erine DatabaseLogger veya Consollogerda gelebildigi için bu olmuş oluyor
        CustomerManager customerManager = new CustomerManager(new EmailLogeer());
        customerManager.Add();

    }
};
