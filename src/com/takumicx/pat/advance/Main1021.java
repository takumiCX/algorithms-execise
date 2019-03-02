package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1021 {

	static int[][] graph;

	static boolean[] visited;

	static int maxLevel = 0;

	static List<Integer> list = new ArrayList<Integer>();

	static int vNum = 0;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		vNum = Reader.nextInt();

		graph = new int[vNum + 1][vNum + 1];

		visited = new boolean[vNum + 1];

		for (int i = 1; i <= vNum - 1; i++) {
			int m = Reader.nextInt();
			int n = Reader.nextInt();
			graph[m][n] = 1;
			graph[n][m] = 1;
		}

		int count = 0;
		for (int i = 1; i <= vNum; i++) {
			if (!visited[i]) {
				dfs(i, 1);
				count++;
			}
		}

		if (count > 1) {
			System.out.format("Error: %d components", count);

		} else {

			Integer i = list.get(0);
			visited = new boolean[vNum + 1];
			list.clear();
			maxLevel = 0;
			dfs2(i, 1);
			list.add(i);
			Collections.sort(list);
			for (Integer k : list) {
				System.out.println(k);
			}

		}
	}

	private static void dfs2(Integer i, int level) {
		// TODO Auto-generated method stub

		visited[i] = true;
		if (level > maxLevel) {
			maxLevel = level;
			list.clear();
			list.add(i);
		} else if (level == maxLevel) {
			list.add(i);
		}

		for (int j = 1; j <= vNum; j++) {
			if (!visited[j] && graph[i][j] == 1) {
				dfs2(j, level + 1);
			}
		}
	}

	private static void dfs(int i, int level) {
		// TODO Auto-generated method stub
		visited[i] = true;
		if (level > maxLevel) {
			maxLevel = level;
			list.clear();
			list.add(i);
		}
		for (int j = 1; j <= vNum; j++) {
			if (!visited[j] && graph[i][j] == 1) {
				dfs(j, level + 1);
			}
		}

	}
}
