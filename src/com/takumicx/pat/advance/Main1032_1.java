package com.takumicx.pat.advance;


public class Main1032_1 {

	static class Node {
		String data;
		int next;
		int index;
		boolean visited;
	}

	static Node[] nodes = new Node[100001];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int pos1 = Reader.nextInt();
		int pos2 = Reader.nextInt();
		int total = Reader.nextInt();

		for (int i = 0; i < total; i++) {
			int addr = Reader.nextInt();
			String data = Reader.next();
			int next = Reader.nextInt();
			Node node = new Node();
			node.index = addr;
			node.data = data;
			node.next = next;
			nodes[addr] = node;

		}

		int pos = pos1;
		while (pos != -1) {
			Node node = nodes[pos];
			node.visited = true;
			pos = node.next;
		}
		pos = pos2;
		boolean flag = false;
		Node node = null;
		while (pos != -1) {
			node = nodes[pos];
			if (node.visited) {
				flag = true;
				break;
			}
			pos=node.next;
		}
		if (flag) {
			System.out.format("%05d", node.index);
		} else {
			System.out.println(-1);
		}

	}

}
