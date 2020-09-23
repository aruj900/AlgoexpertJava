package com.company;

public class Iterative {
    public static int findClosest(BST tree, int target){
        return findClosest(tree, target, tree.value);
    }

    public static int findClosest(BST tree, int target, int closest){
        BST currentNode = tree;
        while (currentNode != null){
            if(Math.abs(target - closest) > Math.abs(target - currentNode.value)){
                closest = currentNode.value;
            }
            if (target < currentNode.value){
                currentNode = currentNode.left;
            } else if (target > currentNode.value){
                currentNode = currentNode.right;
            }else{
                break;
            }
        }
        return closest;
    }
}
