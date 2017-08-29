package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

import java.util.ArrayList;
import java.util.Stack;

public class CheckBST {
        boolean checkBST(NodeTree root) {
        int min = 0;
        int max = 10000;
        return checkBST(root, min, max);
    }
    boolean checkBST(NodeTree root, int min, int max) {
        if(root == null) return true;
        if(root.data <= min || root.data >= max) return false;
        if (!checkBST(root.left, min, root.data)) return false;
        if (!checkBST(root.right, root.data, max)) return false;
        return true;
    }

    // Another Solution
    public int max = -1;
    public boolean checkBST2(NodeTree root) {
        if(root == null) return true;
        boolean left = checkBST2(root.left) && max < root.data;
        max = root.data;
        boolean right = checkBST2(root.right);
        return left && right;
    }


    // Another Solution
    boolean checkBST3(NodeTree root) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        inOrderTraverse(root, array);
        for(int i = 0; i < array.size() -1; i++){
            if(array.get(i) >= array.get(i+1)) return false;
        }
        return true;
    }
    void inOrderTraverse(NodeTree root, ArrayList<Integer> array) {
        if(root == null) return;
        if(root.left != null){
            inOrderTraverse(root.left, array);
        }
        array.add(root.data);
        if(root.right != null){
            inOrderTraverse(root.right, array);
        }
    }
}
