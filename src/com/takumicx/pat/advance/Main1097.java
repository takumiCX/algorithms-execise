package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1097 {
	
	static class Node{
		int pos;
		int data;
		int next;
	}
	
	static Node[] nodes=new Node[100000];
	
	static boolean[] visited=new boolean[10001];
	
	public static <E> void main(String[] args) throws Exception {
		
		MyReader.init();
		int first = MyReader.nextInt();
		int total=MyReader.nextInt();
		for(int i=0;i<total;i++){
			int pos= MyReader.nextInt();
			int data=MyReader.nextInt();
			int nextPos=MyReader.nextInt();
			Node node = new Node();
			node.data=data;
			node.next=nextPos;
			node.pos=pos;
			nodes[pos]=node;
		}
		
		int pos=first;
		List<Node> list1 = new ArrayList<Node>();
		List<Node> list2 = new ArrayList<Node>();
		while(pos!=-1){
			Node node = nodes[pos];
			int data = Math.abs(node.data);
			if(!visited[data]){
				visited[data]=true;
				list1.add(node);
			}else{
				list2.add(node);
			}
			pos=node.next;
		}
		if(list1.size()>0){
			for(int i=0;i<list1.size()-1;i++){
				Node node = list1.get(i);
				Node nextNode = list1.get(i+1);
				System.out.format("%05d %d %05d",node.pos,node.data,nextNode.pos);
				System.out.println();
			}
			Node node = list1.get(list1.size()-1);
			System.out.format("%05d %d -1",node.pos,node.data);
			System.out.println();
		}
		if(list2.size()>0){
			for(int i=0;i<list2.size()-1;i++){
				Node node = list2.get(i);
				Node nextNode = list2.get(i+1);
				System.out.format("%05d %d %05d",node.pos,node.data,nextNode.pos);
				System.out.println();
			}
			Node node = list2.get(list2.size()-1);
			System.out.format("%05d %d -1",node.pos,node.data);
			System.out.println();
		}
		
	}

}
