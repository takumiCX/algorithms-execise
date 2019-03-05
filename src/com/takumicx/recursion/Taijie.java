package com.takumicx.recursion;

/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/

/**
 * 一个台阶总共有10级,如果一次可以跳1级,也可以跳2级。总共有多少种跳法。
 */
public class Taijie {


    public static void main(String[] args) {

        int count = count(10);

        System.out.println(count);

    }


    public static int count(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return count(n-1)+count(n-2);
    }

}
