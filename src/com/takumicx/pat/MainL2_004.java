package com.takumicx.pat;

public class MainL2_004 {

	static String preOrderStr = "";

	static String postOrderStr = "";

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		Node root = null;

		String s = "";

		for (int i = 0; i < total; i++) {

			int n = Reader.nextInt();

			s += n;

			root = insertTree(root, n);

		}

		preOrder(root,false);

		if (s.equals(preOrderStr)) {

			postOrder(root,false);

			System.out.println("YES");

			System.out.println(postOrderStr);

		} else {
			
			preOrderStr="";
			
			postOrderStr="";

			preOrder(root,true);

			if (preOrderStr.equals(s)) {

				postOrder(root,true);

				System.out.println("YES");

				System.out.println(postOrderStr);
			}

		}

	}

	private static void postOrder(Node root, boolean isMirror) {
		// TODO Auto-generated method stub

		if (root == null)
			return;

		if (isMirror) {
			
			postOrder(root.right, isMirror);

			postOrder(root.left, isMirror);

			postOrderStr += root.data;

		} else {

			postOrder(root.left, isMirror);

			postOrder(root.right, isMirror);

			postOrderStr += root.data;

		}

	}

	private static void preOrder(Node root, boolean isMirror) {
		// TODO Auto-generated method stub

		if (root == null)
			return;

		preOrderStr += root.data;

		if (isMirror) {

			preOrder(root.right, isMirror);

			preOrder(root.left, isMirror);

		} else {

			preOrder(root.left, isMirror);

			preOrder(root.right, isMirror);

		}

	}

	private static Node insertTree(Node root, int n) {
		// TODO Auto-generated method stub

		if (root == null) {
			Node node = new Node();
			node.data = n;
			return node;
		}

		if (root.data <= n) {

			root.right = insertTree(root.right, n);

		} else {

			root.left = insertTree(root.left, n);

		}

		return root;

	}

	static class Node {

		int data;

		Node left;

		Node right;

	}

}
