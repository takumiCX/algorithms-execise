package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;


public class Main1035 {
	
	static class Node{
		String name;
		String pwd;
	}
	
	public static void main(String[] args) throws Exception {
		
		List<Node> list = new ArrayList<Node>();
		Reader.init(System.in);
		int total = Reader.nextInt();
		for(int i=0;i<total;i++){
			String name = Reader.next();
			String rawPwd = Reader.next();
			boolean flag=true;
			char[] array = rawPwd.toCharArray();
			for(int j=0;j<array.length;j++){
				if(array[j]=='1'){
					flag=false;
					array[j]='@';
				}
				if(array[j]=='l'){
					flag=false;
					array[j]='L';
				}
				if(array[j]=='0'){
					flag=false;
					array[j]='%';
				}
				if(array[j]=='O'){
					flag=false;
					array[j]='o';
				}
			}
			if(!flag){
				Node node = new Node();
				node.name=name;
				node.pwd=new String(array);
				list.add(node);
			}
		}
		if(list.size()==0){
			if(total>1){
				System.out.format("There are %d accounts and no account is modified",total);
			}else{
				System.out.println("There is 1 account and no account is modified");
			}
		}else{
			System.out.println(list.size());
			for(Node node:list){
				System.out.println(node.name+" "+node.pwd);
			}
		}
		
	}

}
