package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1129 {

	static class Node {

		int index;
		int count;
	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		int maxR = Reader.nextInt();

		List<Node> list = new ArrayList<Node>();

		for (int i = 0; i < total; i++) {

			int m = Reader.nextInt();

			if (i > 0) {
				// Collections.sort(list, new Comparator<Node>() {
				//
				// @Override
				// public int compare(Node o1, Node o2) {
				// // TODO Auto-generated method stub
				// if (o1.count == o2.count) {
				// return o1.index - o2.index;
				// } else {
				// return o2.count - o1.count;
				// }
				// }
				// });

				StringBuilder sb = new StringBuilder();
				sb.append(m).append(": ");
				for (int j = 0; j < 3&&j<list.size(); j++) {
					sb.append(list.get(j).index).append(" ");
				}
				System.out.println(sb.toString().trim());

				boolean flag = true;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).index == m) {
						list.get(j).count += 1;
						sort(j, list);
						flag = false;
						break;
					}
				}
				if (flag) {
					Node node = new Node();
					node.index = m;
					node.count = 1;
					list.add(node);
					sort(list.size()-1, list);
					
				}

			} else {
				Node node = new Node();
				node.index = m;
				node.count = 1;
				list.add(node);
			}

		}

	}

	private static void sort(int j, List<Node> list) {
		// TODO Auto-generated method stub

		Node node = list.get(j);

		while (j > 0 && com(node,list.get(j-1), list)) {
			list.set(j, list.get(j - 1));
			j--;
		}
		list.set(j, node);

	}

	private static boolean com(Node node, Node node2, List<Node> list) {
		// TODO Auto-generated method stub
		if (node.count > node2.count) {
			return true;
		} else return node.count == node2.count && node.index < node2.index;
	}


}
