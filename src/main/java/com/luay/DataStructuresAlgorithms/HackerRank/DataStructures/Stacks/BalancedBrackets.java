package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    static String isBalanced(String s) {
        Stack<Character> bracketsStack = new Stack<>();

        char[] charArray;
        charArray = s.toCharArray();

        for(char c: charArray){
            if(c == '{'){
                bracketsStack.push('}');
            } else if(c == '['){
                bracketsStack.push(']');
            } else if(c == '('){
                bracketsStack.push(')');
            } else if(bracketsStack.isEmpty() || c != bracketsStack.pop()){
                return "NO";
            }
        }
        if(!bracketsStack.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
