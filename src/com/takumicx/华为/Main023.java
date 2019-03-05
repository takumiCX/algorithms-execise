package com.takumicx.华为;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main023 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int[] arr = new int[128];
            String s = scanner.nextLine();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                arr[c] += 1;
            }

            ArrayList<Node> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    Node node = new Node();
                    node.c = (char) i;
                    node.count = arr[i];
                    list.add(node);
                }
            }

            Collections.sort(list, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o1.count - o2.count;
                }
            });

            int min = Integer.MAX_VALUE;
            for (Node node : list) {
                if(node.count<=min){
                    min=node.count;
                    s=s.replace(node.c+"","");
                }
            }
            System.out.println(s);
        }

    }

    private static class Node {
        char c;
        int count;
    }
}
