package com.takumicx.华为;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: takumiCX
 * @create: 2019-03-06
 * @email: takumicx@zju.edu.cn
 **/
public class 字符串加密 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if (Character.isAlphabetic(c)) {
                    if (Character.isUpperCase(c)) {
                        if (c == 'Z') {
                            sb.append('a');
                        } else {
                            sb.append(Character.toLowerCase((char) (c + 1)));
                        }

                    } else if (Character.isLowerCase(c)) {
                        if (c == 'z') {
                            sb.append('A');
                        } else {
                            sb.append(Character.toUpperCase((char) (c + 1)));
                        }

                    }

                } else if (Character.isDigit(c)) {
                    if (c == '9') {
                        sb.append('0');
                    } else {
                        sb.append((char) (c + 1));
                    }
                }
            }
            //解秘
            StringBuilder sb2 = new StringBuilder();
            for(int i=0;i<s2.length();i++){
                char c = s2.charAt(i);
                if(Character.isAlphabetic(c)){
                    if(Character.isUpperCase(c)){
                        if(c=='A'){
                            sb2.append('z');
                        }else {
                            sb2.append(Character.toLowerCase((char)(c-1)));
                        }

                    }else {
                        if(c=='a'){
                            sb2.append('Z');
                        }else {
                            sb2.append(Character.toUpperCase((char)(c-1)));
                        }

                    }

                }else if(Character.isDigit(c)){

                    if(c=='0'){
                        sb2.append('9');
                    }else {
                        sb2.append((char)(c-1));
                    }
                }
            }
            System.out.println(sb.toString());
            System.out.println(sb2.toString());

        }
    }
}
