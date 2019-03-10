package com.takumicx.华为;

import java.util.*;

/**
 * @author: takumiCX
 * @create: 2019-03-03
 * @email: takumicx@zju.edu.cn
 **/
public class Main026 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            char[] chars = new char[1000];
            String s = scanner.nextLine();
            List<Character> list=new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if(!Character.isAlphabetic(s.charAt(i))){
                    chars[i]=s.charAt(i);
                }else {
                    list.add(s.charAt(i));
                }

            }
            Collections.sort(list, new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return Character.toLowerCase(o1)-Character.toLowerCase(o2);
                }
            });
            Iterator<Character> iterator = list.iterator();
            for(int i=0;i<s.length();i++){
                if(chars[i]!=0){
                    System.out.print(chars[i]);
                }else {
                    System.out.print(iterator.next());
                }
            }
            System.out.println();
        }

    }
}
