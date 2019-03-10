package com.takumicx.华为;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 字符串加密2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            char[] chars = new char[27];
            String key = scanner.nextLine();
            String s = scanner.nextLine();
            Set<Character> set = new LinkedHashSet<>();
            for(int i=0;i<key.length();i++){
                char c = key.charAt(i);
                if(Character.isLowerCase(c)){
                    c=Character.toUpperCase(c);
                }
                set.add(Character.valueOf(c));
            }
            int index=0;
            for(Character c:set){
                chars[index++]=c.charValue();
            }
            for(char c='A';c<'A'+26;c++){
                if(!set.contains(Character.valueOf(c))){
                    chars[index++]=c;
                }
            }

            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isLowerCase(c)){
                    System.out.print(Character.toLowerCase(chars[c-'a']));
                }else {
                    System.out.print(chars[c-'A']);
                }
            }
            System.out.println();
        }
    }
}
