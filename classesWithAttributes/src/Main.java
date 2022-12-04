public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.set_id(2);
        product.setName("Bilgisayar");
        product.setDescription("yeni nesil bilgisayar");
        product.setPrice(78000);
        product.setStockAmount(80);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());
    }
}