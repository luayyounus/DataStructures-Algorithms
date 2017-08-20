package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class InsertNodeIntoSortedDoublyLL {
    public NodeDoubly SortedInsert(NodeDoubly head,int data) {
        if(head == null){
            NodeDoubly rootNode = new NodeDoubly();
            rootNode.data = data;
            return rootNode;
        }
        NodeDoubly current = head.next;
        NodeDoubly prev = head;
        NodeDoubly insertNode = new NodeDoubly();
        insertNode.data = data;

        while(current != null){
            if(current.data < data){
                current = current.next;
                prev = prev.next;
            } else {
                prev.next = insertNode;
                insertNode.next = current;
                current.prev = insertNode;
                insertNode.prev = prev;
                return head;
            }
        }
        prev.next = insertNode;
        insertNode.prev = prev;
        return head;
    }
}
