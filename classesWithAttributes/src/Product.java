public class Product {
    //Attribute | field
    private int id;
    private String name;
    private String description;

    private double price;
    private int stockAmount;

    private String kod;

    //getter
   public  int get_id(){
       return  id;
   }
   //setter
   public void set_id (int id){
       this.id=id;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    public String getKod() {
        return this.name.substring(0,1)  + id;
    }
}