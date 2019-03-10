package com.takumicx.华为;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-09
 * @email: takumicx@zju.edu.cn
 **/
public class 排序 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            Integer[] arr = new Integer[num];
            for(int i=0;i<num;i++){
                arr[i]=scanner.nextInt();
            }
            int m = scanner.nextInt();
            if(m==0){
                Arrays.sort(arr);
            }else {
                Arrays.sort(arr, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                });
            }
            StringBuilder sb = new StringBuilder();
            for(Integer i:arr){
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
