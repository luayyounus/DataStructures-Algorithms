package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class HeightOfBinaryTree {
    public static int height(Node root) {
        if(root == null) return -1;
        int left = 0;
        int right = 0;
        if(root.left != null){
            left = height(root.left) + 1;
        }
        if(root.right != null){
            right = height(root.right) + 1;
        }
        if(right > left) return right; else return left;
    }
    // Using Math.Max
    public static int heightWithMax(Node root){
        if(root == null) return -1;
        return 1 + Math.max(heightWithMax(root.left),heightWithMax(root.right));
    }
}
