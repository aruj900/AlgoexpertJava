package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NodeDepths {
    public static int nodeDepths(BinaryTree root){
        int sumOfDepths = 0;
        Stack<Level> stack = new Stack<>();
        stack.add(new Level(root,0));
        while (stack.size() > 0){
            Level top = stack.pop();
            BinaryTree node = top.root;
            int depth = top.depth;
            if (node == null) continue;
            sumOfDepths += depth;
            stack.add(new Level(node.left, depth + 1));
            stack.add(new Level(node.right, depth + 1));

        }
        return sumOfDepths;
    }
}
