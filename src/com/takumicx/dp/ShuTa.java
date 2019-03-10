package com.takumicx.dp;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-05
 * @email: takumicx@zju.edu.cn
 **/
/**
 * 经典的数塔问题,将一些数字排成数塔的形状,其中第一层有一个数字,第二层有2个数字....第n层有n个数字。
 */
public class ShuTa {

    /**
     * 5
     * 5
     * 8 3
     * 12 7 16
     * 4 10 11 6
     * 9 5 3 9 4
     *
     * 答案:44
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] dp = new int[num + 1][num + 1];
        int[][] arr = new int[num + 1][num + 1];
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int max=-Integer.MAX_VALUE;
        for(int i=1;i<num+1;i++){
            for(int j=1;j<=i;j++){
                dp[i][j]=Math.max(dp[i-1][j-1],dp[i-1][j])+arr[i][j];
                if(dp[i][j]>max) max=dp[i][j];
            }
        }
        System.out.println(max);


//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int[][] arr = new int[num + 1][num + 1];
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//
//        //递归写法
////        int d=dp(1,1,arr);
//        int d = dp2(arr);
//
//        System.out.println(d);

    }


    /**
     * 递推写法
     *
     * @param arr
     * @return
     */
    private static int dp2(int[][] arr) {
        int num = arr.length - 1;
        int[][] dp = new int[num+1][num+1];
        for (int j = 1; j <= num; j++) {
            dp[num][j] = arr[num][j];
        }
        int max = -1;
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = arr[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
                if (dp[i][j] > max) max = dp[i][j];
            }
        }
        return max;
    }

    /**
     * 递归写法
     *
     * @param i
     * @param j
     * @param arr
     * @return
     */
    private static int dp(int i, int j, int[][] arr) {
        if (i == arr.length - 1) return arr[i][j];
        return arr[i][j] + Math.max(dp(i + 1, j, arr), dp(i + 1, j + 1, arr));
    }


}
