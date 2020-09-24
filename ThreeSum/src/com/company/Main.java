package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer[]> output = ThreeSum.threeSum(new int[] {12,3,1,2,-6,5}, 20);
        for (int i = 0; i < output.size(); i++){
            System.out.println(Arrays.toString(output.get(i)));
        }
    }
}
