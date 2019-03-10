package com.takumicx;

/**
 * @author: takumiCX
 * @create: 2019-03-09
 * @email: takumicx@zju.edu.cn
 **/
public class Permutation {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,4,5,6,7,8,9,10};
        permutation(arr,0);
    }

    private static void permutation(int[] arr, int i) {
        if(i==arr.length-1){
            for(int j=0;j<arr.length;j++){
//                System.out.print(arr[j]);
            }
//            System.out.println();
            return;
        }
        for(int j=i;j<arr.length;j++){
            swap(arr,i,j);
            permutation(arr,i+1);
            swap(arr,i,j);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
