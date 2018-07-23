package com.leet;

import com.leet.util.MyTest;
import com.leet.util.PrintList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations implements MyTest {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permuteHelp(res, list,nums,0);
        return res;
    }

    public void permuteHelp(List<List<Integer>> res, List<Integer> tempList, int[] nums,int index) {
        if ( tempList.size() == nums.length) {
            res.add(new ArrayList<>(tempList));
            return;
        }
        for( int i = index; i < nums.length; i++ ){
            if (tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
//            System.out.println(Arrays.toString(tempList.toArray()));
            permuteHelp(res, tempList, nums, 0);
            tempList.remove(tempList.size()-1);
        }
    }

    @Override
    public void test() {
        int[] nums = {1,2,3};
        List<List<Integer>> res = permute(nums);


    }
}
