package com.takumicx.pat.advance;


public class Main1066 {
	
	static class Node{
		
		int data;
		
		Node left;
		
		Node right;
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		
		Reader.init(System.in);
		
		int total = Reader.nextInt();
		
		Node root=null;
		
		for(int i=0;i<total;i++){
			
			root=insert(root,Reader.nextInt());
			
		}
		
		System.out.println(root.data);
		
		
	}


	private static Node insert(Node root, int data) {
		// TODO Auto-generated method stub
		if(root==null){
			
			Node node = new Node();
			
			node.data=data;
			
			return node;
			
		}
		
		if(data<root.data){
			
			root.left=insert(root.left, data);
			
		}else{
			
			root.right=insert(root.right, data);
			
		}
		
		int leftHeight=getHeight(root.left);
		
		int rightHeight=getHeight(root.right);
		
		if(leftHeight-rightHeight>1){
			
			if(getHeight(root.left.left)>getHeight(root.left.right)){
				
				//LL
				
				root=r(root);
				
			}else{
				
				//LR
				root=lr(root);
			}
			
			
		}else if(rightHeight-leftHeight>1){
			
			if(getHeight(root.right.left)>getHeight(root.right.right)){
				
				//rl
				root=rl(root);
				
			}else{
				
				//rr
				root=l(root);
				
			}
			
		}
		
		return root;
	}


	private static Node rl(Node root) {
		// TODO Auto-generated method stub
		root.right=r(root.right);
		
		root=l(root);
		
		return root;
	}
	
	
	private static Node lr(Node root) {
		// TODO Auto-generated method stub
		
		root.left=l(root.left);
		
		root=r(root);
		
		return root;
		
	}



	private static Node l(Node root) {
		// TODO Auto-generated method stub
		Node node=root.right;
		
		root.right=node.left;
		
		node.left=root;
		
		return node;
	}
	

	private static Node r(Node root) {
		// TODO Auto-generated method stub
		
		Node node=root.left;
		
		root.left=node.right;
		
		node.right=root;
		
		return node;
	}


	private static int getHeight(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null) return 0;
		
		return Math.max(getHeight(root.left),getHeight(root.right))+1;
		
	}

}
