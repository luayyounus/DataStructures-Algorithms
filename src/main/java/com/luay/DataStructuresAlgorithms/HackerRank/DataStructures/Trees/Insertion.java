package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class Insertion {
    public NodeTree Insert(NodeTree root,int value) {
        if(root == null){
            NodeTree nodeToInsert = new NodeTree();
            nodeToInsert.data = value;
            nodeToInsert.left = null;
            nodeToInsert.right = null;
            root = nodeToInsert;
            return root;
        }
        if(root.data > value){
            root.left = Insert(root.left, value);
        } else if (root.data < value){
            root.right = Insert(root.right, value);
        }
        return root;
    }
}
