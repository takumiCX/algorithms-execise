package com.takumicx.recursion;

/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/
public class Fibo {


    static int[] cache = new int[1000];

    public static void main(String[] args) {

        int k=45;
        long start=System.currentTimeMillis();
        int fabo = fabo(k);
        long end=System.currentTimeMillis();
        System.out.println("fabo:"+fabo+" time:"+(end-start));

        start=System.currentTimeMillis();
        int fabo2=faboWithCache(k);
        end=System.currentTimeMillis();
        System.out.println("faboWithCache:"+fabo2+" time:"+(end-start));

    }

    private static int fabo(int n) {
        if (n == 1 || n == 2) return 1;
        return fabo(n - 1) + fabo(n - 2);
    }


    //1,1,2,3,5,8
    public static int faboWithCache(int n) {
        if (n == 1 || n == 2) return 1;
        int a = 0;
        int b = 0;
        if (cache[n - 1] == 0) {
            a = faboWithCache(n - 1);
            cache[n - 1] = a;
        } else {
            a = cache[n - 1];
        }
        if (cache[n - 2] == 0) {
            b = faboWithCache(n - 2);
            cache[n - 2] = b;
        } else {
            b = cache[n - 2];
        }
        return a + b;
    }
}
