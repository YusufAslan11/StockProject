package stockproject;

public class Product {
    public static int counter=1;
    private String productName;
    private String producer;
    private int quantity;
    private String unit;
    private String shelf;
    private int id;


    public Product(String productName, String producer, int quantity, String unit, String shelf) {
        this.id=counter++;
        this.productName = productName;
        this.producer = producer;
        this.quantity = quantity;
        this.unit = unit;
        this.shelf = shelf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", producer='" + producer + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}
