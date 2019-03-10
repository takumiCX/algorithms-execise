package com.takumicx.华为;

import java.util.Scanner;



/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 统计每个月兔子的总数 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            int d=getTotal(m);
            System.out.println(d);
        }
    }

    private static int getTotal(int m) {
        if(m==1||m==2) return 1;
        return getTotal(m-1)+getTotal(m-2);
    }
}
