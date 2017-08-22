package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class Insertion {
    static Node Insert(Node root,int value) {
        if(root == null){
            Node nodeToInsert = new Node();
            nodeToInsert.data = value;
            nodeToInsert.left = null;
            nodeToInsert.right = null;
            root = nodeToInsert;
        }
        if(root.data > value){
            root.left = Insert(root.left, value);
        } else if (root.data < value){
            root.right = Insert(root.right, value);
        }
        return root;
    }
}
