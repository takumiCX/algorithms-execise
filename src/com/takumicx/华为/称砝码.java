package com.takumicx.华为;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: takumiCX
 * @create: 2019-03-08
 * @email: takumicx@zju.edu.cn
 **/
public class 称砝码 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            int[] weight = new int[num];
            int[] count = new int[num];
            for(int i=0;i<num;i++){
                weight[i]=scanner.nextInt();
            }
            for(int i=0;i<num;i++){
                count[i]=scanner.nextInt();
            }
            Set<Integer> set=fun(weight,count,0);
            System.out.println(set.size());

        }
    }

    private static Set<Integer> fun(int[] weight, int[] count, int i) {
        if(i==weight.length-1){
            HashSet<Integer> set = new HashSet<>();
            int sum=0;
            for(int j=0;j<count[i];j++){
                sum+=weight[i];
                set.add(sum);
            }
            return set;
        }
        Set<Integer> set = fun(weight, count, i + 1);
        int sum=0;
        HashSet<Integer> set1 = new HashSet<>(set);
        for(int j=0;j<count[i];j++){
            sum+=weight[i];
            set1.add(sum);
            for(Integer w:set){
                set1.add(sum+w);
            }
        }
        return set1;
    }

}
