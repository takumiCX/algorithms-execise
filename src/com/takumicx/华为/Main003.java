package com.takumicx.华为;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/
public class Main003 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int total = scanner.nextInt();
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for(int i=0;i<total;i++){
                set.add(scanner.nextInt());
            }
            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }

        }
    }
}
