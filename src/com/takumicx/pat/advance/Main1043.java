package com.takumicx.pat.advance;



public class Main1043 {

	static int[] seq = new int[1001];

	static int[] preOrderSeq = new int[1001];

	static int preOrderIndex = 0;

	static int[] mirrorPreSeq = new int[1001];

	static int mirrorPreIndex = 0;
	
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int num = Reader.nextInt();

		Node tree = null;

		for (int i = 0; i < num; i++) {

			int n = Reader.nextInt();
			seq[i] = n;
			tree = insertTree(tree, n);
		}

		preOrder(tree);
		
		if(isEqual(seq,preOrderSeq,num)){
			
			System.out.println("YES");
			
			postOrder(tree);
			
			System.out.println(sb.toString().trim());
			
			
		}else {
			
			mirrorPreOrder(tree);
			
			if(isEqual(seq, mirrorPreSeq, num)){
				
				System.out.println("YES");
				
				sb=new StringBuilder();
				
				mirrorPostOrder(tree);
				
				System.out.println(sb.toString().trim());
				
			}else{
				
				System.out.println("NO");
				
			}
			
		}
		

	}

	private static void mirrorPostOrder(Node tree) {
		// TODO Auto-generated method stub
		
		if(tree==null) return;
		
		mirrorPostOrder(tree.right);
		
		mirrorPostOrder(tree.left);
		
		sb.append(tree.data).append(" ");
		
	}

	private static void mirrorPreOrder(Node tree) {
		// TODO Auto-generated method stub
		
		if(tree==null) return;
		
		mirrorPreSeq[mirrorPreIndex++]=tree.data;
		
		mirrorPreOrder(tree.right);
		
		mirrorPreOrder(tree.left);
		
	}

	private static void postOrder(Node tree) {
		// TODO Auto-generated method stub
		
		if(tree==null) return;
		
		postOrder(tree.left);
		
		postOrder(tree.right);
		
		sb.append(tree.data).append(" ");
		
	}

	private static boolean isEqual(int[] seq2, int[] preOrderSeq2, int num) {
		for(int i=0;i<num;i++){
			
			if(seq2[i]!=preOrderSeq2[i]){
				return false;
			}
			
		}
		return true;
	}

	private static void preOrder(Node tree) {
		// TODO Auto-generated method stub
		
		if(tree==null) return;
		
		preOrderSeq[preOrderIndex++]=tree.data;
		
		preOrder(tree.left);
		
		preOrder(tree.right);
		
		
	}

	private static Node insertTree(Node tree, int data) {
		// TODO Auto-generated method stub
		if (tree == null) {

			Node node = new Node();
			node.data = data;
			return node;
		}

		if (data < tree.data) {

			tree.left = insertTree(tree.left, data);

		} else {

			tree.right = insertTree(tree.right, data);
		}

		return tree;

	}

	static class Node {

		int data;

		Node left;

		Node right;

	}

}
