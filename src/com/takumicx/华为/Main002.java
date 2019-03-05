package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/
//写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
public class Main002 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toLowerCase();
        char ch = scanner.next().toLowerCase().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch) count++;
        }
        System.out.println(count);

    }


}
