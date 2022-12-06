import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers =new ArrayList<Customer>();


        customers.add(new Customer(2,"mehmet","yıldırım"));
        customers.add(new Customer(3,"Engin","Demirog"));
        customers.add(new Customer(4,"Ali","Polat"));
         for (Customer customer:customers){

             System.out.println(customer.id +customer.firstName+ customer.lastName);
         }
    }
}