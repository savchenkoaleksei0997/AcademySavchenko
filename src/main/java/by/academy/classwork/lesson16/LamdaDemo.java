package by.academy.classwork.lesson16;

import by.academy.classwork.lesson13.HeavyBox;

import java.util.Random;
import java.util.function.*;

public class LamdaDemo {

    public static void main(String[] args) {

        String a = "Кот";
        String b = null;
        String c = "";
        HeavyBox d = new HeavyBox(1, 2, 3, 4);
        HeavyBox f = new HeavyBox(21, 2, 3, 4);

        Predicate peNotNull = str -> str != null;

        System.out.println(peNotNull.test(b));

        Predicate peNotEmpty = str -> str != "";

        System.out.println(peNotEmpty.test(c));

        System.out.println(peNotNull.and(peNotEmpty).test(a));

        Consumer<HeavyBox> hb = heavyBox -> {
            if (heavyBox.getWeight() > 20) {
                System.out.println("Отгрузили ящик с весом: " + heavyBox.getWeight());
            } else {
                System.out.println("Отправили ящик с весом: " + heavyBox.getWeight());
            }
        };

        hb.accept(d);
        hb.accept(f);


        Function<Integer, String> chekInt = number -> {
            if (number == 0) {
                return "Zero";
            }
            return number > 0 ? "Положительное" : "Отрицательное";
        };

        System.out.println(chekInt.apply(2));

        Predicate<String> starWithJ = str -> str.startsWith("J");
        Predicate<String> starWithN = str -> str.startsWith("N");
        Predicate<String> endsWithA = str -> str.startsWith("A");
        System.out.println(endsWithA.and(starWithJ.or(starWithN)).test("NANANNA"));

        Supplier<Integer> random = () -> {
            Random randoms = new Random();
            return randoms.nextInt(11);
        };

        System.out.println(random.get());

        Function<Integer, Integer> generator =  Integer::new;
        System.out.println(generator.apply(new Random().nextInt(11)));

    }
}
