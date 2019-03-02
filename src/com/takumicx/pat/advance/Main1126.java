package com.takumicx.pat.advance;


public class Main1126 {

	static int[][] graph;

	static int vNum = 0;

	static int count = 0;

	static boolean[] visited;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		vNum = Reader.nextInt();

		int eNum = Reader.nextInt();

		graph = new int[vNum + 1][vNum + 1];
		visited = new boolean[vNum + 1];

		for (int i = 0; i < eNum; i++) {
			int m = Reader.nextInt();
			int n = Reader.nextInt();
			graph[m][n] = 1;
			graph[n][m] = 1;
			graph[m][0] += 1;
			graph[n][0] += 1;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= vNum; i++) {
			sb.append(graph[i][0]).append(" ");
			if (graph[i][0] % 2 != 0) {
				count++;
			}
		}

		System.out.println(sb.toString().trim());

		boolean flag = isConnected();

		if (count == 0 && flag) {
			System.out.println("Eulerian");
		} else if (count == 2 && flag) {
			System.out.println("Semi-Eulerian");
		} else {
			System.out.println("Non-Eulerian");
		}

	}

	private static boolean isConnected() {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= vNum; i++) {
			if (!visited[i]) {
				dfs(i);
				count++;
			}
		}
		return count == 1;
	}

	private static void dfs(int i) {
		// TODO Auto-generated method stub
		visited[i] = true;
		for (int j = 1; j <= vNum; j++) {
			if (!visited[j] && graph[i][j] == 1) {
				dfs(j);
			}
		}

	}
}