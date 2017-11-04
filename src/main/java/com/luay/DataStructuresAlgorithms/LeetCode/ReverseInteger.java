package com.luay.DataStructuresAlgorithms.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) return 0;
        int reversedX = 0;
        int previousReversed = 0;
        while (x != 0) {
            reversedX = reversedX * 10 + x % 10; //moduling by 10 gives us the rightmost digit. Dividing by 10 will take out the rightmost digit.

            //checking against it's previous value will make sure that it doesn't overflow (with overflow, the int gets a garbase extra memory non-sense).

            if (previousReversed != (reversedX - x % 10) / 10) return 0;

            previousReversed = reversedX;
            x = x / 10;
        }
        return reversedX;
    }
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == 2) return true;
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        return false;
    }
}