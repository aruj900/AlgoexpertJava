package com.company;

public class Recurssion {
    public static int findClosest(BST tree, int target){
        return findClosest(tree, target, tree.value);
    }

    public static int findClosest(BST tree, int target, int closest){
        if (Math.abs(target - closest) > Math.abs(target - tree.value)){
            closest = tree.value;
        }
        if ( target < tree.value && tree.left != null){
            return findClosest(tree.left, target,closest);

        }else if (target > tree.value && tree.right != null ){
            return findClosest(tree.right, target, closest);
        }else {
            return closest;
        }
    }

}
