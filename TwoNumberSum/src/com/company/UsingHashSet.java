package com.company;

import java.util.HashSet;
import java.util.Set;

public class UsingHashSet {
    public static int[] twoNumberSum(int[] array, int targetSum){
        Set<Integer> nums = new HashSet<>();
        for (int num : array){
            int potentialMatch = targetSum - num;
            if(nums.contains(potentialMatch)){
                return new int[] {potentialMatch, num};

            }else {
                nums.add(num);
            }
        }
        return new int[0];
    }
}
