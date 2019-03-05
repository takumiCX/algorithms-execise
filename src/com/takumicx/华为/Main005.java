package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/
public class Main005 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       while (scanner.hasNext()){
           String s = scanner.nextLine();
           int i = Integer.parseInt(s.substring(2), 16);
           System.out.println(i);
       }

    }
}
