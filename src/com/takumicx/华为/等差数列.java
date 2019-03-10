package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-09
 * @email: takumicx@zju.edu.cn
 **/
public class 等差数列 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            long sum=(2+3*num-1)*num/2;
            System.out.println(sum);
        }
    }
}
