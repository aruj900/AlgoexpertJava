package com.company;

public class Main {

    public static void main(String[] args) {
        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.right = new BST(15);
        root.left.right = new BST(5);
        root.right.left = new BST(13);

        System.out.println(Recurssion.findClosest(root,12));
        System.out.println(Iterative.findClosest(root,12));

    }
}
