package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    void levelOrder(NodeTree root) {
        Queue<NodeTree> q = new LinkedList<NodeTree>();
        q.add(root);
        while(!q.isEmpty()){
            NodeTree temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
    }
}
