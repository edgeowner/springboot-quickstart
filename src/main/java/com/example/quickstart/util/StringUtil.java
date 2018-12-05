package com.example.quickstart.util;

import java.util.regex.Pattern;

public class StringUtil {
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
}

