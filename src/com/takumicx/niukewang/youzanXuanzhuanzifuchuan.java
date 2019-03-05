package com.takumicx.niukewang;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/
public class youzanXuanzhuanzifuchuan {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(";");
        String s1 = split[0];
        String s2 = split[1];
//        if(s1.equals(s2)) return true;
        for(int i=0;i<s1.length();i++){
            boolean flag = (s1.substring(i + 1) + s1.substring(0, i + 1)).equals(s2);
            if(flag){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
