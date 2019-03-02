package com.takumicx.pat.advance;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1127 {

	static class Node {

		int data;

		Node left;

		Node right;

		int level;

	}

	static int[] inArr = new int[30];

	static int[] postArr = new int[30];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		for (int i = 0; i < total; i++) {
			inArr[i] = Reader.nextInt();
		}

		for (int i = 0; i < total; i++) {

			postArr[i] = Reader.nextInt();

		}

		Node root = null;

		root = buildTree(0, total - 1, 0, total - 1);

		Queue<Node> queue = new LinkedBlockingQueue<Node>();

		root.level = 1;

		queue.add(root);

		LinkedList<Integer>[] res = new LinkedList[31];

		for (int i = 0; i < 31; i++) {
			res[i] = new LinkedList<Integer>();
		}

		int count = 0;
		while (!queue.isEmpty()) {

			Node node = queue.poll();

			count++;

			if (node.level % 2 == 0) {

				res[node.level].addLast(node.data);

			} else {

				res[node.level].addFirst(node.data);

			}

			if (node.left != null) {

				node.left.level = node.level + 1;

				queue.add(node.left);

			}

			if (node.right != null) {

				node.right.level = node.level + 1;
				queue.add(node.right);
			}

		}

		// System.out.println(count);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < res.length; i++) {
			if (!res[i].isEmpty()) {
				for (Integer k : res[i]) {
					sb.append(k).append(" ");
				}
			}
		}

		System.out.println(sb.toString().trim());

	}

	private static Node buildTree(int inLeft, int inRight, int postLeft,
			int postRight) {
		// TODO Auto-generated method stub
		if (inLeft > inRight) {
			return null;
		}

		Node node = new Node();

		int index = -1;

		for (int i = inLeft; i <= inRight; i++) {
			if (inArr[i] == postArr[postRight]) {
				index = i;
				break;
			}
		}

		node.data = postArr[postRight];

		node.left = buildTree(inLeft, index - 1, postLeft, index - 1 - inLeft
				+ postLeft);

		node.right = buildTree(index + 1, inRight, postRight - 1 - inRight + 1
				+ index, postRight - 1);

		return node;

	}

}
