package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class TopView {
    public void topView(NodeTree root) {
        if(root == null) return;
        //This will take care of left side and the top node (Grand Parent Node)
        leftSide(root);
        if(root.right != null){
            rightSide(root.right);
        }
    }
    public void leftSide(NodeTree leftRoot){
        if(leftRoot.left != null){
            leftSide(leftRoot.left);
        }
        System.out.print(leftRoot.data + " ");
        return;
    }
    public void rightSide(NodeTree rightRoot) {
        System.out.print(rightRoot.data + " ");
        if (rightRoot.right != null) {
            rightSide(rightRoot.right);
        }
        return;
    }


// Another Solution with Static Counter

//    public int counter = 0;
//
//    public void topView(NodeTree root) {
//        if(root.left != null && counter >= 0){
//            counter++;
//            topView(root.left);
//        }
//        System.out.print(root.data + " ");
//        counter--;
//        if(root.right != null && counter < 0){
//            counter--;
//            topView(root.right);
//        }
//    }
}

