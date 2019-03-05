package com.takumicx.leetcode;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-05
 * @email: takumicx@zju.edu.cn
 **/
public class Main115 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int d=dp(s,t);
        System.out.println(d);


    }


    public int numDistinct(String s, String t) {
        int d=dp(s,t);
        return d;
    }


    private static int dp(String s, String t) {
        if(t.length()==0) return 1;
        if(s.length()<t.length()) return 0;
        if(s.charAt(s.length()-1)==t.charAt(t.length()-1)){
            return dp(s.substring(0,s.length()-1),t.substring(0,t.length()-1))+dp(s.substring(0,s.length()-1),t);
        }else {
            return dp(s.substring(0,s.length()-1),t);
        }
    }
}
