package by.academy.homework.homework3;

public class Milk extends Product {


    public Milk(String name, double capacity, double price, double quantity) {
        super(name, capacity, price, quantity);
    }

    @Override
    public double getDiscount() {
        if (capacity >= 2 && capacity < 4) {
            return 0.95;
        } else if (capacity >= 4) {
            return 0.9;
        }
        return 1;
    }
}
