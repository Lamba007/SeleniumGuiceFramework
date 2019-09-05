package com.test.guice.framework.stringutilities;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringUtility {

    private StringUtility() {

        throw new AssertionError();
    }

    public static int getNumberFromString(String text) {

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);

        if (!m.find()) {
            throw new NullPointerException();
        }

        return Integer.valueOf(m.group(0));
    }

    public static String valueFromString(String content, String startIndex, String endIndex) {

        int lastIndexOfStartIndex = content.indexOf(startIndex) + startIndex.length();
        int firstIndexOfendIndex = content.indexOf(endIndex);

        return content.substring(lastIndexOfStartIndex, firstIndexOfendIndex).trim();

    }

    public static String valueFromString(String content, String endIndex) {

        int lastIndexOfStartIndex = 0;
        int firstIndexOfendIndex = content.indexOf(endIndex);

        return content.substring(lastIndexOfStartIndex, firstIndexOfendIndex).trim();

    }

    public static String genString(int len) {

        char[] chars = new char[len];
        Arrays.fill(chars, 'a');
        String text = new String(chars);
        System.out.println(text);
        return text;
    }

    public static String[] splitString(String value, String delimeter) {

        return value.split(delimeter);

    }
}
