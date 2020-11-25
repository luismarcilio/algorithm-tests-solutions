package com.luismarcilio.algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays<T extends Comparable<T>> {

    List<T> mergeSortedArrays(final T[] arr1, final T[] arr2) {
        if (arr1.length == 0) {
            return Arrays.asList(arr2);
        }
        if (arr2.length == 0) {
            return Arrays.asList(arr1);
        }

        int iArray1 = 0;
        int iArray2 = 0;
        final int sizeArray1 = arr1.length;
        final int sizeArray2 = arr2.length;
        final List<T> mergedArray = new ArrayList<T>(sizeArray1 + sizeArray2);
        T array1Item = arr1[0];
        T array2Item = arr2[0];

        while (iArray1 < sizeArray1 || iArray2 < sizeArray2) {
            if ((iArray1 < sizeArray1 && array1Item.compareTo(array2Item) < 0) || (iArray2 == sizeArray2)) {
                mergedArray.add(array1Item);
                iArray1++;
                if (iArray1 < sizeArray1)
                    array1Item = arr1[iArray1];
                continue;
            }
            if ((iArray2 < sizeArray2 && array1Item.compareTo(array2Item) >= 0) || (iArray1 == sizeArray1)) {
                mergedArray.add(array2Item);
                iArray2++;
                if (iArray2 < sizeArray2)
                    array2Item = arr2[iArray2];
                continue;
            }
        }
        return mergedArray;
    }

    public static void main(final String[] args) {
        Integer[] array1 = { 1, 15, 19 };
        Integer[] array2 = { 2, 3, 4, 5, 6, 7, 8, 9 };
        MergeSortedArrays<Integer> mergeSortedArrays = new MergeSortedArrays<Integer>();
        System.out.println(mergeSortedArrays.mergeSortedArrays(array1, array2));

    }

}