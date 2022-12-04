public class Main {
    public static void main(String[] args) {
        //tamamlanmamış operasonlar bulunyor...
        //intarfaceler new() lenemez

        //interface referans tutmamiza yarıyor
        //ICustomerDAl iCustomerDAl=new OrecleCustomerDal();

 /*       CustomerManager customerManager = new CustomerManager();
        customerManager.customerDAl = new OrecleCustomerDal();
        customerManager.add();*/
        //ikinci Yol
        CustomerManager customerManager = new CustomerManager(new OrecleCustomerDal());
        customerManager.add();

    }
}