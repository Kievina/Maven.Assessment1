package com.zipcodewilmington.assessment1.part1;

//import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String newString = Character.toString(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            newString = newString + str.charAt(i);
        }
        return  newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString = reversedString + str.charAt(i);
        }
        return reversedString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String newString = "";
        for(int i = 1; i < str.length() - 1; i++) {
            newString = newString + str.charAt(i);
        }
        return newString;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                builder.append(Character.toLowerCase(str.charAt(i)));
            } else builder.append(Character.toUpperCase(str.charAt(i)));
        }
        return builder.toString();
    }
}
