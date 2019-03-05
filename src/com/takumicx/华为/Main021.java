package com.takumicx.华为;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main021 {


    static Map<String,Integer> map=new HashMap<>();


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isDigit(c)){
                    System.out.print(c);
                }else if(Character.isAlphabetic(c)){
                    if(Character.isUpperCase(c)){
                        char c1 = Character.toLowerCase(c);
                        if(c1=='z'){
                            c1='a';
                        }else{
                            c1+=1;
                        }
                        System.out.print(c1+"");
                    }else {
                        String s1 = c + "";
                        if("abc".contains(s1)){
                            System.out.print(2);
                        }else if("def".contains(s1)){
                            System.out.print(3);
                        }else if("ghi".contains(s1)){
                            System.out.print(4);
                        }else if("jkl".contains(s1)){
                            System.out.print(5);
                        }else if("mno".contains(s1)){
                            System.out.print(6);
                        }else if("pqrs".contains(s1)){
                            System.out.print(7);
                        }else if("tuv".contains(s1)){
                            System.out.print(8);
                        }else if("wxyz".contains(s1)){
                            System.out.print(9);
                        }
                    }
                }
            }
        }


    }
}
