package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 统计字符个数 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            int alpNum=0;
            int spaceNum=0;
            int digitNUm=0;
            int otherNum=0;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isAlphabetic(c)){
                    alpNum++;
                }else if(Character.isDigit(c)){
                    digitNUm++;
                }else if(c==' '){
                    spaceNum++;
                }else {
                    otherNum++;
                }
            }
            System.out.println(alpNum);
            System.out.println(spaceNum);
            System.out.println(digitNUm);
            System.out.println(otherNum);
        }

    }
}
