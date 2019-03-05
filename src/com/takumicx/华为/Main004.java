package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/
public class Main004 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            if(s.length()%8!=0){
                s+="0000000";
            }
            while (s.length()>=8){
                System.out.println(s.substring(0,8));
                s=s.substring(8);
            }

        }

    }

}
