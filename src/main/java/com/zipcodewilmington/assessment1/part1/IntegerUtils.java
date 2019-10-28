package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sumOfN = 0;
        for (int i = 0; i <= n; i++) {
            sumOfN = sumOfN + i;
        }
        return sumOfN;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer productOfN = 1;
        for (int i = 1; i <= n; i++) {
            productOfN = productOfN * i;
        }
        return productOfN;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String valReversed = "";
        String valStr = val.toString();
        for (int i = valStr.length() - 1; i >= 0; i--) {
            valReversed = valReversed + valStr.charAt(i);
        }
        Integer integer = Integer.valueOf(valReversed);
        return integer;
    }
}
