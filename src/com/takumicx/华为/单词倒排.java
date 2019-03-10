package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 单词倒排 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isAlphabetic(c)){
                    sb.append(c);
                }else {
                    sb.append(" ");
                }
            }
            String[] split = sb.toString().split("\\s+");
            StringBuilder sb2 = new StringBuilder();
            for(int i=split.length-1;i>=0;i--){
                sb2.append(split[i]).append(" ");
            }

            System.out.println(sb2.toString().trim());
        }
    }
}
