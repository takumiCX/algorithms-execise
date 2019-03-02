package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1134 {

	static int vNum = 0;
	static int eNum = 0;

	static class Node {

		int start;
		int end;
	}

	static List<Node> list = new ArrayList<Node>();

	static boolean[] res;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		vNum = Reader.nextInt();

		eNum = Reader.nextInt();

		for (int i = 0; i < eNum; i++) {
			Node node = new Node();
			node.start = Reader.nextInt();
			node.end = Reader.nextInt();
			list.add(node);
		}

		int k = Reader.nextInt();

		for (int i = 0; i < k; i++) {
			int total = Reader.nextInt();
			res = new boolean[vNum];
			for (int j = 0; j < total; j++) {
				int index = Reader.nextInt();
				res[index] = true;
			}
			boolean flag = true;
			for (Node node : list) {
				if (!res[node.start] && !res[node.end]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}
