package com.takumicx.华为;

import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main022 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            Integer num = Integer.valueOf(scanner.nextLine());
            int count=0;
            while (num>=3){
                count+=num/3;
                num=num/3+num%3;
            }
            if(num==2)count++;
            System.out.println(count);
        }
    }
}
