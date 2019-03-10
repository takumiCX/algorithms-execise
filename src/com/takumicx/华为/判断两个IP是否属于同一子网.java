package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 判断两个IP是否属于同一子网 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String mask = scanner.next();
            String ip1 = scanner.next();
            String ip2 = scanner.next();
            long maskValue = getNum(mask);
            long ip1Value = getNum(ip1);
            long ip2Value = getNum(ip2);
            if(mask.equals("255.0")){
                System.out.println(1);
                continue;
            }
            if (maskValue == -1 || ip1Value == -1 || ip2Value == -1) {
                System.out.println(1);
            } else if ((maskValue & ip1Value) == (maskValue & ip2Value)) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }

        }

    }

    private static long getNum(String s) {

        String[] split = s.split("\\.");
        long sum = 0;
        for (int i = 0; i < split.length; i++) {
            Long m = Long.valueOf(split[i]);
            if (m < 0 || m > 255) {
                return -1;
            }
            sum += m * Math.pow(256, split.length - 1 - i);
        }
        return sum;

    }
}
