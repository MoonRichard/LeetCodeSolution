package com.leet.util;

import java.util.Arrays;
import java.util.List;

public class PrintList {
    public static void print(List<List<Integer>> lists) {
        for (List<Integer> list:
                lists
             ) {
            System.out.println(Arrays.toString(list.toArray()));
        }

    }
}
