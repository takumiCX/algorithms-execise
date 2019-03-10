package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 记负均正2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int positiveNum = 0;
            int negativeNum = 0;
            double positiveSum = 0;
            String[] split = scanner.nextLine().split("\\s+");
            for (int i = 0; i < split.length; i++) {
                Integer d = Integer.valueOf(split[i]);
                if (d < 0) {
                    negativeNum++;
                } else {
                    positiveNum++;
                    positiveSum += d;
                }
            }
            System.out.println(negativeNum);
            if (positiveNum == 0) {
                System.out.println("0.0");
            } else {
                System.out.printf("%.1f", positiveSum / positiveNum);
                System.out.println();
            }
        }

    }
}
