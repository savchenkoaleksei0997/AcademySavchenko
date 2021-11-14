package by.academy.Deal;


public class Deal {
    protected User seller;
    protected User buyer;
    protected Product[] products;

    public Deal() {
        super();
    }

    public Deal(User seller, User buyer, Product[] products) {
        super();
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public double getFullPrice(){
        double sum = 0;
        for (int i = 0; i < products.length; i++){
            sum+= products[i].getProductsPrice();
        }
        return sum;
    }

    public void printBill() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + " : " +
                    products[i].getQuantity() + " * " +
                    products[i].getPrice() + " = " +
                    products[i].getProductsPrice());
        }
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
