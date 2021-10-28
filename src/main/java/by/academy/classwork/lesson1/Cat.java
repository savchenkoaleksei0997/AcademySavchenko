package by.academy.classwork.lesson1;

public class Cat {

    private double weight;
    private int age;
    private String nickName;

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
    public Cat(double weight) {
        super();
        this.weight = weight;
    }

    public Cat(String nickName, int age) {
        super();
        this.nickName = nickName;
        this.age = age;
    }

    public Cat(String nickName, int age, double weight) {
        super();
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
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

    public  void walk() {
        System.out.println("Кот гуляет.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("weight=").append(weight);
        sb.append(", age=").append(age);
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
