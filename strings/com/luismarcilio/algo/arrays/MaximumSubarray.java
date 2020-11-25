package com.luismarcilio.algo.arrays;

public class MaximumSubarray {

    int maximumSubarray(int[] array) {
        int maxSum = array[0];
        if (array.length == 1) {
            return maxSum;
        }
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int i = 0; i < array.length; i++) {
            maxEndingHere += array[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;

    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maximumSubarray(nums));

    }
}