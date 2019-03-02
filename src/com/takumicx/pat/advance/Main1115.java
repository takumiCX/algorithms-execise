package com.takumicx.pat.advance;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1115 {

	static class Node {

		int data;

		int level;

		Node left;

		Node right;

	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		Node root = null;

		for (int i = 0; i < total; i++) {

			int n = Reader.nextInt();

			root = insert(root, n);

		}
		
		if(total==1){
			System.out.println("1 + 0 = 1");
			return;
		}

		Queue<Node> queue = new LinkedBlockingQueue<Node>();

		root.level = 1;

		queue.add(root);

		int[] levels = new int[1001];

		while (!queue.isEmpty()) {

			Node node = queue.poll();

			levels[node.level] += 1;

			if (node.left != null) {
				node.left.level = node.level + 1;
				queue.add(node.left);
			}
			if (node.right != null) {
				node.right.level = node.level + 1;
				queue.add(node.right);
			}

		}

		int n1 = 0;

		int n2 = 0;

		int i = levels.length - 1;

		while (levels[i] == 0) {
			i--;
		}

		n1 = levels[i--];

		while (levels[i] == 0) {
			i--;
		}

		n2 = levels[i];

		System.out.format("%d + %d = %d", n1, n2, n1 + n2);

	}

	private static Node insert(Node root, int n) {
		// TODO Auto-generated method stub
		if (root == null) {
			Node node = new Node();
			node.data = n;
			return node;
		}

		if (n <= root.data) {

			root.left = insert(root.left, n);

		} else {

			root.right = insert(root.right, n);
		}

		return root;

	}

}
