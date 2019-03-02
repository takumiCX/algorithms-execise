package com.takumicx.pat.advance;

public class Main1119 {

	static int[] pre = new int[30];

	static int[] post = new int[30];

	static boolean flag = true;

	static class Node {

		int data;

		Node left;

		Node right;
	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		for (int i = 0; i < total; i++) {

			pre[i] = Reader.nextInt();
		}

		for (int i = 0; i < total; i++) {
			post[i] = Reader.nextInt();
		}

		Node root = null;

		root = buildTree(0, total - 1, 0, total - 1);

		StringBuilder sb = new StringBuilder();
		inOrder(root, sb);

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.println(sb.toString().trim());

	}

	private static void inOrder(Node root, StringBuilder sb) {

		// TODO Auto-generated method stub

		if (root == null)
			return;

		inOrder(root.left, sb);

		sb.append(root.data).append(" ");

		inOrder(root.right, sb);

	}

	private static Node buildTree(int i, int j, int k, int l) {
		// TODO Auto-generated method stub

		if (i > j)
			return null;

		if (i == j) {

			Node node = new Node();

			node.data = pre[i];

			return node;

		} else {

			Node node = new Node();

			node.data = pre[i];

			int m = post[l - 1];

			int nextRoot = -1;

			for (int p = i + 1; p <= j; p++) {
				if (pre[p] == m) {
					nextRoot = p;
					break;
				}
			}

			if (nextRoot - i > 1) {

				node.left = buildTree(i + 1, nextRoot - 1, k, k + nextRoot - i
						- 2);
				node.right = buildTree(nextRoot, j, l - 1 - j + nextRoot, l - 1);

			} else {

				flag = false;

				node.left = buildTree(i + 1, j, k, l - 1);

			}

			return node;

		}

	}
}
