package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        for(int i=split.length-1;i>=0;i--){
            System.out.print(split[i]+" ");
        }

    }
}
