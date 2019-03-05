package com.takumicx.dp;

/**
 * @author: takumiCX
 * @create: 2019-03-05
 * @email: takumicx@zju.edu.cn
 **/

import java.util.Scanner;

/**
 * 01背包问题
 * eg:   5 8
 * 3 5 1 2 2
 * 4 5 2 1 3
 */
public class Package01 {


    static int[] weight;
    static int[] value;
    static int[] dp;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v = scanner.nextInt();
        weight = new int[n + 1];
        value = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            weight[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            value[i] = scanner.nextInt();
        }

        dp = new int[n + 1];

        int d = dp(n, v);

        System.out.println(d);

//        int[][] dp = new int[n + 1][v+1];
//        for(int j=0;j<=n;j++){
//            dp[0][j]=0;
//        }
//
//        for(int i=1;i<=n;i++){
//            for(int vv=weight[i];vv<=v;vv++){
//                dp[i][vv]=Math.max(dp[i-1][vv],dp[i-1][vv-weight[i]]+value[i]);
//            }
//        }
//        System.out.println(dp[n][v]);

    }

    //01背包的递归写法
    private static int dp(int n, int v) {

        if (n == 0) return 0;
        if (v < weight[n]) {
            dp[n]=dp(n-1,v);
        } else {
            dp[n] = Math.max(dp(n - 1, v), dp(n - 1, v - weight[n]) + value[n]);
        }
        return dp[n];
    }

//    private static int dp(int[] dp, int i, int v) {
//        if(i==0) return 0;
////        if(weight[i]>v) return 0;
//        dp[i]=Math.max(dp(dp,i-1,v),dp(dp,i-1,v-weight[i])+value[i]);
//        return dp[i];
//    }

}
