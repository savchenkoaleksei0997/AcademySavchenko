package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTask3 {

    private static final String patternS = "[O|o]bject-oriented programming";
    private static final Pattern pattern = Pattern.compile(patternS);

    public static void main(String[] args){
        String text = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" " +
                "and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

        Matcher matcher = pattern.matcher(text);

        StringBuilder sb = new StringBuilder();
        int startIndex = 0;
        int findCounter = 0;

        while (matcher.find()){
            findCounter++;
            sb.append(text.substring(startIndex, matcher.start()));
            if (findCounter % 2 == 0 ){
                sb.append("OOP");
            }else{
                sb.append(text.substring(matcher.start(), matcher.end()));
            }
            startIndex = matcher.end();
        }
        sb.append(text.substring(startIndex));
        System.out.println(sb);
    }
}
