package com.takumicx.华为;

import java.util.*;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main025 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       while (scanner.hasNext()){

           String[] split1 = scanner.nextLine().split(" ");
           String[] split2 = scanner.nextLine().split(" ");
           ArrayList<String> iList = new ArrayList<>();
           HashSet<Integer> rSet = new HashSet<>();
           Integer iNum = Integer.valueOf(split1[0]);
           for (int i = 1; i <=iNum; i++) {
               iList.add(split1[i]);
           }
           Integer rNum = Integer.valueOf(split2[0]);
           for (int i = 1; i <= rNum; i++) {
               rSet.add(Integer.valueOf(split2[i]));
           }

           ArrayList<Integer> list = new ArrayList<>(rSet);
           Collections.sort(list);
           int total=0;
           LinkedHashMap<Integer, List<Node>> map = new LinkedHashMap<>();
           for (Integer i : list) {
               ArrayList<Node> list1 = new ArrayList<>();
               int count=0;
               for(int j=0;j<iList.size();j++){
                   if(iList.get(j).contains(i+"")){
                       count++;
                       Node node = new Node();
                       node.index=j;
                       node.value=Integer.valueOf(iList.get(j));
                       list1.add(node);
                   }
               }
               if(count!=0){
                   map.put(i,list1);
                   total+=2+count*2;
               }
           }

           System.out.print(total+" ");
           for(Map.Entry<Integer,List<Node>> entry:map.entrySet()){

               System.out.print(entry.getKey()+" "+entry.getValue().size()+" ");
               for(Node node:entry.getValue()){
                   System.out.print(node.index+" "+node.value+" ");
               }
           }
       }

    }

    private static class Node{
        int index;
        int value;
    }
}
