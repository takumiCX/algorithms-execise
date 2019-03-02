package com.takumicx.pat.advance;




public class Main1032 {
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int firstPos = Reader.nextInt();
		
		int secondPos=Reader.nextInt();
		
		int totalNum=Reader.nextInt();
		
		Node[] nodes=new Node[100000];
		
		for(int i=0;i<totalNum;i++){
			
			Node node = new Node();
			
			node.pos=Reader.nextInt();
			
			node.data=Reader.next();
			
			node.next=Reader.nextInt();
			
			nodes[node.pos]=node;
			
		}
		
		while(firstPos!=-1){
			
			nodes[firstPos].flag1=true;
			
			firstPos=nodes[firstPos].next;
			
		}
		
		while(secondPos!=-1){
			
			Node node = nodes[secondPos];
			
			if(node.flag1){
				
				System.out.format("%d", node.pos);
				
				break;
				
			}
			
			secondPos=node.next;
		}
		
		if(secondPos==-1){
			System.out.println(-1);
		}
		
		
		
	}
	
	
	static class Node{
		
		int pos;
		
		int next;
		
		String data;
		
		boolean flag1;
		
		boolean flag2;
		
	}

}
