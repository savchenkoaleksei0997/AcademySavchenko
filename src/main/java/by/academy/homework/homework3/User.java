package by.academy.homework.homework3;

public class User {
    private double money;
    private String name;
    private String phone;
    private String email;
    private String dateOfBirth;

    public User() {
        super();
    }

    public User(String name) {
        super();
        this.name = name;
    }

    public User(double money) {
        super();
        this.money = money;
    }

    public User(String name, double money) {
        super();
        this.money = money;
        this.name = name;
    }

    public User(String name, double money, String phone) {
        super();
        this.money = money;
        this.name = name;
        this.phone = phone;
    }



    public User(String name, double money, String phone, String email) {
        super();
        this.money = money;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public User(String name, double money, String phone, String email, String dateOfBirth) {
        super();
        this.money = money;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("money=").append(money);
        sb.append(", name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
