package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class CheckBST {
    boolean checkBST(Node root) {
        int min = 0;
        int max = 10000;
        return checkBST(root, min, max);
    }
    boolean checkBST(Node root, int min, int max) {
        if(root == null) return true;
        if(root.data <= min || root.data >= max) return false;
        if (!checkBST(root.left, min, root.data)) return false;
        if (!checkBST(root.right, root.data, max)) return false;
        return true;
    }

    // Another Solution
    public int max = -1;
    public boolean checkBST2(Node root) {
        if(root == null) return true;
        boolean left = checkBST2(root.left) && max < root.data;
        max = root.data;
        boolean right = checkBST2(root.right);
        return left && right;
    }

}
