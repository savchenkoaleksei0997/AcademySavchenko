package by.academy.classwork.lesson16;

public class Bird {
    private String name;

    public Bird() {
        super();
        this.name = "Снегирь";
    }

    public String getName() {
        return name;
    }

    @FunctionalInterface
    interface Flyable {
        void fly(Bird bird);
    }

    public static void main(String[] args) {

        Bird bird = new Bird();

        Flyable flyable = bird1 -> System.out.println("Птица летает с таким названием - " + bird1.getName());

        flyable.fly(bird);

    }
}
