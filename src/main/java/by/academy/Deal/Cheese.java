package by.academy.Deal;

public class Cheese extends Product {

    private int age;

    public Cheese(String type, String name, double price, int quantity){
        super(name, type, quantity, price);
        this.age = age;
    }

    @Override
    public double getDiscount(){
        if (age >= 20){
            return 0.8;
        }
        return 1;
    }
}
