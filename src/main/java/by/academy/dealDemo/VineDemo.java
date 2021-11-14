package by.academy.dealDemo;

public class VineDemo extends ProductDemo {

    public VineDemo(){
        super();
        this.type = "Вино";
    }

    public VineDemo(String name, String kind, int packingVolume, int price){
        super(name , "Вино", kind, packingVolume, price );

    }



}
