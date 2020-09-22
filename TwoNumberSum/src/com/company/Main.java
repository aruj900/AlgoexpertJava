package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] array = {1,4,7,9,14,18};
        int targetSum = 21;

        int[] output =UsingHashSet.twoNumberSum(array,targetSum);
        System.out.println(Arrays.toString(output));

        int[] output1 = UsingTwoPointers.twoNumberSum(array,targetSum);
        System.out.println(Arrays.toString(output1));
    }
}
