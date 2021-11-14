package by.academy.Deal;

public class User {
   private double money;
   private String name;

    public User() {
        super();
    }

    public User(String name, double money) {
        super();
        this.money = money;
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
