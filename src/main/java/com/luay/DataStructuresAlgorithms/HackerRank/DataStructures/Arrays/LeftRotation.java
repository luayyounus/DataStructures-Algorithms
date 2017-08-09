package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<Integer> originalArray = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            originalArray.add(((i+n-d)%n) , scanner.nextInt());
        }

        for (int k = 0; k < n; k++){
            System.out.print(originalArray.get(k) + " ");
        }
    }
}
