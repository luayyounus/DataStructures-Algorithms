package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class LowestCommonAncestor {
    public NodeTree lcaRecursive(NodeTree root, int v1, int v2) {
        if (root.data > v1 && root.data > v2) return lcaRecursive(root.left, v1, v2);
        if (root.data < v1 && root.data < v2) return lcaRecursive(root.right, v1, v2);
        return root;
    }
}