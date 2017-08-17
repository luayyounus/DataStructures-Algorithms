package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class FindMergePointOfTwoLists {
    public int FindMergeNode(Node headA, Node headB) {
        LinkedListLength length = new LinkedListLength();
        int a = length.linkedListLength(headA);
        int b = length.linkedListLength(headB);
        int difference = a - b;
        if(a < b){
            Node temp = headA;
            headA = headB;
            headB = temp;
            difference = b - a;
        }
        for(int i = 0; i<difference; i++){
            headA = headA.next;
        }
        while(headA != null){
            if(headA.data == headB.data){
                return headA.data;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return 0;
    }
}
