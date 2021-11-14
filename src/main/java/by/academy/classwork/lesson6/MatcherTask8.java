package by.academy.classwork.lesson6;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTask8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c{1,3}ab");
        Matcher matcher = pattern.matcher("ccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
