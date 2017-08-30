package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.AVL;

import com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees.InorderTraversal;

public class AVLTree {
    public static void main(String args[]){
        AVLTree avlTree = new AVLTree();
        Node root = null;
        root = avlTree.insert(root, -10);
        root = avlTree.insert(root, 2);
        root = avlTree.insert(root, 13);
        root = avlTree.insert(root, -13);
        root = avlTree.insert(root, -15);
        root = avlTree.insert(root, 15);
        root = avlTree.insert(root, 17);

    }

    public Node insert(Node root,int val){
        if(root == null) {
            Node newRoot = new Node();
            newRoot.val = val;
            newRoot.right = null;
            newRoot.left = null;
            newRoot.ht = setHeight(newRoot);
            return newRoot;
        }
        if(val <= root.val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        int balance = balance(root.left, root.right);
        if(balance > 1){
            if(height(root.left.left) >= height(root.left.right)){
                root = rightRotate(root);
            } else {
                root.left = leftRotate(root.left);
                root = rightRotate(root);
            }
        } else if(balance < -1) {
            if(height(root.right.right) >= height(root.right.left)){
                root = leftRotate(root);
            } else {
                root.right = rightRotate(root.right);
                root = leftRotate(root);
            }
        } else {
            root.ht = setHeight(root);
        }
        return root;
    }

    private int setHeight(Node root){
        if(root == null){
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private int height(Node root){
        if(root == null){
            return -1;
        } else {
            return root.ht;
        }
    }

    private int balance(Node left, Node right){
        return height(left) - height(right);
    }

    private Node rightRotate(Node root){
        Node newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;
        root.ht = setHeight(root);
        newRoot.ht = setHeight(newRoot);
        return newRoot;
    }

    private Node leftRotate(Node root){
        Node newRoot = root.right;
        root.right = root.right.left;
        newRoot.left = root;
        root.ht = setHeight(root);
        newRoot.ht = setHeight(newRoot);
        return newRoot;
    }
}
