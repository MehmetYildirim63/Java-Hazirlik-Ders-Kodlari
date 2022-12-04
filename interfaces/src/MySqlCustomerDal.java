public class MySqlCustomerDal implements ICustomerDAl,IRepository{

    @Override
    public void Add() {
        System.out.println("My sql eklendi");
    }
}
