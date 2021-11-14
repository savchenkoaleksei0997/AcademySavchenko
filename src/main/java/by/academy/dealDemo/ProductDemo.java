package by.academy.dealDemo;

public class ProductDemo {
    private String name;
    protected String type;
    private int packingVolume;
    private String species;
    private int price;

    public ProductDemo(){
        super();
    }

    public ProductDemo(String name, String type, String species ){
        super();
        this.name = name;
        this.type = type;
        this.species = species;

    }

    public ProductDemo(String name, String type, String species, int packingVolume ){
        super();
        this.name = name;
        this.type = type;
        this.species = species;
        this.packingVolume = packingVolume;

    }

    public ProductDemo(String name, String type, String species, int packingVolume, int price ){
        super();
        this.name = name;
        this.type = type;
        this.species = species;
        this.packingVolume = packingVolume;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPackingVolume() {
        return packingVolume;
    }

    public void setPackingVolume(int packingVolume) {
        this.packingVolume = packingVolume;
    }
}
