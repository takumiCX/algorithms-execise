package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = Integer.toBinaryString(i);
        int count=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
