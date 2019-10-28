package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer arraySum = 0;
        for (int i = 0; i < intArray.length; i++) {
            arraySum = arraySum + intArray[i];
        }
        return arraySum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer arrayProduct = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            arrayProduct = arrayProduct * intArray[i];
        }
        return arrayProduct;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double arrayAvg = (double) (getSum(intArray) / intArray.length);
        return arrayAvg;
    }
}
