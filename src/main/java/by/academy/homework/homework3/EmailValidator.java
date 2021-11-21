package by.academy.homework.homework3;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {

    private static final Pattern p = Pattern.compile("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$");

    @Override
    public Pattern getPattern() {
        return p;
    }
}
