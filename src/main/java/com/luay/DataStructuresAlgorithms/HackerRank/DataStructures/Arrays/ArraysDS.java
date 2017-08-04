package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Arrays;

import java.util.Scanner;
import java.util.Stack;

public class ArraysDS {

    static Stack<Integer> stack;

    public ArraysDS() {
        stack = new Stack<Integer>();
    }

    public static void addToStack(int x) {
        stack.push(x);
    }

    public static void printStack(Stack<Integer> p, int limit) {
        for (int i = 0 ; i < limit ; i++){
            System.out.print(stack.pop() + " ");
        }
    }
}
