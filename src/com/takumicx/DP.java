package com.takumicx;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-04
 * @email: takumicx@zju.edu.cn
 **/
public class DP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(",");
        int[] arr = new int[split.length];
        for(int i=0;i<split.length;i++){
            arr[i]=Integer.valueOf(split[i]);
        }
        int a=dp(arr,arr.length-1);
        System.out.println(a);

    }

    private static int dp(int[] arr, int i) {
        if(i==0) return arr[i];
        if(i==1) return Math.max(arr[0],arr[1]);
        return Math.max(dp(arr,i-1),dp(arr,i-2)+arr[i]);
    }
}
