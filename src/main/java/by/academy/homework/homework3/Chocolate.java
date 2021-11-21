package by.academy.homework.homework3;

public class Chocolate extends Product {

    public Chocolate(String name, double capacity, double price, double quantity) {
        super(name, capacity, price, quantity);
    }

    @Override
    public double getDiscount() {
        if (quantity >= 4 && quantity < 6) {
            return 0.9;
        } else if (quantity >= 6) {
            return 0.8;
        }
        return 1;
    }
}
