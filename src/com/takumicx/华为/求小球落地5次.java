package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 求小球落地5次 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            double start = scanner.nextDouble();
            double sum=start;
            for(int i=1;i<=4;i++){
                start/=2;
                sum+=start*2;
            }
            System.out.println(sum);
            System.out.println(start/2);
        }
    }
}
