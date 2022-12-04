public class CustomerManager {
    //strateji ile yapabiliriz
    ICustomerDAl customerDAl;



    public  CustomerManager(ICustomerDAl customerDAl){
        this.customerDAl=customerDAl;
    }
    public void  add(){
        //Bu kısımda iş kodları yazılır
        customerDAl.Add();
    }
}
