package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class InorderTraversal {
    public void inOrder(Node root) {
        if(root == null) return;
        if(root.left != null){
            inOrder(root.left);
        }
        System.out.print(root.data + " ");
        if(root.right != null){
            inOrder(root.right);
        }
    }
}
