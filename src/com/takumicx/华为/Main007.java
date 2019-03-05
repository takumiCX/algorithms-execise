package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main007 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double d = scanner.nextDouble();

        String s = d.toString();

        String[] split = s.split("\\.");

        if(split[1].charAt(0)>='5'){
            System.out.println(Integer.valueOf(split[0])+1);
        }else {
            System.out.println(Integer.valueOf(split[0]));
        }

    }
}
