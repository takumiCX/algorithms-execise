package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-09
 * @email: takumicx@zju.edu.cn
 **/
public class 按字节截取字符串 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String[] split = scanner.nextLine().split("\\s+");
            String s = split[0];
            Integer n = Integer.valueOf(split[1]);
            int[] arr = new int[s.length()];
            int sum=0;
            for(int i=0;i<s.length();i++){
                if(Integer.valueOf(s.charAt(i))>127){
                    sum+=2;
                }else {
                    sum+=1;
                }
                arr[i]=sum;
            }
            for(int i=0;i<s.length();i++){
                if(arr[i]>n){
                    s=s.substring(0,i);
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
