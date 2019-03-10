package com.takumicx.华为;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 字符串合并处理 {

    static Map<Character,Integer> map=new HashMap<>();


    public static void main(String[] args) {
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine()+ scanner.nextLine();
            char[] chars = s.toCharArray();
            for(int i=0;i<chars.length;i+=2){
                for(int j=i+2;j<chars.length;j+=2){
                    if(chars[i]>chars[j]){
                        char c=chars[i];
                        chars[i]=chars[j];
                        chars[j]=c;
                    }
                }
            }
            for(int i=1;i<chars.length;i+=2){
                for(int j=i+2;j<chars.length;j+=2){
                    if(chars[i]>chars[j]){
                        char c=chars[i];
                        chars[i]=chars[j];
                        chars[j]=c;
                    }
                }
            }

            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isDigit(c)){
                    Integer.valueOf(new StringBuilder(Integer.toBinaryString(2)).reverse().toString(), 2);
                }

            }


        }
    }
}
