package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1094 {

	static class Node {
		int data;
		List<Integer> children = new ArrayList<Integer>();
		int level;
	}

	static Node[] nodes = new Node[100];
	static int[] levelNum = new int[100];

	public static void main(String[] args) throws Exception {

		MyReader.init();
		int total = MyReader.nextInt();
		int hasChilrenNum = MyReader.nextInt();
		for (int i = 0; i < hasChilrenNum; i++) {
			Node node = new Node();
			int data = MyReader.nextInt();
			node.data = data;
			int childrenNum = MyReader.nextInt();
			for (int j = 0; j < childrenNum; j++) {
				node.children.add(MyReader.nextInt());
			}
			nodes[data] = node;
		}
		if (total == 1) {
			System.out.println("1 1");
		} else {
			Queue<Node> queue = new LinkedBlockingQueue<Node>();
			Node node = nodes[1];
			node.level = 1;
			queue.add(node);
			levelNum[node.level] += 1;
			while (!queue.isEmpty()) {
				Node node2 = queue.poll();
				for (Integer i : node2.children) {
					levelNum[node2.level + 1] += 1;
					if (nodes[i] != null) {
						nodes[i].level = node2.level + 1;
						queue.add(nodes[i]);
					}

				}
			}

			int max = 0;
			int maxLevel = 0;
			for (int i = 0; i < levelNum.length; i++) {
				if (levelNum[i] > max) {
					max = levelNum[i];
					maxLevel = i;
				}
			}

			System.out.println(max + " " + maxLevel);

		}

	}
}
