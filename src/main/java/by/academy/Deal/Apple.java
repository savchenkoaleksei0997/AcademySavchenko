package by.academy.Deal;

public class Apple extends Product {


    @Override
    public double getDiscount(){
        if (quantity >= 10){
            return 0.9;
        }
        return 1;
    }
}
