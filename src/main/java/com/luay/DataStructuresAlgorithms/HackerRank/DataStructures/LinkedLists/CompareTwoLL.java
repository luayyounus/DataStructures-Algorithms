package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class CompareTwoLL {
    int CompareLists(Node headA, Node headB) {
        if(headA == null && headB == null) return 1;
        if(headA == null || headB == null || headA.data != headB.data) return 0;
        return CompareLists(headA.next, headB.next);
    }
}
