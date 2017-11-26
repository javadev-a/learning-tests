package org.learn.stuff8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

//    public static void main(String[] args) {
//        String[] stringArray = new String[10];
//
//        System.out.println(Arrays.toString(stringArray));
//
//        for (String string : stringArray) {
//            System.out.println(string);
//        }
//
//        System.out.println("----------------- object");
//        Object[] objectArray = new Object[10];
//
//        System.out.println(Arrays.toString(objectArray));
//
//
//    }

    public static void main(String[] args) {
        String test = "foo1:8080/api";
        Pattern pattern = Pattern.compile("^(.*/api).*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(test);

        if (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
