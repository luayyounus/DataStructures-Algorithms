package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Arrays;

import java.util.*;

public class AlgorithmicCrush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int m = 2;

        long[] myList = new long[n];
        Arrays.fill(myList, 0);

        int a = 2;
        int b = 4;
        long k = 100;
        myList[a-1] += k;
        if(b < n) myList[b] -= k;

        int x = 3;
        int y = 5;
        long z = 100;
        myList[x-1] += z;
        if(y < n) myList[y] -= z;

        long max = 0;
        long temp = 0;
        for (int p=0; p<n; p++){
            temp += myList[p];
            if(temp > max){
                max = temp;
            }
        }
        System.out.print(max);
    }
}
