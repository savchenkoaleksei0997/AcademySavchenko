package by.academy.classwork.lesson1;

public class Product {

    private int calorieProduct;
    private int praceProduct;
    private double weightProduct;
    private String name;
    private String ebible;

    public Product() {
        super();
    }

    public Product (int calorieProduct,int praceProduct,double weightProduct, String name ){
        super();
        this.calorieProduct = calorieProduct;
        this.praceProduct = praceProduct;
        this.weightProduct = weightProduct;
        this.name = name;
    }

    public void productEbible(){
       String i = getEbible();
        if (i.equals(getEbible())) {
            System.out.println("Продукт сьедобный");
        } else if (i.equals("Не съедобный")) {
            System.out.println("Продукт не съедобный");
        } else
            System.out.println("Такого продукта нет");

    }


    public String getEbible() {
        return ebible;
    }

    public void setEbible(String ebible) {
        this.ebible = ebible;
    }

    public int getCalorieProduct() {
        return calorieProduct;
    }

    public void setCalorieProduct(int calorieProduct) {
        this.calorieProduct = calorieProduct;
    }

    public int getPraceProduct() {
        return praceProduct;
    }

    public void setPraceProduct(int praceProduct) {
        this.praceProduct = praceProduct;
    }

    public double getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(double weightProduct) {
        this.weightProduct = weightProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("calorieProduct=").append(calorieProduct);
        sb.append(", praceProduct=").append(praceProduct);
        sb.append(", weightProduct=").append(weightProduct);
        sb.append(", name='").append(name).append('\'');
        sb.append(", ebible=").append(ebible);
        sb.append('}');
        return sb.toString();
    }
}
