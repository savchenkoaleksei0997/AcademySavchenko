package by.academy.homework.homework3;

import java.util.regex.Pattern;

public class DataValidator implements Validator{

    private static final Pattern p = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[- /](0[1-9]|1[012])[- /](19|20)\\d\\d$");

    @Override
    public Pattern getPattern() {
        return p;
    }
}
