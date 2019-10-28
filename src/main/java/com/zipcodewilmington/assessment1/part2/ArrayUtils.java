package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int numOfOccurrences = 0;
        for (Object object : objectArray) {
            if (object == objectToCount)
                numOfOccurrences = numOfOccurrences + 1;
        }
        return numOfOccurrences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> newObjectList = new ArrayList<>();
        int sizeOfNewObjectArray = objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove);
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove))
                newObjectList.add(objectArray[i]);
        }
        return newObjectList.toArray(new Integer[newObjectList.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        // get number of times each object in array appears
        Integer[] occurrences = new Integer[objectArray.length];
        for (int i = 0; i < objectArray.length; i++) {
            occurrences[i] = getNumberOfOccurrences(objectArray, objectArray[i]);
        }
        // find max value and return
        int max = occurrences[0];
        int maxIdx = 0;
        for (int i = 1; i < occurrences.length; i++) {
            if (occurrences[i] > max) {
                max = occurrences[i];
                maxIdx = i;
            }
        }
        return objectArray[maxIdx];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        // get number of times each object in array appears
        Integer[] occurrences = new Integer[objectArray.length];
        for (int i = 0; i < objectArray.length; i++) {
            occurrences[i] = getNumberOfOccurrences(objectArray, objectArray[i]);
        }
        // find min value and return
        int min = occurrences[0];
        int minIdx = 0;
        for (int i = 1; i < occurrences.length; i++) {
            if (occurrences[i] < min) {
                min = occurrences[i];
                minIdx = i;
            }
        }
        return objectArray[minIdx];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */ // TODO
    /*public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Integer> newObjectList = new ArrayList<>(Arrays.asList(objectArray));
        for(Object number: objectArray) {
            newObjectList.add(number);
        }
        for(Object number: objectArrayToAdd) {
            newObjectList.add(number);
        }
        return newObjectList.toArray(new Object[newObjectList.size()]);
        //return null;
    }*/
}
