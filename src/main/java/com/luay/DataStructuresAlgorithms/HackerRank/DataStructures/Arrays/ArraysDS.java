package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Arrays;

import java.util.Scanner;
import java.util.Stack;

public class ArraysDS {

    static Stack<Integer> stack = new Stack();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i< n; i++){
            addToStack(scanner.nextInt());
        }
        printStack(stack, n);
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