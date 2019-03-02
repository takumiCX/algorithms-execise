package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Main1074 {
	
	
	static class Node{
		
		int pos;
		
		int data;
		
		int next;
		
	}
	
	static  Node[] nodes=new Node[100001];
	
	static int total=0;
	
	static int first=0;
	
	static int reverseNum=0;
	
	static Stack<Node> stack=new Stack<Node>();
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		first = Reader.nextInt();
		
		total=Reader.nextInt();
		
		reverseNum=Reader.nextInt();
		
		int count=0;
		
		List<Node> list = new ArrayList<Node>();
		
		for(int i=0;i<total;i++){
			
			Node node = new Node();
			
			int pos=Reader.nextInt();
			
			int data=Reader.nextInt();
			
			int next=Reader.nextInt();
			
			node.pos=pos;
			
			node.data=data;
			
			node.next=next;
			
			nodes[pos]=node;
			
		}
		
		while(first!=-1){
			
			
			Node node = nodes[first];
			
			first=node.next;
			
			stack.add(node);
			
			count++;
			
			if(count%reverseNum==0){
				
				while(!stack.isEmpty()){
					list.add(stack.pop());
				}
			}
			
		}
		
		if(!stack.isEmpty()){
			for(int i=0;i<stack.size();i++){
				list.add(stack.get(i));
			}
		}
		
		if(list.size()==1){
			
			Node node = list.get(0);
			
			System.out.format("%05d %d %d",node.pos,node.data,-1);
			
		}else{
			
			for(int i=0;i<list.size()-1;i++){
				
				Node node = list.get(i);
				
				Node nextNode = list.get(i+1);
				
				System.out.format("%05d %d %05d", node.pos,node.data,nextNode.pos);
				
				System.out.println();
				
			}
			
			Node node2 = list.get(list.size()-1);
			
			System.out.format("%05d %d %d",node2.pos,node2.data,-1);
		}
		
		
		
	}

}
