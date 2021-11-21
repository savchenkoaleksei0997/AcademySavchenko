package by.academy.homework.homework3;

import java.util.regex.Pattern;

public interface Validator {

    Pattern getPattern();

    default boolean isValid(String s) {
        return getPattern().matcher(s).matches();
    }
}
