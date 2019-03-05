package com.takumicx.leetcode;


/**
 * @author: takumiCX
 * @create: 2019-03-05
 * @email: takumicx@zju.edu.cn
 **/
public class Main198 {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 1};
        int d = rob(ints);
        System.out.println(d);


    }



    public static int rob(int[] nums){

        int[] dp = new int[nums.length];
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        int max=-Integer.MAX_VALUE;
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            if(max<dp[i])max=dp[i];
        }
        return max;
    }

//    private static int rob(int i, int[] nums,int[] cache) {
//        if(i<0) return 0;
//        if(i==0) return nums[0];
//        if(i==1) return Math.max(nums[0],nums[1]);
//        if(cache[i-1]==0){
//            cache[i-1]=rob(i-1,nums,cache);
//        }
//        if(cache[i-2]==0){
//            cache[i-2]=rob(i-2,nums,cache);
//        }
//        cache[i]=Math.max(cache[i-1],cache[i-2]+nums[i]);
//        return cache[i];
//    }
}
