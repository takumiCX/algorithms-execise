package com.takumicx.华为;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 漂亮度 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            scanner.nextLine();
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                int[] arr = new int[26];
                String s = scanner.nextLine();
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (Character.isUpperCase(c)) {
                        c = Character.toLowerCase(c);
                    }
                    arr[c - 'a'] += 1;
                }
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = 0; j < 26; j++) {
                    if (arr[j] != 0) {
                        list.add(arr[j]);
                    }
                }
                Collections.sort(list, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                });
                int sum = 0;
                for (int j = 0; j < list.size(); j++) {
                    sum += (26 - j)*list.get(j);
                }
                list2.add(sum);
            }
            for(Integer i:list2){
                System.out.println(i);
            }
        }


    }

}
