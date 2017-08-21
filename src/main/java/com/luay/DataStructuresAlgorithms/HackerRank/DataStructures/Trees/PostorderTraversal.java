package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class PostorderTraversal {
    public void postOrder(Node root) {
        if(root == null) return;
        if(root.left != null){
            postOrder(root.left);
        }
        if(root.right != null){
            postOrder(root.right);
        }
        System.out.print(root.data + " ");
    }
}
