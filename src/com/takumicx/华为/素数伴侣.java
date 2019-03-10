package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-06
 * @email: takumicx@zju.edu.cn
 **/
public class 素数伴侣 {

    static int max=0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            int num = scanner.nextInt();
            int[] arr = new int[num];
            for(int i=0;i<num;i++){
                arr[i]=scanner.nextInt();
            }
            permutation(arr,0);

            System.out.println(max);

        }
    }

    private static void permutation(int[] arr, int i) {
        if(i==arr.length-1){
            int count=0;
            for(int j=0;j<arr.length-1;j+=2){
                if(isPrime(arr[j]+arr[j+1])){
                    count++;
                }
            }
            max=count>max?count:max;
        }else {
            for(int j=i;j<arr.length;j++){
                swap(arr,i,j);
                permutation(arr,i+1);
                swap(arr,i,j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    private static boolean isPrime(int n) {

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
