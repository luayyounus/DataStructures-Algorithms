package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class CheckBST {
    boolean checkBST(Node root) {
        int min = 0;
        int max = 10000;
        return checkBSTrecursion(root, min, max);
    }
    boolean checkBSTrecursion(Node root, int min, int max) {
        if(root == null) return true;
        if(root.data <= min || root.data >= max) return false;
        if (!checkBSTrecursion(root.left, min, root.data)) return false;
        if (!checkBSTrecursion(root.right, root.data, max)) return false;
        return true;
    }
}
