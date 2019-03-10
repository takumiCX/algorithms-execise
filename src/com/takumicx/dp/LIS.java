package com.takumicx.dp;

/**
 * @author: takumiCX
 * @create: 2019-03-05
 * @email: takumicx@zju.edu.cn
 **/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Longest Increasing Sequence LIS
 * 最长不下降子序列
 * eg:{1,2,3,-1,-2,7,9}  1,2,3,7,9
 */
public class LIS {

    //求最长不下降子序列
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split("\\s+");
        int[] arr = new int[split.length];
        for(int i=0;i<split.length;i++){
            arr[i]=Integer.valueOf(split[i]);
        }
        int[] dp = new int[arr.length];
        dp[0]=arr[0];
        int max=-Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            dp[i]=arr[i];
            for(int j=0;j<i;j++){
                if(arr[i]>=arr[j]&&dp[j]+arr[i]>dp[i]){
                    dp[i]=dp[j]+arr[i];
                    if(dp[i]>max) max=dp[i];
                }
            }
        }
        System.out.println(max);
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[7];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=scanner.nextInt();
//        }
//        List<Integer> list=dp2(arr);
//        System.out.println(list);

    }

    //递推法求完整的最长不下降子序列
    private static List<Integer> dp2(int[] arr) {

        List<Integer>[] dp=new List[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        dp[0]=list;
        int max=-1;
        int index=-1;
        for(int i=1;i<arr.length;i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            dp[i]=list1;
            for(int j=0;j<i;j++){
                if(arr[i]>=arr[j]&&dp[j].size()+1>dp[i].size()){
                    ArrayList<Integer> list2 = new ArrayList<>(dp[j]);
                    list2.add(arr[i]);
                    dp[i]=list2;
                }
            }
            if(dp[i].size()>max) index=i;
        }

        return dp[index];
    }

    //递推法求最常不下降子序列的长度
    private static int dp1(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0]=arr[0];
        int max=-1;
        for(int i=1;i<arr.length;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i]>=arr[j]&&dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                }
            }
            if(dp[i]>max)max=dp[i];
        }

        return max;
    }
}
