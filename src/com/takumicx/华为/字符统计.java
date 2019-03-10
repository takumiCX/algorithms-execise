package com.takumicx.华为;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-09
 * @email: takumicx@zju.edu.cn
 **/
public class 字符统计 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            int[] arr = new int[128];
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isAlphabetic(c)||Character.isDigit(c)||c==' '){
                    arr[c]+=1;
                }
            }
            ArrayList<Node> list = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    Node node = new Node();
                    node.c=(char)i;
                    node.count=arr[i];
                    list.add(node);
                }
            }
            Collections.sort(list, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    if(o1.count==o2.count) return o1.c-o2.c;
                    return o2.count-o1.count;
                }
            });

            for(Node node:list){
                System.out.print(node.c);
            }

            System.out.println();

        }
    }

    private static class Node{
        char c;
        int count;
    }
}
