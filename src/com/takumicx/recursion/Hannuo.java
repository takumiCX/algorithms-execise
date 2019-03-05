package com.takumicx.recursion;

/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/
public class Hannuo {

    public static void main(String[] args) {

        hannuo(100,"A","B","C");

    }


    //汉诺塔
    public static void hannuo(int n,String a,String b,String c){

        if(n==1){
            System.out.println(a+"=>"+c);
        }else{
            hannuo(n-1,a,c,b);
            System.out.println(a+"=>"+c);
            hannuo(n-1,b,a,c);
        }

    }


}
