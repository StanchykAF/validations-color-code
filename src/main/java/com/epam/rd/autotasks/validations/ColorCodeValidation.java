package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color == null) {
            return false;
        }
        Pattern patternHexColor = Pattern.compile("(#)(([0-9A-F]{3})|([0-9A-F]{6}))", Pattern.CASE_INSENSITIVE);
        Matcher matcherHexColor = patternHexColor.matcher(color);
        return matcherHexColor.matches();
    }
}





