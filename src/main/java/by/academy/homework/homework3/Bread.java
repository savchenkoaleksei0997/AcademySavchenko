package by.academy.homework.homework3;

public class Bread extends Product {

    public Bread(String name, double capacity, double price, double quantity) {
        super(name, capacity, price, quantity);
    }

    @Override
    public double getDiscount() {
        if (quantity >= 2 && quantity < 4) {
            return 0.95;
        } else if (quantity >= 4) {
            return 0.9;
        }
        return 1;
    }
}
