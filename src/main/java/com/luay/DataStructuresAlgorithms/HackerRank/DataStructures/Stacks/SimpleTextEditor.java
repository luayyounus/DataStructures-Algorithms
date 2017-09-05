package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int type;
        Stack<String> history = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        String s = "";
        for(int i=0; i<q; i++){
            type = scan.nextInt();
            if(type == 1){
                String w = scan.next();
                history.push(s);
                stringBuilder.append(w);
                s = stringBuilder.toString();
            } else if(type == 2){
                int lastK = scan.nextInt();
                history.push(s);
                stringBuilder.delete(stringBuilder.length() - lastK, stringBuilder.length());
                s = stringBuilder.toString();
            } else if(type == 3){
                int kth = scan.nextInt();
                System.out.println(stringBuilder.charAt(kth - 1));
            } else if(type == 4){
                String undo = history.pop();
                s = undo;
                stringBuilder.replace(0, stringBuilder.length(),s);
            }
        }
    }
}
