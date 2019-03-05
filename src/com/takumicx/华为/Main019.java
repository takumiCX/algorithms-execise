package com.takumicx.华为;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main019 {

    static Map<String,Integer> map=new LinkedHashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String[] split = scanner.nextLine().split("\\s+");
            String name = split[0].substring(split[0].lastIndexOf("\\")+1);
            Integer lineNum=Integer.valueOf(split[1]);
            String key=name+":"+lineNum;
            Integer num = map.get(key);
            if(num==null){
                map.put(key,1);
            }else {
                map.put(key,num+1);
            }
            if(map.size()>=8)break;
        }

        for(String key:map.keySet()){
            String[] split = key.split(":");
            String name = split[0];
            String lineNum = split[1];
            if(name.length()>16){
                name=name.substring(name.length()-16);
            }
            System.out.println(name+" "+lineNum+" "+map.get(key));
        }
    }
}
