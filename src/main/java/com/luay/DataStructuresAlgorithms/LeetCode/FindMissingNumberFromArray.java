package com.luay.DataStructuresAlgorithms.LeetCode;

public class FindMissingNumberFromArray {

    //Missing Number
    //Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
    //find the one that is missing from the array. For example, Given nums = [0, 1, 3] return 2.
    // (Of course, you can do this by math.)

    public static void main(String[] args){
        int[] nums = new int[]{1,2,4,5}; //result is 3
        System.out.print(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int ret = 0;
        for(int i = 0; i < nums.length; ++i) {
            ret ^= i;
            ret ^= nums[i];
        }
        return ret^=nums.length;
    }
}
