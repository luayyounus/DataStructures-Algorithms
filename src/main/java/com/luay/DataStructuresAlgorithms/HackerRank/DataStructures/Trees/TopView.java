package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class TopView {
    public void topView(Node root) {
        if(root == null) return;
        //This will take care of left side and the top node (Grand Parent Node)
        leftSide(root);
        if(root.right != null){
            rightSide(root.right);
        }
    }
    public void leftSide(Node leftRoot){
        if(leftRoot.left != null){
            leftSide(leftRoot.left);
        }
        System.out.print(leftRoot.data + " ");
        return;
    }
    public void rightSide(Node rightRoot){
        System.out.print(rightRoot.data + " ");
        if(rightRoot.right != null){
            rightSide(rightRoot.right);
        }
        return;
    }
}
