package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    private static int lastAnswer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        ArrayList[] arrayList = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            arrayList[i] = new ArrayList<Integer>();
        }

        for (int j = 0; j < q; j++) {
            int queryType = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int sequenceIndex = ((x ^ lastAnswer) % n);

            if (queryType == 1){
                arrayList[sequenceIndex].add(y);
            } else if (queryType == 2){
                ArrayList<Integer> sequence = arrayList[sequenceIndex];
                int size = sequence.size();
                int tempIndex = y % size;
                lastAnswer = sequence.get(tempIndex);
                System.out.println(lastAnswer);
            }
        }
    }
}
