package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class LowestCommonAncestor {
    public Node lcaRecursive(Node root,int v1,int v2) {
        if(root.data > v1 && root.data > v2) return lcaRecursive(root.left,v1,v2);
        if(root.data < v1 && root.data < v2) return lcaRecursive(root.right,v1,v2);
        return root;
    }
    public Node lcaNonRecursive(Node root,int v1,int v2) {
        while(true){
            if(root.data > v1 && root.data > v2) return lcaNonRecursive(root.left,v1,v2);
            if(root.data < v1 && root.data < v2) return lcaNonRecursive(root.right,v1,v2);
            else return root;
        }
    }
}
