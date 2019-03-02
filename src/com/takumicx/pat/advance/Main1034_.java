package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1034_ {

	static int[][] graph = new int[1001][1001];
	static boolean[] visited = new boolean[1001];
	static int vNum = 0;
	static int eNum = 0;
	static Map<String, Integer> map = new HashMap<String, Integer>();
	static Map<Integer, String> map2 = new HashMap<Integer, String>();

	static class Node {
		String name;
		int num;
	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		eNum = Reader.nextInt();
		int k = Reader.nextInt();
		for (int i = 0; i < eNum; i++) {
			String name1 = Reader.next();
			String name2 = Reader.next();
			int length = Reader.nextInt();
			Integer m = map.get(name1);
			if (m == null) {
				m = ++vNum;
				map.put(name1, m);
				map2.put(m, name1);
			}
			Integer n = map.get(name2);
			if (n == null) {
				n = ++vNum;
				map.put(name2, n);
				map2.put(n, name2);
			}
			graph[m][n] = length;
			graph[n][m] = length;
			graph[m][0] += length;
			graph[n][0] += length;
		}

		List<Node> list2 = new ArrayList<Node>();

		for (int i = 1; i <=vNum; i++) {
			if (!visited[i]) {
				List<Integer> list = new ArrayList<Integer>();
				dfs(i, list);
				if (list.size() > 2) {
					int sum = 0;
					int max = 0;
					int maxIndex = 0;
					for (Integer j : list) {
						if (graph[j][0] > max) {
							max = graph[j][0];
							maxIndex = j;
						}
						sum += graph[j][0];
					}
					sum = sum / 2;
					if (sum > k) {
						String s = map2.get(maxIndex);
						Node node = new Node();
						node.name = s;
						node.num = list.size();
						list2.add(node);
					}
				}
			}
		}
		System.out.println(list2.size());
		if (list2.size() > 0) {
			Collections.sort(list2, new Comparator<Node>() {

				@Override
				public int compare(Node o1, Node o2) {
					// TODO Auto-generated method stub
					return o1.name.compareTo(o2.name);
				}
			});
			for (Node node : list2) {
				System.out.println(node.name + " " + node.num);
			}
		}

	}

	private static void dfs(int i, List<Integer> list) {
		// TODO Auto-generated method stub
		visited[i] = true;
		list.add(i);
		for (int j = 1; j <= vNum; j++) {
			if (!visited[j] && graph[i][j] > 0) {
				dfs(j, list);
			}
		}

	}

}
