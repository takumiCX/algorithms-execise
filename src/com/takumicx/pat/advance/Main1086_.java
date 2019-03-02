package com.takumicx.pat.advance;

public class Main1086_ {

	static class Node {
		int data;
		Node left;
		Node right;
	}

	static int num = 0;

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {

		MyReader.init();
		int total = MyReader.nextInt();
		num = total * 2;
		Node root = null;

		root = buildTree(root);
		postOrder(root);
		System.out.println(sb.toString().trim());

	}

	private static void postOrder(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		sb.append(root.data).append(" ");

	}

	private static Node buildTree(Node root) throws Exception {
		// TODO Auto-generated method stub

		if (num-- > 0) {
			String s = MyReader.next();
			if (s.startsWith("Pop")) {
				root = null;
			} else {
				int m = MyReader.nextInt();
				Node node = new Node();
				node.data = m;
				node.left = buildTree(node.left);
				node.right = buildTree(node.right);
				root = node;
			}
		}
		return root;

	}
}
