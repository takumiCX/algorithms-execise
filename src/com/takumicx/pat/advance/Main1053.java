package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1053 {

	static class Node {
		int index;
		int weight;
		List<Integer> list = new ArrayList<Integer>();
	}

	static int weightSum = 0;

	static Node[] nodes = new Node[100];

	public static void main(String[] args) throws Exception {
		Reader.init(System.in);
		int total = Reader.nextInt();
		int noLeafNum = Reader.nextInt();
		weightSum = Reader.nextInt();

		for (int i = 0; i < total; i++) {
			Node node = new Node();
			node.index = i;
			node.weight = Reader.nextInt();
			nodes[i] = node;
		}

		for (int i = 0; i < noLeafNum; i++) {
			int index = Reader.nextInt();
			Node node = nodes[index];
			int num = Reader.nextInt();
			for (int j = 0; j < num; j++) {
				node.list.add(Reader.nextInt());
			}
			Collections.sort(node.list, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return nodes[o2].weight - nodes[o1].weight;
				}
			});
		}

		checkSum(0, nodes[0].weight + " ");

	}

	private static void checkSum(int i, String s) {
		// TODO Auto-generated method stub

		Node node = nodes[i];
		if (node.list.size() == 0) {
			String[] split = s.split(" ");
			int sum = 0;
			for (int j = 0; j < split.length; j++) {
				if (!split[j].isEmpty()) {
					sum += Integer.valueOf(split[j]);
				}
			}
			if (sum == weightSum) {
				System.out.println(s.trim());
			}
		} else {
			for (Integer k : node.list) {
				Node node2 = nodes[k];
				checkSum(k, s + node2.weight + " ");
			}
		}

	}
}
