package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-06
 * @email: takumicx@zju.edu.cn
 **/
public class 购物单 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int W = scanner.nextInt();
            int num = scanner.nextInt();
            int[] weight = new int[num + 1];
            int[] value = new int[num + 1];
            int[] q = new int[num + 1];
            for (int i = 1; i <= num; i++) {
                weight[i] = scanner.nextInt();
                value[i] = scanner.nextInt() * weight[i];
                q[i] = scanner.nextInt();
            }
            int[][] dp = new int[num + 1][W+1];
            for (int i = 1; i <= num; i++) {
                for (int w = weight[i]; w <= W; w++) {
                    if (q[i] == 0) {
                        dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weight[i]] + value[i]);
                    } else {

                        if (weight[i] + weight[q[i]] <= w) {
                            dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weight[i]] + value[i]);
                        }
                    }
                }
            }
            System.out.println(dp[num][W]);
        }
    }
}
