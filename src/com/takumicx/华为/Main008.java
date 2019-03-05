package com.takumicx.华为;

import java.util.*;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main008 {


    static int[] nodes=new int[1000];
    static boolean[] flags=new boolean[1000];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0;i<num;i++){
            int index= scanner.nextInt();
            int value = scanner.nextInt();
            flags[index]=true;
            nodes[index]+=value;
        }

        List<Node> list = new ArrayList<>();
        for(int i=0;i<1000;i++){
            if(flags[i]){
                list.add(new Node(i, Main008.nodes[i]));
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
    private static class Node{
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
