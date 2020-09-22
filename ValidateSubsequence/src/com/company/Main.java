package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        var array = Arrays.asList(5,1,22,25,6,-1,8,10);
        var sequence = Arrays.asList(1,6,-1,10);

        System.out.println(TwoPointers.isValidSubsequence(array,sequence));
    }
}


