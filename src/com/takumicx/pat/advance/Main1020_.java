package com.takumicx.pat.advance;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1020_ {

	static int[] postArr = new int[30];
	static int[] inArr = new int[30];

	static class Node {
		int data;
		Node left;
		Node right;
	}

	public static void main(String[] args) throws Exception {
		MyReader.init();

		int total = MyReader.nextInt();
		for (int i = 0; i < total; i++) {
			postArr[i] = MyReader.nextInt();
		}
		for (int i = 0; i < total; i++) {
			inArr[i] = MyReader.nextInt();
		}

		Node root = null;
		root = buildTree(0, total - 1, 0, total - 1);
		postOrder(root);
	}

	private static void postOrder(Node root) {
		// TODO Auto-generated method stub
		Queue<Node> queue = new LinkedBlockingQueue<Node>();
		queue.add(root);
		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			sb.append(node.data).append(" ");
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		System.out.println(sb.toString().trim());

	}

	private static Node buildTree(int inLeft, int inRight, int postLef,
			int postRight) {
		// TODO Auto-generated method stub
		if (inLeft > inRight) {
			return null;
		}
		int root = postArr[postRight];
		int rootIndex = -1;
		for (int i = 0; i <= inRight; i++) {
			if (inArr[i] == root) {
				rootIndex = i;
				break;
			}
		}
		Node node = new Node();
		node.data = root;
		node.left = buildTree(inLeft, rootIndex - 1, postLef, postLef
				+ (rootIndex - 1 - inLeft));
		node.right = buildTree(rootIndex + 1, inRight, postRight - 1
				- (inRight - rootIndex - 1), postRight - 1);
		return node;

	}
}
