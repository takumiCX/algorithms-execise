package com.takumicx.pat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SameBST {
	
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		while(true){
			
			int nodeNum = Reader.nextInt();
			
			if(nodeNum==0) break;
			
			int testNum = Reader.nextInt();
			
			List<Node> list = new ArrayList<Node>();
			
			for(int i=0;i<=testNum;i++){
				
				Node root=buildTree(nodeNum);
				
				list.add(root);
				
			}
			
			if(list.size()>1){
				
				for(int i=1;i<list.size();i++){
					
					boolean isSame = check(list.get(0),list.get(i));
					
					if(isSame){
						System.out.println("Yes");
					}else{
						System.out.println("No");
					}
					
				}
			}
			
			
		}
		
	}
	
	private static boolean check(Node node, Node node2) {
		// TODO Auto-generated method stub
		
		if(node==null&&node2==null) return true;
		
		if((node==null&&node2!=null)||(node2==null&&node!=null)){
			return false;
		}
		
		if(node.data!=node2.data) return false;
		
		return check(node.left,node2.left)&&check(node.right, node2.right);
		
	}

	private static Node buildTree(int nodeNum) throws Exception {
		
		Node root=null;
		// TODO Auto-generated method stub
		for(int i=0;i<nodeNum;i++){
			
			int data = Reader.nextInt();
			
			root=insert(root,data);
			
		}
		
		return root;
	}

	private static Node insert(Node root, int data) {
		
		if(root==null){
			
			Node node = new Node();
			
			node.data=data;
			
			return node;
			
		}
		if(data<root.data){
			
			root.left=insert(root.left, data);
			
		}else if(data>root.data){
			
			root.right=insert(root.right, data);
			
		}
		return root;
	}

	static class Node{
		
		int data;
		
		Node left;
		
		Node right;
		
	}

}
