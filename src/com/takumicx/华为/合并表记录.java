package com.takumicx.华为;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-06
 * @email: takumicx@zju.edu.cn
 **/
public class 合并表记录 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            Node[] nodes = new Node[1000];
            int n=scanner.nextInt();
            for(int i=0;i<n;i++){
                int index=scanner.nextInt();
                int value=scanner.nextInt();
                if(nodes[index]==null){
                    Node node = new Node();
                    node.index=index;
                    node.value=value;
                    nodes[index]=node;
                }else {
                    nodes[index].value+=value;
                }
            }
            ArrayList<Node> list = new ArrayList<>();
            for(int i=0;i<1000;i++){
                if(nodes[i]!=null){
                    list.add(nodes[i]);
                }
            }

            Collections.sort(list, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o1.index-o2.index;
                }
            });
            for(Node node:list){
                System.out.println(node.index+" "+node.value);
            }
        }


    }

    private static class Node{
        int index;
        int value;
    }
}
