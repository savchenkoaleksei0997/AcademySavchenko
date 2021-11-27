package by.academy.homework.homework3;


public class Deal {
    protected User buyer;
    protected User seller;
    protected Product[] products;
    protected Product[] basket;

    protected int size;

    public Deal() {
        super();
    }

    public Deal(User seller, User buyer, Product[] products, Product[] basket) {
        super();
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.basket = basket;
    }

    public void printBuyerInfo(User buyer) {
        System.out.println("Имя : " + buyer.getName() + "\nНомер телефона : " + buyer.getPhone() +
                "\nЭлектронная почта : " + buyer.getEmail() + "\nДата рождения : " + buyer.getDateOfBirth());
    }

    public void deposition(double money) {
        buyer.setMoney(money);
    }

    public double calculation() {
        double sum = 0;
        sum = buyer.getMoney() - getFullPrice();
        seller.setMoney(seller.getMoney() + sum);
        sum = ((sum * 100) / 100);
        return sum;
    }

    public void basketPrint() {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                System.out.println("ID." + (i + 1) + "..." + basket[i].getName() + " : " +
                        basket[i].getQuantity() + " Упаковка : " + " Объем-|-Вес  " +
                        basket[i].getCapacity() + " : " +
                        basket[i].getPrice() + " Рублей ");
            }
        }
    }

    public void listProduct() {
        for (int i = 0; i < products.length; i++) {
            System.out.println("ID." + (i + 1) + "..." + products[i].getName() + " : " +
                    products[i].getQuantity() + " Упаковка :  " +
                    products[i].getPrice() + " Рублей ");
        }
    }

    public double getFullPrice() {
        double sum = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                sum += basket[i].getProductsPrice();

            }
        }
        sum = ((sum * 100) / 100);
        return sum;
    }

    public void delete(int index) {
        basket[index] = null;
    }

    public void add(Product products) {
        if (size + 1 == basket.length) {
            grow();
        }
        basket[size++] = products;
    }


    private void grow() {
        Product[] newProduct = new Product[basket.length * 2 + 1];
        System.arraycopy(basket, 0, newProduct, 0, basket.length);
        basket = newProduct;
    }


    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getBasket() {
        return basket;
    }

    public void setBasket(Product[] basket) {
        this.basket = basket;
    }
}
