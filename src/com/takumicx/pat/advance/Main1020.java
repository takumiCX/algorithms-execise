package com.takumicx.pat.advance;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class Main1020 {
	
	
	static int[] postArr=new int[31];
	
	static int[] inArr=new int[31];
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int total = Reader.nextInt();
		
		
		for(int i=0;i<total;i++){
		
			postArr[i]=Reader.nextInt();
			
		}
		
		for(int i=0;i<total;i++){
			
			inArr[i]=Reader.nextInt();
		}
		
		Node root=buildTree(0,total-1,0,total-1);
		
		Queue<Node> queue = new ArrayBlockingQueue<Node>(31);
		
		queue.offer(root);
		
		while(!queue.isEmpty()){
			
			Node node = queue.poll();
			
			total--;
			
			System.out.print(node.data);
			if(total!=0){
				System.out.print(" ");
			}
			
			if(node.left!=null){
				
				queue.offer(node.left);
			}
			if(node.right!=null){
				
				queue.offer(node.right);
			}
			
		}
		
	}
	
	private static Node buildTree(int postLeft, int postRight, int inLeft, int inRight) {
		
		if(postLeft>postRight){
			
			return null;
			
		}
		
		int root=postArr[postRight];
		
		int k = 0;
		
		for(int i=inLeft;i<=inRight;i++){
			
			if(inArr[i]==root){
				k=i;
				break;
			}
			
		}
		
		Node node = new Node();
		
		node.data=inArr[k];
		
		node.left=buildTree(postLeft, postLeft+k-inLeft-1, inLeft, k-1);
		
		node.right=buildTree(postLeft+k-inLeft, postRight-1, k+1, inRight);
		
		return node;
		
		
	}

	static class Node{
		
		int data;
		
		Node left;
		
		Node right;
		
		
	}


}

