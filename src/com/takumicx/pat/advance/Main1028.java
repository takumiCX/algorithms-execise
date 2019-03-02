package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1028 {

	static class Node {

		int id;
		String name;
		int grade;

	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int n = Reader.nextInt();
		int m = Reader.nextInt();
		List<Node> list = new ArrayList<Node>();
		for (int i = 0; i < n; i++) {
			Node node = new Node();
			node.id = Reader.nextInt();
			node.name = Reader.next();
			node.grade = Reader.nextInt();
			list.add(node);
		}

		if (m == 1) {

			Collections.sort(list, new Comparator<Node>() {

				@Override
				public int compare(Node o1, Node o2) {
					// TODO Auto-generated method stub
					return o1.id - o2.id;
				}
			});

		} else if (m == 2) {

			Collections.sort(list, new Comparator<Node>() {

				@Override
				public int compare(Node o1, Node o2) {
					// TODO Auto-generated method stub
					if (o1.name.compareTo(o2.name) == 0) {
						return o1.id - o2.id;
					} else {
						return o1.name.compareTo(o2.name);
					}
				}
			});

		} else {

			Collections.sort(list, new Comparator<Node>() {

				@Override
				public int compare(Node o1, Node o2) {
					// TODO Auto-generated method stub
					if (o1.grade == o2.grade) {
						return o1.id - o2.id;
					} else {
						return o1.grade - o2.grade;
					}
				}
			});

		}

		for (Node node : list) {
			System.out.format("%06d %s %d", node.id, node.name, node.grade);
			System.out.println();
		}
	}
}
