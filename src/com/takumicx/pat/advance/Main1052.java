package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1052 {
	
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int totalNum=Reader.nextInt();
		
		int startPos=Reader.nextInt();
		
		Node[] nodes=new Node[100001];
		
		for(int i=0;i<totalNum;i++){
			
			Node node = new Node();
			
			node.pos=Reader.nextInt();
			
			node.key=Reader.nextInt();
			
			node.next=Reader.nextInt();
			
			nodes[node.pos]=node;
			
		}
		
		List<Node> list = new ArrayList<Node>();
		
		while(startPos!=-1){
			
			Node node = nodes[startPos];
			
			list.add(node);
			
			startPos=node.next;
			
		}
		
		if(list.size()==0){
			
			System.out.println("0 -1");
			
			return;
			
		}
		
		
		Collections.sort(list,new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.key-o2.key;
			}
		});
		
		System.out.format("%d %05d", list.size(),list.get(0).pos);
		
		System.out.println();
		
		for(int i=0;i<list.size();i++){
			
			Node node = list.get(i);
			
			if(i<list.size()-1){
				
				Node nextNode=list.get(i+1);
				
				System.out.format("%05d %d %05d",node.pos,node.key,nextNode.pos);
				
				System.out.println();
				
			}else {
				
				System.out.format("%05d %d %d",node.pos,node.key,-1);
			}
			
		}
		
		
	}
	
	
	static class Node{
		
		int pos;
		
		int key;
		
		int next;
		
	}

}
