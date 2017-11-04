package com.luay.DataStructuresAlgorithms.LeetCode;

public class SumWithoutArithmaticOperators {
    public int getSum(int a, int b) {
        int carry;
        while(b != 0){
            // carry will be our condition
            carry = a & b;

            // xor will sum up the values
            a = a ^ b;

            //shifting by one ... if carry = 0 0 0 0 0 0 0 0 then the loops will stop
            b = carry << 1;
        }
        return a;
    }
}
