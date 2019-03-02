package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Main1106 {

	static class Node {

		int index;

		int level;

		int chilrenNum;

		List<Integer> chilren;
	}

	static Node[] nodes;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		nodes = new Node[total];

		double rootPrice = Reader.nextDouble();

		double increment = Reader.nextDouble();

		for (int i = 0; i < total; i++) {

			Node node = new Node();

			node.index = i;

			int num = Reader.nextInt();

			node.chilrenNum = num;

			if (num > 0) {

				List<Integer> list = new ArrayList<Integer>();

				for (int j = 0; j < num; j++) {

					list.add(Reader.nextInt());

				}

				node.chilren = list;

			}

			nodes[i] = node;

		}

		BlockingQueue<Node> queue = new LinkedBlockingQueue<Node>();

		Node node = nodes[0];

		node.level = 0;

		queue.add(node);

		// List<Node> list = new ArrayList<Node>();

		Node finalNode = null;

		int count = 0;

		while (!queue.isEmpty()) {

			Node node2 = queue.take();

			if (node2.chilrenNum == 0) {

				if (finalNode == null) {
					finalNode = node2;
					count++;
				} else {
					if (finalNode.level == node2.level) {
						count++;
					} else {
						break;
					}
				}

			} else {
				for (int i = 0; i < node2.chilrenNum; i++) {

					Node node3 = nodes[node2.chilren.get(i)];
					node3.level = node2.level + 1;
					queue.add(node3);
				}
			}

		}


		double finalPrice = rootPrice
				* Math.pow(1 + increment / 100, finalNode.level);

		System.out.format("%.4f %d", finalPrice, count);

	}

}
