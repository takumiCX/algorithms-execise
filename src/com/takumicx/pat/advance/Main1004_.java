package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1004_ {

	static class Node {
		int data;
		int level;
		List<Integer> chilren = new ArrayList<Integer>();
	}

	static Node[] nodes = new Node[100];

	static int[] levelNum = new int[100];

	public static void main(String[] args) throws Exception {
		MyReader.init();
		int total = MyReader.nextInt();
		int noLeafNum = MyReader.nextInt();
		if (total == 1) {
			System.out.println(1);
		} else {
			for (int i = 0; i < noLeafNum; i++) {
				int data = MyReader.nextInt();
				int chilrenNum = MyReader.nextInt();
				Node node = new Node();
				node.data = data;
				for (int j = 0; j < chilrenNum; j++) {
					node.chilren.add(MyReader.nextInt());
				}
				nodes[data] = node;
			}
			Node root = nodes[1];
			root.level = 1;
			Queue<Node> queue = new LinkedBlockingQueue<Node>();
			queue.add(root);
			int maxLevel = 1;
			while (!queue.isEmpty()) {
				Node node = queue.poll();
				maxLevel = node.level + 1;
				for (Integer i : node.chilren) {
					Node node2 = nodes[i];
					if (node2 == null) {
						levelNum[node.level + 1] += 1;
					} else {
						node2.level = node.level + 1;
						queue.add(node2);
					}
				}
			}

			StringBuilder sb = new StringBuilder();

			for (int i = 1; i <= maxLevel; i++) {
				sb.append(levelNum[i]).append(" ");
			}
			System.out.println(sb.toString().trim());
		}

	}

}
