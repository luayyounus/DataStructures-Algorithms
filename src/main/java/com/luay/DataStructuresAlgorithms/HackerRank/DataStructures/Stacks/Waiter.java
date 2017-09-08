package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Waiter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();

        //Primes List
        int count = 0;
        int[] prime = new int[q];
        int number = 2;
        while(count != q){
            boolean primeBool = true;
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    primeBool = false;
                    break;
                }
            }
            if(primeBool){
                prime[count] = number;
                count++;
            }
            number++;
        }

        //Pushing Stream to Original Stack
        Stack<Integer> A0 = new Stack<Integer>();
        for(int i = 0; i < n; i++){
            A0.push(in.nextInt());
        }

        for(int i = 0; i < q; i++) {
            Stack<Integer> An = new Stack<Integer>();
            Stack<Integer> Bn = new Stack<Integer>();
            while(!A0.isEmpty()) {
                int num = A0.pop();
                if(num % prime[i] == 0) {
                    Bn.push(num);
                } else {
                    An.push(num);
                }
            }
            A0 = An;
            while(!Bn.isEmpty()){
                System.out.println(Bn.pop());
            }
        }

        while(!A0.isEmpty()) {
            System.out.println(A0.pop());
        }
    }
}
