package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-09
 * @email: takumicx@zju.edu.cn
 **/
public class 自守数 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            int sum=0;
            for(int i=0;i<=num;i++){
                if(isZishou(i)){
                    sum+=1;
                }
            }
            System.out.println(sum);
        }
    }

    private static boolean isZishou(int i) {
        String s = String.valueOf(i);
        String ss = String.valueOf(i * i);
        return ss.endsWith(s);
    }
}
