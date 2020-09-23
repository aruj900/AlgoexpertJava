package com.company;

public class Recursion {
    public static int nodeDepths(BinaryTree root) {
        return nodeDepthsHelper(root, 0);
    }

    public static int nodeDepthsHelper(BinaryTree root, int depths) {
        if (root == null) return 0;
        return depths + nodeDepthsHelper(root.left, depths + 1) + nodeDepthsHelper(root.right, depths + 1);

    }

}
