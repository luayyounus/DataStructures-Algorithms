package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

import java.util.Scanner;

public class SwapNodesAlgo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Tree of N nodes where nodes are indexed from [1..N]
        int n = scan.nextInt();
        NodeInt[] tree = new NodeInt[n+1];
        for(int i = 1; i <= n; i++){
            NodeInt node = new NodeInt();
            node.left = scan.nextInt();
            node.right = scan.nextInt();
            tree[i] = node;
        }

        int t = scan.nextInt();
        for(int j = 0; j < t; j++){
            int k = scan.nextInt();
            swapSubtrees(tree, k);
            printTree(tree);
        }
    }
    public static void swapSubtrees(NodeInt[] tree, int k){
        swapSubtrees(tree, k, 1, 1);
    }
    public static void swapSubtrees(NodeInt[] tree, int k, int h, int i){
        if(i == -1) return;
        NodeInt tempTree = tree[i];

        //Checking K, swap subtrees at depth h, where h ∈ [K, 2K, 3K,...].
        if(h % k == 0){
            int swap = tempTree.left;
            tempTree.left = tempTree.right;
            tempTree.right = swap;
        }

        //Traversing the tree
        swapSubtrees(tree, k, h+1, tempTree.left);
        swapSubtrees(tree, k, h+1, tempTree.right);
    }
    public static void printTree(NodeInt[] tree){
        printTree(tree, 1);
        System.out.println();
    }
    public static void printTree(NodeInt[] tree, int i){
        if(i == -1) return;
        NodeInt node = tree[i];
        printTree(tree, node.left);
        System.out.print(i + " ");
        printTree(tree, node.right);
    }
}
