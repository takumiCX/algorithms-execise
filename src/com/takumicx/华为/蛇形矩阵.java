package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 蛇形矩阵 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            int[][] arr = new int[num][num];
            arr[0][0]=1;
            for(int j=1;j<num;j++){
                arr[0][j]=arr[0][j-1]+j+1;
            }
            for(int i=1;i<num;i++){
                arr[i][0]=arr[i-1][0]+i;
                for(int j=1;j<num-i;j++){
                    arr[i][j]=arr[i][j-1]+j+i+1;
                }
            }

            for(int i=0;i<num;i++){
                for(int j=0;j<num-i;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
