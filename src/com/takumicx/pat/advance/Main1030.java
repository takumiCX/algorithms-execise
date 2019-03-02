package com.takumicx.pat.advance;

import java.util.LinkedList;

public class Main1030 {

	static class Node {
		int lenght;
		int cost;
	}

	static int vNum = 0;

	static int eNum = 0;

	static int start = 0;

	static int end = 0;

	static Node[][] graph = new Node[500][500];

	static boolean[] visited = new boolean[500];

	static int[] path = new int[500];

	static int[] dist = new int[500];

	static int[] cost = new int[500];

	private static void init() {
		// TODO Auto-generated method stub

		for (int i = 0; i < vNum; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[start] = 0;
		path[start] = start;
		cost[start] = 0;

	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		vNum = Reader.nextInt();
		eNum = Reader.nextInt();
		start = Reader.nextInt();
		end = Reader.nextInt();

		for (int i = 0; i < eNum; i++) {
			int m = Reader.nextInt();
			int n = Reader.nextInt();
			int length = Reader.nextInt();
			int cost = Reader.nextInt();
			Node node = new Node();
			node.cost = cost;
			node.lenght = length;
			graph[m][n] = node;
			graph[n][m] = node;
		}

		init();

		while (true) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int i = 0; i < vNum; i++) {
				if (!visited[i] && dist[i] < min) {
					min = dist[i];
					minIndex = i;
				}
			}

			visited[minIndex] = true;

			if (minIndex == end) {
				break;
			}

			for (int j = 0; j < vNum; j++) {
				if (!visited[j] && graph[minIndex][j] != null) {
					Node node = graph[minIndex][j];
					if (dist[minIndex] + node.lenght < dist[j]) {
						dist[j] = dist[minIndex] + node.lenght;
						cost[j] = cost[minIndex] + node.cost;
						path[j] = minIndex;
					} else if (dist[minIndex] + node.lenght == dist[j]
							&& cost[minIndex] + node.cost < cost[j]) {
						cost[j] = cost[minIndex] + node.cost;
						path[j] = minIndex;
					}
				}
			}
		}
		StringBuffer sf = new StringBuffer();
		int pos = end;
		LinkedList<Integer> list = new LinkedList<Integer>();
		while (pos != start) {
			list.addFirst(pos);
			pos = path[pos];
		}
		list.addFirst(pos);

		list.add(dist[end]);
		list.add(cost[end]);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(" ");
		}

		System.out.println(sb.toString().trim());
	}
}
