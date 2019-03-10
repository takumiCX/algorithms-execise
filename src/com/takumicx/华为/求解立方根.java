package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 求解立方根 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            double d = scanner.nextDouble();
            double low = 0.0;
            double high = d;
            if (d < 1) {
                low = d;
                high = 1;
            }
            double mid = 0.0;
            while (high - low>= 0.1*0.1*0.1) {
                mid = (high+low) / 2;
                if (mid * mid * mid < d) {
                    low = mid;
                } else if (mid * mid * mid > d) {
                    high = mid;
                } else {
                    break;
                }
            }

            System.out.printf("%.1f", mid);
            System.out.println();
        }
    }
}
