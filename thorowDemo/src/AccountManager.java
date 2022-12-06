public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }

    public  void withdraw(double amount) throws BalanceInsufficentException {
        //hesabın eksiye düşmemesi için yapılan yöntemlerden ilki
        if(balance >=amount){
            balance=getBalance()-amount;
        }else{
            //ilk yöntemde bu kullanılır
            //System.out.println("Hesabınızdan para çekilemedi. Bakiye yetersiz");

            //İkinci yöntem

            throw new BalanceInsufficentException("Bakiye yetersiz");
        }

    }


    public double getBalance() {
        return balance;
    }
}
