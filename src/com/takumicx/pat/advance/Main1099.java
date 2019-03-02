package com.takumicx.pat.advance;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1099 {

	static class Node {
		int index;
		int data;
		int left;
		int right;
	}

	static Node[] nodes = new Node[100];

	static int[] seq;

	static int index = 0;

	static int total = 0;

	public static void main(String[] args) throws Exception {

		MyReader.init();

		total = MyReader.nextInt();
		seq = new int[total];
		for (int i = 0; i < total; i++) {
			Node node = new Node();
			node.index = i;
			node.left = MyReader.nextInt();
			node.right = MyReader.nextInt();
			nodes[i] = node;
		}
		for (int i = 0; i < total; i++) {
			seq[i] = MyReader.nextInt();
		}

		Arrays.sort(seq);

		inOrder(0);
		levelOrder(0);
	}

	private static void levelOrder(int j) {
		// TODO Auto-generated method stub
		Node node = nodes[j];
		Queue<Node> queue = new LinkedBlockingQueue<Node>();
		queue.add(node);
		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty()) {
			Node node2 = queue.poll();
			sb.append(node2.data).append(" ");
			if (node2.left != -1) {
				queue.add(nodes[node2.left]);
			}
			if (node2.right != -1) {
				queue.add(nodes[node2.right]);
			}
		}
		System.out.println(sb.toString().trim());

	}

	private static void inOrder(int i) {
		// TODO Auto-generated method stub
		if (i == -1)
			return;
		Node node = nodes[i];
		inOrder(node.left);
		node.data = seq[index++];
		// System.out.println(node.data);
		inOrder(node.right);
	}

}
