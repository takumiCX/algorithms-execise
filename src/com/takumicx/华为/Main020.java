package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main020 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (fun1(s) && fun2(s) && fun3(s)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    private static boolean fun3(String s) {

        for(int i=0;i<s.length()-3;i++){
            if(s.substring(i+3).contains(s.substring(i,i+3))){
                return false;
            }
        }
        return true;
    }

    private static boolean fun2(String s) {
        boolean[] flag = new boolean[4];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                flag[0] = true;
            } else if (Character.isAlphabetic(c) && Character.isUpperCase(c)) {
                flag[1] = true;

            } else if (Character.isAlphabetic(c) && Character.isLowerCase(c)) {
                flag[2] = true;

            } else {
                flag[3] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) count++;
        }
        if (count >= 3) return true;
        return false;
    }

    private static boolean fun1(String s) {
        return s.length() > 8;
    }
}
