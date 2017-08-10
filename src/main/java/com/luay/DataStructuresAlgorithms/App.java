package com.luay.DataStructuresAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] a = new int[]{1,2,3};
        int temp = 0;
        int max = 0;
        for(int i=0;i<3;i++){
            temp += a[i];
            if(temp > max) max = temp;
        }
        System.out.println(max);
    }
}
