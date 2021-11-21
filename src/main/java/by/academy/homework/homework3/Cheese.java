package by.academy.homework.homework3;

public class Cheese extends Product {

    public Cheese(String name, double capacity, double price, double quantity) {
        super(name, capacity, price, quantity);
    }

    @Override
    public double getDiscount() {
        if (capacity >= 1 && capacity < 1.5) {
            return 0.95;
        } else if (capacity >= 2) {
            return 0.85;
        }
        return 1;
    }
}
