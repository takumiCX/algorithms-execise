package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 输出单向链表中倒数第K个结点 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            int[] arr = new int[num];
            for(int i=0;i<num;i++){
                arr[i]=scanner.nextInt();
            }
            int k=scanner.nextInt();
            if(k<=num&&k>0){
                System.out.println(arr[num-k]);
            }else {
                System.out.println(0);
            }

        }

    }
}
