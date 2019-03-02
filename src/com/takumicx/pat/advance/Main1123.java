package com.takumicx.pat.advance;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1123 {

	static class Node {

		int data;

		Node left;

		Node right;

		int index;
	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		Node root = null;

		for (int i = 0; i < total; i++) {

			root = insert(root, Reader.nextInt());

		}

		Queue<Node> queue = new LinkedBlockingQueue<Node>();

		root.index = 1;

		queue.add(root);

		StringBuilder sb = new StringBuilder();

		int[] nodes = new int[1000];

		while (!queue.isEmpty()) {

			Node node = queue.poll();

			nodes[node.index] = 1;

			sb.append(node.data).append(" ");

			if (node.left != null) {
				node.left.index = node.index * 2;
				queue.add(node.left);
			}

			if (node.right != null) {

				node.right.index = node.index * 2 + 1;

				queue.add(node.right);
			}

			// System.out.println(node.data);
			//
			// if (node.left != null) {
			// queue.add(node.left);
			// }
			// if (node.right != null) {
			// queue.add(node.right);
			// }

		}

		System.out.println(sb.toString().trim());

		boolean flag = true;

		for (int i = 1; i <= total; i++) {
			if (nodes[i] != 1) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	private static Node insert(Node root, int data) {
		// TODO Auto-generated method stub
		if (root == null) {
			Node node = new Node();
			node.data = data;
			return node;
		}
		if (data < root.data) {

			root.left = insert(root.left, data);

		} else {
			root.right = insert(root.right, data);
		}

		int leftHeight = getHeight(root.left);

		int rightHeight = getHeight(root.right);

		if (leftHeight - rightHeight > 1) {

			if (getHeight(root.left.left) > getHeight(root.left.right)) {
				// ll

				root = r(root);

			} else {

				root = lr(root);

				// lr

			}

		} else if (rightHeight - leftHeight > 1) {

			if (getHeight(root.right.left) > getHeight(root.right.right)) {
				// rl

				root = rl(root);

			} else {
				// rr
				root = l(root);

			}

		}
		return root;

	}

	private static Node rl(Node root) {
		// TODO Auto-generated method stub
		root.right = r(root.right);

		root = l(root);

		return root;
	}

	private static Node lr(Node root) {
		// TODO Auto-generated method stub

		root.left = l(root.left);

		root = r(root);

		return root;
	}

	private static Node l(Node root) {
		// TODO Auto-generated method stub
		Node temp = root.right;

		root.right = temp.left;

		temp.left = root;

		return temp;
	}

	private static Node r(Node root) {
		// TODO Auto-generated method stub
		Node temp = root.left;

		root.left = temp.right;

		temp.right = root;

		return temp;
	}

	private static int getHeight(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return 0;

		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

}
