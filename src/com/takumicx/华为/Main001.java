package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/
public class Main001 {

    //计算字符串最后一个单词的长度
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] split = s.split("\\s+");

        System.out.println(split[split.length-1].length());

    }
}
