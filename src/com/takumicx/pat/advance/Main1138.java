package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1138 {

	static int[] preArr;

	static int[] inArr;

	static class Node {
		int data;
		Node left;
		Node right;
	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		preArr = new int[total];
		inArr = new int[total];

		for (int i = 0; i < total; i++) {
			preArr[i] = Reader.nextInt();
		}
		for (int i = 0; i < total; i++) {
			inArr[i] = Reader.nextInt();
		}

		Node root = null;
		root = buildTree(0, total - 1, 0, total - 1);

		List<Integer> list = new ArrayList<Integer>();

		postOrder(root, list);
		
		System.out.println(list.get(0));

	}

	private static void postOrder(Node root, List<Integer> list) {
		if (root == null)
			return;
		// TODO Auto-generated method stub
		postOrder(root.left, list);
		postOrder(root.right, list);
		list.add(root.data);
	}

	private static Node buildTree(int preL, int preR, int inL, int inR) {
		// TODO Auto-generated method stub
		if (preL > preR) {
			return null;
		}

		Node node = new Node();
		node.data = preArr[preL];
		int rootIndex = -1;
		for (int i = inL; i <= inR; i++) {
			if (inArr[i] == node.data) {
				rootIndex = i;
				break;
			}
		}
		node.left = buildTree(preL + 1, preL + 1 + (rootIndex - 1 - inL), inL,
				rootIndex - 1);
		node.right = buildTree(preR - (inR - rootIndex - 1), preR,
				rootIndex + 1, inR);

		return node;

	}

}
