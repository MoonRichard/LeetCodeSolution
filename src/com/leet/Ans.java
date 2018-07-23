package com.leet;

import com.leet.util.PrintBinaryTree;

public class Ans {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        new CombinationSumII().test();

        long end = System.currentTimeMillis();
        long costtime = end - start;
        System.out.println("duration: "+costtime);

    }
}

