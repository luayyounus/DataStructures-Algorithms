package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Arrays;

import java.util.Scanner;

public class Array2D {
    public static int[][] array2d = new int[6][6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                array2d[i][j] = scanner.nextInt();
            }

        }
        int largestHourGlass = checkHourGlasses(array2d);
        System.out.print(largestHourGlass);
    }
    public static int checkHourGlasses(int[][] hgArray){
        int sum = 0;
        int max = -999;
        for (int j = 0; j < 4; j++){
            for(int i = 0; i < 4; i++){
                for(int k = i;k < i + 3; k++){
                    for(int l = j; l < j + 3; l++){
                        sum += hgArray[k][l];
                    }
                }
                sum -= hgArray[i+1][j];
                sum -= hgArray[i+1][j+2];
                if (sum > max){
                    max = sum;
                }
                sum = 0;
            }
        }
        return max;
    }
}