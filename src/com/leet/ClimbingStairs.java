package com.leet;

import com.leet.util.MyTest;

public class ClimbingStairs implements MyTest {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    @Override
    public void test() {
        System.out.println(climbStairs(3));
    }
}
