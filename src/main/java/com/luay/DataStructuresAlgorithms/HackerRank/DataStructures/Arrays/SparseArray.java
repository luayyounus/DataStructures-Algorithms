package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SparseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<String>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            namesList.add(scan.next());
        }
        int q = scan.nextInt();
        for(int i = 0; i < q; i++) {
            int count = 0;
            String checkingString = scan.next();
            for(String word : namesList) {
                if(word.equals(checkingString))
                    count++;
            }
            System.out.println(count);
        }
    }
}
