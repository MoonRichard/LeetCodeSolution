package com.leet;

import com.leet.util.MyTest;
import com.leet.util.PrintList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII implements MyTest {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumHelp(res, temp, candidates, target, 0);
        return res;
    }

    public boolean combinationSumHelp(List<List<Integer>> res, List<Integer> tempList, int[] candidates, int remain,int start) {
        if (remain < 0) {
            return true;
        }
        if (remain == 0) {
            res.add(new ArrayList<>(tempList));
            return true;
        }
        for(int i = start; i<candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i-1]) continue;
            tempList.add(candidates[i]);
            remain -= candidates[i];

            boolean end = combinationSumHelp(res, tempList, candidates, remain, i+1);
            //回溯应还原的内容
            remain += candidates[i];
            tempList.remove(tempList.size()-1);
            if (end) break;
        }
        return false;
    }


    @Override
    public void test() {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = combinationSum(nums, target);
        PrintList.print(res);
    }
}
