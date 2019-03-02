package com.takumicx.pat.advance;

import java.util.Scanner;


public class Main1086 {
	
	
	static class Node{
		
		int data;
		
		Node left;
		
		Node right;
	}
	
	static Scanner scanner = new Scanner(System.in);
	
	static int num=0;
	
	
	static int count=0;
	
	static StringBuilder res=new StringBuilder();
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		 num = Integer.valueOf(scanner.nextLine().trim());
		 
		 count=num*2;
		 
		 Node root=null;
		
		 root=buildTree();
		 
		 postOrder(root);
		 
		 System.out.println(res.toString().trim());
		
		
	}

	private static void postOrder(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null) return;
		
		postOrder(root.left);
		
		postOrder(root.right);
		
		res.append(root.data).append(" ");
		
	}

	private static Node buildTree() {
		// TODO Auto-generated method stub
		
		if(count-->0){
			
			String s = scanner.nextLine().trim();
			
			if(s.startsWith("Push")){
				
				Node node = new Node();
				
				node.data=Integer.valueOf(s.split(" ")[1]);
				
				node.left=buildTree();
				
				node.right=buildTree();
				
				return node;
				
				
			}else{
				
				return null;
				
			}
			
		}
		return null;
		
	}


		

}
