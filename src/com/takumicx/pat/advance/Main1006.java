package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1006 {

	static class Node {

		String number;

		String signInTime;

		String signOutTime;

	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		List<Node> list = new ArrayList<Node>();

		for (int i = 0; i < total; i++) {

			String number = Reader.next();

			String in = Reader.next();

			String out = Reader.next();

			Node node = new Node();

			node.number = number;

			node.signInTime = in;

			node.signOutTime = out;

			list.add(node);

		}

		Collections.sort(list, new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {

				String[] s1 = o1.signInTime.split(":");

				String[] s2 = o2.signInTime.split(":");

				int cha = s1[0].compareTo(s2[0]);

				if (cha == 0) {

					cha = s1[1].compareTo(s2[1]);

					if (cha == 0) {

						return s1[2].compareTo(s2[2]);

					} else {

						return cha;
					}

				} else {

					return cha;
				}

			}
		});

		System.out.format("%s ", list.get(0).number);

		Collections.sort(list, new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				String[] s1 = o2.signOutTime.split(":");

				String[] s2 = o1.signOutTime.split(":");

				int cha = s1[0].compareTo(s2[0]);

				if (cha == 0) {

					cha = s1[1].compareTo(s2[1]);

					if (cha == 0) {

						return s1[2].compareTo(s2[2]);

					} else {

						return cha;
					}

				} else {

					return cha;
				}
			}
		});

		System.out.print(list.get(0).number);

	}
}
