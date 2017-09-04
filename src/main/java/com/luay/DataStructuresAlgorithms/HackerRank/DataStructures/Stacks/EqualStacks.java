package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Stacks;

import java.util.Scanner;

public class EqualStacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        int[] s1 = new int[n1];
        int[] s2 = new int[n2];
        int[] s3 = new int[n3];

        int h1=0, h2=0, h3=0;

        for(int i = 0; i < n1; i++){
            s1[i] = scan.nextInt();
            h1 += s1[i];
        }
        for(int j = 0; j < n2; j++){
            s2[j] = scan.nextInt();
            h2 += s2[j];
        }
        for(int k = 0; k < n3; k++){
            s3[k] = scan.nextInt();
            h3 += s3[k];
        }

        if(h1 == 0 || h2 == 0 || h3 == 0){
            System.out.print(0);
        } else {
            int i=0, j=0, k=0;
            while(!(h1 == h2 && h2 == h3)){
                if(h1 > h2 || h1 > h3){
                    h1 -= s1[i++];
                } else if(h2 > h1 || h2 > h3){
                    h2 -= s2[j++];
                } else if(h3 > h1 || h3 > h2){
                    h3 -= s3[k++];
                }
            }
            System.out.print(h1);
        }
    }
}
