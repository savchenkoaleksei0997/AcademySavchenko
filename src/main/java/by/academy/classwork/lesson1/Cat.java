package by.academy.classwork.lesson1;

public class Cat {

    double money;
    int age;
    String nickName;

    public Cat() {
        super();
    }

    public Cat(String nickName) {
        super();
        this.nickName = nickName;
    }
    public Cat(int age) {
        super();
        this.age = age;
    }
    public Cat(double money) {
        super();
        this.money = money;
    }

    public Cat(String nickName, int age) {
        super();
        this.nickName = nickName;
        this.age = age;
    }

    public Cat(String nickName, int age, double money) {
        super();
        this.nickName = nickName;
        this.age = age;
        this.money = money;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void voice(){
        System.out.println("Мяу");
    }

    public void sleep() {
        System.out.println("Кот спит.");
    }

    public void eat() {
        System.out.println("Кот ест.");
    }

    public void walk() {
        System.out.println("Кот гуляет.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("money=").append(money);
        sb.append(", age=").append(age);
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
