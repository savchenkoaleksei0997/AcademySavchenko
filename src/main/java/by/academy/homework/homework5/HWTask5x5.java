package by.academy.homework.homework5;

import java.util.HashMap;

public class HWTask5x5 {


    public static void main(String[] args) {

        String text = "Java не поставляется с удобной реализацией интерфейса Collection," +
                " поэтому вам придется использовать один из перечисленных подтипов. " +
                "Интерфейс просто определяет набор методов (поведения)," +
                " которые разделяет каждый из этих подтипов." +
                " Это позволяет игнорировать конкретный тип коллекции," +
                " которую вы используете, и просто рассматривать ее как коллекцию.\n";

        String lowerText = text.toLowerCase();
        char[] charText = lowerText.toCharArray();

        HashMap<Character, Integer> myHashMap = new HashMap<Character, Integer>();

        for (int i = 0; i < charText.length; i++) {
            int counter = 1;
                for (int j = 0; j < charText.length; j++) {
                    if (charText[i] == charText[j]) {
                        counter++;
                    }
                }
            myHashMap.put(charText[i], counter);
        }

        System.out.println(myHashMap.get('а'));
    }
}
