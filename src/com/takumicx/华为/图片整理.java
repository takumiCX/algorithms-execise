package com.takumicx.华为;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 图片整理 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            for(int i=0;i<chars.length;i++){
                System.out.print(chars[i]);
            }
            System.out.println();
        }

    }
}
