package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1013 {

	static List<Integer>[] graph;

	static boolean[] visited;

	static int nodeNum = 0;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		nodeNum = Reader.nextInt();

		graph = new List[nodeNum + 1];

		for (int i = 1; i <= nodeNum; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		visited = new boolean[nodeNum + 1];

		int edgeNum = Reader.nextInt();

		int checkNum = Reader.nextInt();

		for (int i = 1; i <= edgeNum; i++) {

			int from = Reader.nextInt();

			int end = Reader.nextInt();

			graph[from].add(end);

			graph[end].add(from);

		}

		for (int i = 0; i < checkNum; i++) {

			int n = Reader.nextInt();

			check(n);
		}

	}

	private static void check(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= nodeNum; i++) {
			visited[i] = false;
		}

		int count = 0;

		for (int i = 1; i <= nodeNum; i++) {
			if (i != n && !visited[i]) {
				count++;
				dfs(i, n);
			}

		}

		System.out.println(count - 1);

	}

	private static void dfs(int i, int n) {
		// TODO Auto-generated method stub

		visited[i] = true;

		for (int j = 1; j <= nodeNum; j++) {
			if (graph[i].contains(j) && i != n && j != n
					&& !visited[j]) {
				dfs(j, n);
			}
		}

	}
}
