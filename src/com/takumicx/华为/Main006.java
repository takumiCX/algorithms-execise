package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        for(int i=2;i<=m;i++){
            while (m%i==0){
                System.out.print(i+" ");
                m/=i;
            }
        }

    }
}
