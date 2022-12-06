public class ProductManager {
    public void  add(Product product){


        if(ProductValitor.isValid(product)){
            System.out.println("Eklendi");
        }
        else{
            System.out.println("Ürün Bilgieri gecersiz ");
        }
    }
}
