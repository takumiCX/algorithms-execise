package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1133 {

	static class Node {

		int data;

		int addr;

		int next;

	}

	static Node[] nodes = new Node[100001];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int first = Reader.nextInt();

		int nodeNum = Reader.nextInt();

		int k = Reader.nextInt();

		for (int i = 0; i < nodeNum; i++) {
			Node node = new Node();
			node.addr = Reader.nextInt();
			node.data = Reader.nextInt();
			node.next = Reader.nextInt();
			nodes[node.addr] = node;
		}

		List<Node> list = new ArrayList<Node>();

		int firstIndex = first;

		while (firstIndex != -1) {

			Node node = nodes[firstIndex];

			if (node.data < 0) {
				list.add(node);
			}
			firstIndex = node.next;
		}
		firstIndex = first;

		while (firstIndex != -1) {
			Node node = nodes[firstIndex];
			firstIndex = node.next;
			if (node.data <= k&&node.data>=0) {
				list.add(node);
			}
		}

		firstIndex = first;
		while (firstIndex != -1) {
			Node node = nodes[firstIndex];
			firstIndex = node.next;
			if (node.data > k) {
				list.add(node);
			}
		}

		for (int i = 0; i < list.size() - 1; i++) {
			Node node = list.get(i);
			Node nextNode = list.get(i + 1);
			System.out.format("%05d %d %05d", node.addr, node.data,
					nextNode.addr);
			System.out.println();
		}
		Node node = list.get(list.size() - 1);
		System.out.format("%05d %d %d", node.addr, node.data, -1);

	}

}
