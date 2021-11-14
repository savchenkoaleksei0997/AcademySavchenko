package by.academy.Deal;

public class Product {
    protected String name;
    protected String type;
    protected int quantity;
    protected double price;

    public Product() {
        super();
    }

    public Product(String name, String type, int quantity, double price) {
        super();
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public double getProductsPrice() {
        return price * ((double) quantity) * getDiscount();
    }

    public double getDiscount() {
        return 1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
