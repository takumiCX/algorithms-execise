package com.takumicx.pat.advance;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1102 {

	static class Node {

		int index;

		int left;

		int right;
	}

	static Node[] nodes;

	static StringBuilder levelSB = new StringBuilder();

	static StringBuilder inSB = new StringBuilder();

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		nodes = new Node[total];

		int[] roots = new int[total];

		for (int i = 0; i < total; i++) {

			Node node = new Node();

			String left = Reader.next();

			String right = Reader.next();

			if ("-".equals(left)) {

				node.left = -1;

			} else {

				int leftIndex = Integer.valueOf(left);

				node.left = leftIndex;

				roots[leftIndex] = 1;

			}

			if ("-".equals(right)) {

				node.right = -1;

			} else {

				int rightIndex = Integer.valueOf(right);

				node.right = rightIndex;

				roots[rightIndex] = 1;

			}
			node.index = i;
			nodes[i] = node;
		}

		int root = -1;

		for (int i = 0; i < total; i++) {
			if (roots[i] == 0) {
				root = i;
				break;
			}
		}

		invert(root);

		levelTraval(root);

		System.out.println(levelSB.toString().trim());

		inTraval(root);

		System.out.println(inSB.toString().trim());

	}

	private static void inTraval(int root) {
		// TODO Auto-generated method stub

		if (root == -1)
			return;

		Node node = nodes[root];

		inTraval(node.left);

		inSB.append(node.index).append(" ");

		inTraval(node.right);

	}

	private static void levelTraval(int root) throws Exception {
		// TODO Auto-generated method stub

		Node node = nodes[root];

		BlockingQueue<Node> queue = new LinkedBlockingQueue<Node>();

		queue.add(node);

		while (!queue.isEmpty()) {
			Node node2 = queue.take();
			levelSB.append(node2.index).append(" ");
			if (node2.left != -1) {
				queue.add(nodes[node2.left]);
			}
			if (node2.right != -1) {
				queue.add(nodes[node2.right]);
			}

		}

	}

	private static void invert(int root) {
		// TODO Auto-generated method stub
		if (root == -1)
			return;

		Node node = nodes[root];

		invert(node.left);

		invert(node.right);

		int temp = node.right;

		node.right = node.left;

		node.left = temp;

	}

}
