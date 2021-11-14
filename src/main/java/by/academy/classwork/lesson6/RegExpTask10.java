package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTask10 {

    private static final String patternJ = "Java \\d+";
    private static final Pattern pattern = Pattern.compile(patternJ);

    public static void main(String[] args){
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            // Считываем начало входа
            int start = matcher.start();
            // Считываем конечный индек.
            int end = matcher.end();
            // substring выводит из текста текс который начинается со старта и закачивается на енд
            System.out.println(text.substring(start,end));
        }




    }
}
