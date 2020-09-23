package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> test = new ArrayList<Object>(Arrays.asList(5,2, new ArrayList<Object>(Arrays.asList(7,-1)),
                3 ));

        System.out.println(Product.productSum(test));
    }
}
