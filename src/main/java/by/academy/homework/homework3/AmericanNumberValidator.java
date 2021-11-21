package by.academy.homework.homework3;

import by.academy.homework.homework3.Validator;

import java.util.regex.Pattern;

public class AmericanNumberValidator implements Validator {

    private static final Pattern p = Pattern.compile("^\\+1\\d{10}");

    @Override
    public Pattern getPattern() {
        return p;
    }

}
