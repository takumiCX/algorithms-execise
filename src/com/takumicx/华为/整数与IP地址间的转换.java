package com.takumicx.华为;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 整数与IP地址间的转换 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (s.contains(".")) {
                long sum = 0;
                String[] split = s.split("\\.");
                for (int i = split.length - 1; i >= 0; i--) {
                    sum += Integer.valueOf(split[i]) * Math.pow(256, split.length - 1 - i);
                }
                System.out.println(sum);

            } else {
                Long m = Long.valueOf(s);
                ArrayList<Long> list = new ArrayList<>();
                while (m != 0) {
                    long n = m % 256;
                    m /= 256;
                    list.add(n);
                }
                StringJoiner joiner = new StringJoiner(".");
                for (int i = list.size() - 1; i >= 0; i--) {
                    joiner.add(list.get(i) + "");
                }
                System.out.println(joiner.toString());

            }

        }
    }
}