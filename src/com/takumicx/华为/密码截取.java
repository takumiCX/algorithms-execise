package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 密码截取 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            int max=-Integer.MAX_VALUE;
            for(int i=0;i<s.length();i++){
                for(int j=i+1;j<s.length();j++){
                    if(isHuiWen(s,i,j)){
                        if(j-i+1>max){
                            max=j-i+1;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }

    private static boolean isHuiWen(String s, int i, int j) {
        while (i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
