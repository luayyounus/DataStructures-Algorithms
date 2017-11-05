package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Queues;
import java.util.Scanner;

public class TruckTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int position = 0;
        int outOfGas = 0;
        int a,b;
        for(int i = 0; i < n; i++){
            a = scan.nextInt();
            b = scan.nextInt();
            sum = sum + (a-b);
            if(sum < 0){
                outOfGas += sum;
                sum = 0;
                position = i+1;
            }
            if(i == n-1) {

                if(sum + outOfGas >= 0){
                    System.out.println(position);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
