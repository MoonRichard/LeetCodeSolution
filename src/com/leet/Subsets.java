package com.leet;

import com.leet.util.MyTest;
import com.leet.util.PrintList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)
 * backtrack question collection
 */
public class Subsets implements MyTest {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        Arrays.sort(nums);

        subsetsHelp(res, tempList, nums, 0);
        return res;
    }

    public void subsetsHelp(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start) {
        res.add(new ArrayList<>(tempList));
        for (int i = start; i<nums.length; i++) {
            tempList.add(nums[i]);
            System.out.println(Arrays.toString(tempList.toArray()));
            subsetsHelp(res, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }

    @Override
    public void test() {
        int[] nums = {1,2,3};
        List<List<Integer>> res = subsets(nums);
//        for (List<Integer> list:
//             res) {
//            PrintList.print(list);
//        }

    }
}
