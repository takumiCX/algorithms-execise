package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-09
 * @email: takumicx@zju.edu.cn
 **/
public class 梅花桩 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int[] arr = new int[num];
            int[] opt = new int[num];
            for(int i=0;i<num;i++){
                arr[i]=scanner.nextInt();
            }
            int max=1;
            for(int i=0;i<arr.length;i++){
                opt[i]=1;
                for(int j=0;j<i;j++){
                    if(arr[i]>arr[j]&&opt[j]+1>opt[i]){
                        opt[i]=opt[j]+1;
                        if(opt[i]>max)max=opt[i];
                    }
                }
            }
            System.out.println(max);
        }

    }
}
