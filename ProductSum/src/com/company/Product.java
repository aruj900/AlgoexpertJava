package com.company;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public static int productSum(List<Object> array){
        return productSumHelper(array,1);
    }
    public static int productSumHelper(List<Object> array, int multiplier){
        int sum = 0;
        for (Object el : array){
            if ( el instanceof ArrayList){
                ArrayList<Object> ls = (ArrayList<Object>) el;
                sum += productSumHelper(ls, multiplier +1);

            }else {
                sum += (int) el;
            }
        }
        return sum * multiplier;

    }
}
