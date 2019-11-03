package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input) {
        ArrayList<String> subStringsList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                subStringsList.add(input.substring(i, j));
            }
        }

        System.out.println(Arrays.toString(subStringsList.toArray()));
        int count = 0;
        for (int k = 0; k < subStringsList.size(); k++) {
            if (isPalindromic(subStringsList.get(k)))
                count = count + 1;
        }
        return count;
    }

    public static boolean isPalindromic(String str) {
        BasicStringUtils stringUtils = new BasicStringUtils();
        String reversedStr = stringUtils.reverse(str);
        return str.equals(reversedStr); // cleaner code
    }

}

