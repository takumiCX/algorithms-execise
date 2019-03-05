package com.takumicx.华为;

import java.util.*;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main028 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int num = scanner.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<num;i++){
                list.add(scanner.next());
            }
            String s = scanner.next();
            int index = scanner.nextInt();
            List<String> list1=getBrothers(list,s);
            ArrayList<Node> nodes = new ArrayList<>();
            for(int i=0;i<list1.size();i++){
                Node node = new Node();
                node.index=i;
                node.value=list1.get(i);
                nodes.add(node);
            }
            Collections.sort(nodes, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o1.value.compareTo(o2.value);
                }
            });
            int index1 = nodes.get(index-1).index;
            System.out.println(list1.size());
            if(index<=list1.size()){
                System.out.println(list1.get(index1));
            }

        }

    }

    private static List<String> getBrothers(ArrayList<String> list, String s) {

        ArrayList<String> strings = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            String s1 = list.get(i);
            if(s1.length()!=s.length()){
            }else if(s.equals(s1)){
            }else{

                boolean flag=fun(s1,s);
                if(flag)strings.add(s1);
            }
        }
        return strings;
    }

    private static boolean fun(String s1, String s) {
        char[] chars = s1.toCharArray();
        char[] chars1 = s.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.toString(chars).equals(Arrays.toString(chars1));
    }

    private static class Node{
        int index;
        String value;
    }

}
