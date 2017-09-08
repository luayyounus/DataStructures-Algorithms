package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }

            //Stack A and Stack B so we can pop once at a time from the top
            Stack<Integer> stackA = new Stack<>();
            Stack<Integer> stackB = new Stack<>();
            for (int i = 0; i < n; i++) {
                stackA.push(a[n - 1 - i]);
            }
            for (int j = 0; j < m; j++) {
                stackB.push(b[m - 1 - j]);
            }

            int maxPoints = 0;

            if(stackA.peek() > x && stackB.peek() > x){
                System.out.println(maxPoints);
            } else {
                long sum = 0;
                int i = 0;
                int j = 0;

                //Check the First Stack till the end
                while(!stackA.isEmpty() && sum + stackA.peek() <= x){
                    sum += stackA.pop();
                    i++;
                }
                maxPoints = i;

                //Check the second stack and increase points by number of popped StackB items while decreasing points we counted in from StackA
                while(!stackB.isEmpty() && i >= 0){
                    sum += stackB.pop();
                    j++;
                    if(sum > x && i > 0){
                        sum -= a[i-1];
                        i--;
                    }
                    if(sum <= x && i+j > maxPoints){
                        maxPoints = i + j;
                    }
                }
                System.out.println(maxPoints);
            }
        }
    }
}


