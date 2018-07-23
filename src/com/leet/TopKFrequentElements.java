package com.leet;

import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (Integer i: nums) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i,0)+1);
        }

        List<Integer> count = new ArrayList<>(frequencyMap.values());
        Collections.sort(count);

        int threshold = count.get(count.size()-k);

        for(int num : frequencyMap.keySet()){
            if(frequencyMap.get(num) >= threshold) res.add(num);

        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,3,3,2,5,6,5,5,4,3,3,2,4,24,2};
    }
}
