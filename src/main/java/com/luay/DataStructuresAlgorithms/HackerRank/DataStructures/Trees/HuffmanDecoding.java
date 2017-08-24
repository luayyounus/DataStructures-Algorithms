package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Trees;

public class HuffmanDecoding {
    //Non-recursive
    public void decode(String S ,NodeFrequency root){
        NodeFrequency current = root;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '0'){
                current = current.left;
            } else {
                current = current.right;
            }
            if(current.data != '\0'){
                System.out.print(current.data);
                current = root;
            }
        }
    }
}
