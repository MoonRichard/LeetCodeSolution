package com.leet;
import com.leet.util.MyTest;
public class LongestCommonSubsequence implements MyTest {

    public int getLength(String x, String y,int xIndex, int yIndex) {
        int[][] dp = new int[x.length()+1][y.length()+1];
        for(int i = 0; i < dp.length; i++) dp[i][0] = 0;
        for(int i = 0; i < dp[0].length; i++) dp[0][i] = 0;

        for(int i = 1; i< dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (x.charAt(i-1) == y.charAt(j-1)) dp[i][j] = dp[i-1][j-1] +1 ;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        // for (int[] ints : dp) {
        //     for (int i : ints) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        return dp[dp.length-1][dp[0].length-1];
        
    }


    @Override
    public void test() {
        String x = "hello,aa";
        String y = "abbca";
        System.out.printf("length: %d",getLength(x, y, x.length(), y.length()));
        
    }
}