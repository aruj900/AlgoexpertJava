package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Branch {
    public static List<Integer> branchSums(BinaryTree root){
        List<Integer> sums = new ArrayList<>();
        calculateBranchSums(root,0,sums);
        return sums;
    }
    public static void calculateBranchSums(BinaryTree node, int runningSum, List<Integer> sums){
        if (node == null) return;

        int newRunningSUm = runningSum + node.value;
        if (node.left == null && node.right == null){
            sums.add(newRunningSUm);
            return;
        }
        calculateBranchSums(node.left,newRunningSUm,sums);
        calculateBranchSums(node.right,newRunningSUm,sums);
    }
}
