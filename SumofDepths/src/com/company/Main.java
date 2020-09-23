package com.company;

public class Main {

    public static void main(String[] args) {

        var root = new BinaryTree(10);
        root.left = new BinaryTree(5);
        root.left.left = new BinaryTree(2);
        root.right = new BinaryTree(15);
        root.left.right = new BinaryTree(5);
        root.right.left = new BinaryTree(13);

        System.out.println(NodeDepths.nodeDepths(root));
        System.out.println(Recursion.nodeDepths(root));
    }
}
