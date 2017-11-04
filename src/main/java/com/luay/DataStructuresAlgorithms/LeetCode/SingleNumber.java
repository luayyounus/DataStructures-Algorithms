package com.luay.DataStructuresAlgorithms.LeetCode;

//Given an array of integers, every element appears twice except for one. Find that single one.
//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    // time O(N)
    // No additional Space
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }

    // time O(N)
    // Space : O(N)
    public int singleNumber2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])) {
                list.remove(Integer.valueOf(nums[i]));
            } else {
                list.add(Integer.valueOf(nums[i]));
            }
        }
        return list.remove(0);
    }
}
