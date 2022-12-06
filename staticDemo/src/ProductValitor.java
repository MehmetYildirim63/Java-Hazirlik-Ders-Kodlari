public  class ProductValitor {
    static {
        System.out.println("Yapıcı Block Çalışır Bu kısımda");
    }
    public static boolean isValid(Product product)
    {
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }

    }
}
