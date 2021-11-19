package by.academy.Deal;

public class Aplocation {
    public static void main(String... args) {

        int numberOfProduct = 3;
        Product[] products = new Product[numberOfProduct];

        products[0] = new Product();
        products[1] = new Product();
        products[2] = new Product();


        User seller = new User();
        User buyer = new User();

        Deal deal = new Deal(seller, buyer, products);

    }
}
