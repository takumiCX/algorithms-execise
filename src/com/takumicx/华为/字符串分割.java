package com.takumicx.华为;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-09
 * @email: takumicx@zju.edu.cn
 **/
public class 字符串分割 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s0="00000000";
        while (scanner.hasNext()){
            Integer m = Integer.valueOf(scanner.nextLine());
            ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<m;i++){
                String s = scanner.nextLine();
                while (s.length()>8){
                    list.add(s.substring(0,8));
                    s=s.substring(8);
                }
                if(s.length()<=8){
                    list.add(s+s0.substring(s.length()));
                }
            }
            for(String s:list){
                System.out.println(s);
            }
        }
    }
}
