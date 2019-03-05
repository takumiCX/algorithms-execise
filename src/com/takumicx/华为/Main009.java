package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main009 {

    static boolean[] hasOccur=new boolean[10];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = String.valueOf(scanner.nextInt());
        for(int i=s.length()-1;i>=0;i--){
            Integer k = Integer.valueOf(s.charAt(i) + "");
            if(!hasOccur[k]){
                System.out.print(k);
                hasOccur[k]=true;
            }
        }
    }
}
