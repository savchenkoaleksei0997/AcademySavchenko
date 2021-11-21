package by.academy.homework.homework3;

public class Apple extends Product {

    public Apple(String name, double capacity, double price, double quantity) {
        super(name, capacity, price, quantity);
    }

    @Override
    public double getDiscount() {
        if (capacity >= 3 && capacity < 5) {
            return 0.9;
        } else if (capacity >= 5) {
            return 0.85;
        }
        return 1;
    }
}
