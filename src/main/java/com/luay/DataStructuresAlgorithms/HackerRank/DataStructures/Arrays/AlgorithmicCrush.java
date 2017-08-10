package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlgorithmicCrush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[] myList = new long[n];
        for(int i=0;i<n;i++) myList[i]=0;

        int a;
        int b;
        long k;
        for (int j=0; j<m ; j++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            k = scanner.nextInt();
            myList[a-1] += k;
            if(b < n) myList[b] -= k;
        }

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
