package com.takumicx.dp;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-05
 * @email: takumicx@zju.edu.cn
 **/
//-2 11 -4 13 -5 -2
public class ZuiDaLianXuZiLieHe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split("\\s+");
        int[] dp = new int[split.length];
        dp[0] = Integer.valueOf(dp[0]);
        int max = -Integer.MAX_VALUE;
        for (int i = 1; i < dp.length; i++) {
            Integer m = Integer.valueOf(split[i]);
            dp[i] = dp[i - 1] + m >= m ? dp[i - 1] + m : m;
            if (dp[i] > max) max = dp[i];
        }
        System.out.println(max);

//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[6];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=scanner.nextInt();
//        }
//
//        int[] dp = new int[6];
//        dp[0]=arr[0];
//        int max=-Integer.MAX_VALUE;
//        for(int i=1;i<6;i++){
//            dp[i]=Math.max(dp[i-1]+arr[i],arr[i]);
//            if(dp[i]>max) max=dp[i];
//        }
//        System.out.println(max);
    }
}
