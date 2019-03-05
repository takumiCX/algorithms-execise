package com.takumicx.华为;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<num;i++){
            list.add(scanner.next());
        }

        Collections.sort(list);

        for(String s:list){
            System.out.println(s);
        }

    }
}
