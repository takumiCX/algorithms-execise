package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main1114 {

	static class Node {

		int index;

		int count;

		double sets;

		double area;
	}

	static int[] set = new int[10001];

	static Node[] nodes = new Node[10001];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		for (int i = 0; i < set.length; i++) {
			set[i] = -1;
		}

		int total = Reader.nextInt();

		for (int i = 0; i < total; i++) {

			int index = Reader.nextInt();

			if (set[index] == -1) {
				set[index] = index;
			}

			int father = Reader.nextInt();

			if (father != -1) {
				union(index, father);
			}

			int mother = Reader.nextInt();

			if (mother != -1) {
				union(index, mother);
			}

			int childrenNum = Reader.nextInt();

			for (int j = 0; j < childrenNum; j++) {

				int n = Reader.nextInt();

				union(index, n);

			}

			Node node = new Node();
			node.sets = Reader.nextInt();
			node.area = Reader.nextInt();
			node.index = index;

			nodes[index] = node;

		}

		Map<Integer, Node> map = new HashMap<Integer, Node>();

		for (int i = 0; i < set.length; i++) {

			if (set[i] != -1) {

				int father = findFather(i);

				Node node = map.get(father);
				if (node == null) {

					node = new Node();
					node.count = 1;
					node.index = father;
					map.put(father, node);
				} else {
					node.count += 1;
				}
				Node node2 = nodes[i];
				if (node2 != null) {

					node.sets += node2.sets;
					node.area += node2.area;
				}
			}

		}
		List<Entry<Integer, Node>> list = new ArrayList<Entry<Integer, Node>>(
				map.entrySet());

		Collections.sort(list, new Comparator<Entry<Integer, Node>>() {

			@Override
			public int compare(Entry<Integer, Node> o1, Entry<Integer, Node> o2) {
				// TODO Auto-generated method stub
				Node v1 = o1.getValue();
				Node v2 = o2.getValue();
				Double d1 = v1.area / v1.count;
				Double d2 = v2.area / v2.count;
				if (d1.compareTo(d2) == 0) {

					return v1.index - v2.index;

				} else {

					return d2.compareTo(d1);

				}
			}

		});

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			Node node = list.get(i).getValue();
			System.out.format("%04d %d %.3f %.3f", node.index, node.count,
					node.sets / node.count, node.area / node.count);
			System.out.println();
		}

	}

	private static void union(int i, int j) {
		// TODO Auto-generated method stub

		if (set[i] == -1) {
			set[i] = i;
		}
		if (set[j] == -1) {
			set[j] = j;
		}
		int a = findFather(i);

		int b = findFather(j);

		if (a < b) {

			set[b] = a;

		} else if (a > b) {

			set[a] = b;
		}

	}

	private static int findFather(int i) {
		// TODO Auto-generated method stub

		if (set[i] == i)
			return i;

		set[i] = findFather(set[i]);

		return set[i];

	}
}
