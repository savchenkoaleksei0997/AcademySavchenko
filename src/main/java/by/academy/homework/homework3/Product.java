package by.academy.homework.homework3;

import java.io.Serializable;

public class Product implements Serializable {
    protected String name;
    protected double capacity;
    protected double price;
    protected double quantity;

    public Product() {
        super();
    }

    public Product(String name, double capacity, double price, double quantity) {
        super();
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.quantity = quantity;
    }

    public double getProductsPrice() {
        return price * getDiscount();
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", capacity=").append(capacity);
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}
