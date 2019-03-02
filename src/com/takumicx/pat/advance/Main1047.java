package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1047 {

	static class Node {
		int cNo;
		List<String> stus = new ArrayList<String>();
	}

	static Node[] nodes;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		int sNum = Reader.nextInt();
		int cNum = Reader.nextInt();
		nodes = new Node[cNum + 1];
		for (int i = 1; i <= cNum; i++) {
			Node node = new Node();
			nodes[i] = node;
		}
		for (int i = 0; i < sNum; i++) {
			String name = Reader.next();
			int n = Reader.nextInt();
			for (int j = 0; j < n; j++) {
				int m = Reader.nextInt();
				nodes[m].stus.add(name);
			}
		}

		for (int i = 1; i <= cNum; i++) {
			List<String> stus = nodes[i].stus;
			Collections.sort(stus, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
			});
			System.out.println(i + " " + stus.size());
			for (String s : stus) {
				System.out.println(s);
			}
		}

	}
}
