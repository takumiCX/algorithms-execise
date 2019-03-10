package com.takumicx.leetcode;


import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-06
 * @email: takumicx@zju.edu.cn
 **/
public class Main213 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split("\\s+");
        int[] arr = new int[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(split[i]);
        }
        int rob = rob(arr);
        System.out.println(rob);
    }


    public static int rob(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] dp1 = new int[nums.length];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);
        int m = rob2(nums, dp1);

        int[] dp2 = new int[nums.length];
        dp2[0] = 0;
        dp2[1] = nums[1];
        int n = rob2(nums, dp2);
        return Math.max(m, n);

    }


    public static int rob2(int[] nums, int[] dp) {

        int max=-Integer.MAX_VALUE;
        for (int i = 2; i < nums.length; i++) {
            if (i == nums.length - 1 && dp[0] != 0) {
                dp[i] = dp[i - 1];
            } else {
                dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
                if(dp[i]>max)max=dp[i];
            }
        }
        return max;
    }


}
