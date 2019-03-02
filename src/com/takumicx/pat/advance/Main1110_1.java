package com.takumicx.pat.advance;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1110_1 {

	static class Node {

		int index;

		int left;

		int right;

	}

	static Node[] nodes;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		nodes = new Node[total];

		int[] roots = new int[total];

		for (int i = 0; i < total; i++) {

			Node node = new Node();

			node.index = i;

			String a = Reader.next();

			String b = Reader.next();

			if (a.equals("-")) {

				node.left = -1;

			} else {

				int left = Integer.valueOf(a);
				node.left = left;

				roots[left] = -1;

			}

			if (b.equals("-")) {

				node.right = -1;

			} else {

				int right = Integer.valueOf(b);
				node.right = right;
				roots[right] = -1;

			}

			nodes[i] = node;

		}

		int root = -1;

		for (int i = 0; i < total; i++) {
			if (roots[i] != -1) {
				root = i;
				break;
			}
		}

		BlockingQueue<Node> queue = new LinkedBlockingQueue<Node>();

		queue.add(nodes[root]);

		boolean mustBeLeaf = false;

		boolean isComplete = true;

		Node node = null;

		while (!queue.isEmpty()) {

			node = queue.take();

			if (mustBeLeaf) {
				if (node.left != -1 || node.right != -1) {
					isComplete = false;
					break;
				}
			}

			if (node.right != -1 && node.left == -1) {
				isComplete = false;
				break;
			}

			if (node.right == -1) {
				mustBeLeaf = true;
			}

			if (node.left != -1) {
				queue.add(nodes[node.left]);
			}

			if (node.right != -1) {

				queue.add(nodes[node.right]);

			}

		}

		if (isComplete) {

			System.out.format("YES %d", node.index);

		} else {

			System.out.format("NO %d", root);

		}

	}
}
