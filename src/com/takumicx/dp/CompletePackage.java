package com.takumicx.dp;

/**
 * @author: takumiCX
 * @create: 2019-03-05
 * @email: takumicx@zju.edu.cn
 **/

import java.util.Scanner;

/**
 * 完全背包
 */

/**
 * 5 8
 * 3 5 1 2 2
 * 4 5 2 1 3
 * 20
 */
public class CompletePackage {

    static int[] w;
    static int[] c;
    static int[] dp;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int W = scanner.nextInt();
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        int[][] dp = new int[n + 1][W + 1];
        for(int i=1;i<=n;i++){
            w[i]=scanner.nextInt();
        }
        for(int i=1;i<=n;i++){
            v[i]=scanner.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int vv=w[i];vv<=W;vv++){
                dp[i][vv]=Math.max(dp[i-1][vv],dp[i][vv-w[i]]+v[i]);
            }
        }

        System.out.println(dp[n][W]);


//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int v = scanner.nextInt();
//        w=new int[num];
//        c=new int[num];
//        dp=new int[num];
//        for(int i=0;i<num;i++){
//            w[i]=scanner.nextInt();
//        }
//        for(int i=0;i<num;i++){
//            c[i]=scanner.nextInt();
//        }
//        int d=dp(num-1,v);
//        System.out.println(d);
    }

    private static int dp(int i, int v) {
        if(i<0) return 0;
        if(v<dp[i]){
            dp[i]=dp(i-1,v);
        }else {
            dp[i]=Math.max(dp(i-1,v),dp(i,v-w[i])+c[i]);
        }
        return dp[i];
    }
}
