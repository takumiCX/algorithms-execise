package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1004 {

	static class Node {

		int data;

		int level;

		List<Integer> children = new ArrayList<Integer>();
	}

	static Node[] nodes = new Node[100];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		int noLeafNum = Reader.nextInt();
		
		if(noLeafNum==0){
			System.out.println(1);
			return;
		}

		for (int i = 0; i < noLeafNum; i++) {

			Node node = new Node();

			int index = Reader.nextInt();

			node.data = index;

			int childrenNum = Reader.nextInt();

			for (int j = 0; j < childrenNum; j++) {

				node.children.add(Reader.nextInt());

			}

			nodes[index] = node;

		}

		Queue<Node> queue = new LinkedBlockingQueue<Node>();

		int[] counts = new int[100];

		Node root = nodes[1];

		root.level = 1;

		queue.add(root);

		int maxLevel = 1;

		while (!queue.isEmpty()) {

			Node node = queue.poll();

			for (int i = 0; i < node.children.size(); i++) {
				Integer index = node.children.get(i);
				if (nodes[index] == null) {
					maxLevel = node.level + 1;
					counts[maxLevel] += 1;
				} else {
					Node node2 = nodes[index];
					node2.level = node.level + 1;
					queue.add(node2);
				}
			}

		}

		StringBuffer buffer = new StringBuffer();

		for (int i = 1; i <= maxLevel; i++) {
			buffer.append(counts[i]).append(" ");
		}

		System.out.println(buffer.toString().trim());

	}
}
