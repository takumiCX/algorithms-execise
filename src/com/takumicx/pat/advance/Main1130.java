package com.takumicx.pat.advance;


public class Main1130 {

	static class Node {
		String data;
		int index;
		int left;
		int right;
	}

	static Node[] nodes = new Node[21];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		boolean[] roots = new boolean[total + 1];

		for (int i = 1; i <= total; i++) {
			String data = Reader.next();
			int left = Reader.nextInt();
			if (left != -1) {
				roots[left] = true;
			}
			int right = Reader.nextInt();
			if (right != -1) {
				roots[right] = true;
			}
			Node node = new Node();
			node.data = data;
			node.left = left;
			node.right = right;
			node.index = i;
			nodes[i] = node;

		}

		int root = 0;
		for (int i = 1; i <= total; i++) {
			if (!roots[i]) {
				root = i;
				break;
			}
		}

		StringBuilder sb = new StringBuilder();

		print(nodes[root].left, sb);
		sb.append(nodes[root].data);
		print(nodes[root].right, sb);

		System.out.println(sb.toString());

	}

	private static void print(int root, StringBuilder sb) {
		if (root == -1)
			return;
		// TODO Auto-generated method stub
		if (nodes[root].left != -1 || nodes[root].right != -1) {
			sb.append("(");
			print(nodes[root].left, sb);
			sb.append(nodes[root].data);
			print(nodes[root].right, sb);
			sb.append(")");
		} else {
			sb.append(nodes[root].data);
		}

	}

}
