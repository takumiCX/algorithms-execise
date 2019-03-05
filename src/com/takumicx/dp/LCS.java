package com.takumicx.dp;

/**
 * @author: takumiCX
 * @create: 2019-03-05
 * @email: takumicx@zju.edu.cn
 **/

import java.util.Scanner;

/**
 * 最长公共子序列LCS(Longest Common Subsequence),可以不连续
 * eg: sadstory
 *     adminsorry
 */

public class LCS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
//        int d=dp1(s1,s2);
        int d=dp2(s1,s2);
        System.out.println(d);

    }

    //递归方式
    private static int dp2(String s1, String s2) {
        if(s1.length()==0||s2.length()==0)return 0;
        if(s1.charAt(s1.length()-1)==s2.charAt(s2.length()-1)){
            return dp2(s1.substring(0,s1.length()-1),s2.substring(0,s2.length()-1))+1;
        }
        return Math.max(dp2(s1.substring(0,s1.length()-1),s2),dp2(s1,s2.substring(0,s2.length()-1)));
    }

    //递推方式
    private static int dp1(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for(int i=0;i<s1.length()+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<s2.length()+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

}
