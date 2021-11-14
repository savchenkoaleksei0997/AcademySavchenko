package by.academy.dealDemo;

public class MilkDemo extends ProductDemo {

    public MilkDemo(){
        super();
        this.type = "Молоко";
    }

    public MilkDemo(String name, String kind, int packingVolume, int price){
        super(name , "Молоко", kind, packingVolume, price );

    }

}
