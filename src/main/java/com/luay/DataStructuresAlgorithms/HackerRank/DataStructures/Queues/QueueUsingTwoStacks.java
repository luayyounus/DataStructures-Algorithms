package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Queues;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        int queryType; //1 enquque 2 dequeue 3 print

        for(int i=0; i<n; i++){
            queryType = scan.nextInt();
            if(queryType == 1){
                s1.push(scan.nextInt());
            } else if(queryType == 2){
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                }
                if(!s2.isEmpty()){
                    s2.pop();
                }
            } else if(queryType == 3){
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                    System.out.println(s2.peek());
                } else {
                    System.out.println(s2.peek());
                }
            }
        }
    }
}
