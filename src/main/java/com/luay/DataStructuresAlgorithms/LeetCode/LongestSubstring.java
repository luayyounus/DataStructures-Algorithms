package com.luay.DataStructuresAlgorithms.LeetCode;

import java.util.HashMap;
import java.util.Map;

//store the char and its index .. when duplicates, advance the pointer at the beginning by one from its index in the hashmap
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int result = 0;
        for(int i = 0, j = 0; j < s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}
