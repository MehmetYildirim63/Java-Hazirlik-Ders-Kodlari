public class Main {
    public static void main(String[] args) {
     ProductManager productManager =new ProductManager();
     Product product =new Product();
     product.name="Mouse";
     product.price=14567;
     productManager.add(product);

     DataBaseHalper.Crud.Delete();
    }
}