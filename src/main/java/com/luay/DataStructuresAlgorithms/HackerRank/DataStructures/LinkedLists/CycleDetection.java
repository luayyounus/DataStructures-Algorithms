package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class CycleDetection {
    boolean hasCycle(Node head) {
        if(head == null) return false;
        Node walker = head;
        Node runner = head.next;
        while(runner != null && runner.next != null){
            if(walker == runner) return true;
            walker = walker.next;
            runner = runner.next.next;
        }
        return false;
    }
}
