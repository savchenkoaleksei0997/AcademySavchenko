package by.academy.classwork.lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

    public static void main(String... args) {
        HashMap<String, Toy> map = new HashMap<String, Toy>();

//        map.put("Вася", 7);
//        map.put("Петя", 4);
//        map.put("Маша", 3);
//        map.put("Наташа", 8);
//
//        System.out.println(map.get("Вася"));
//
//        for (String key : map.keySet()){
//            System.out.println(key + " : " + map.get(key));
//        }
//
//        for (Integer key : map.values()){
//            System.out.println(key + " : " + map.get(key));
//        }
//
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()){
//        }

        Toy a1 = new Toy("Машинка", 12);
        Toy a2 = new Toy("Кукла", 8);
        Toy a3 = new Toy("Самалетик", 15);
        Toy a4 = new Toy("Мяч", 20);

        map.put("Игрушка1", a1);
        map.put("Игрушка2", a2);
        map.put("Игрушка3", a3);
        map.put("Игрушка4", a4);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
            System.out.println(key.hashCode());
        }

        for (Toy key : map.values()) {
            System.out.println(key.getName() + " : " + key.getPrace());
        }

        for (Map.Entry<String, Toy> entry : map.entrySet()) {
            System.out.println(entry);
        }

        List a = new ArrayList<Double>();


    }
}
