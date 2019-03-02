package com.takumicx.pat;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main7_6 {

	static int[][] graph = new int[10][10];

	static int vertexNum = 0;

	static int edgeNum = 0;

	static boolean[] dfsVisited = new boolean[10];

	static boolean[] bfsVisited = new boolean[10];

	static BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		vertexNum = Reader.nextInt();

		edgeNum = Reader.nextInt();

		for (int i = 0; i < edgeNum; i++) {

			int from = Reader.nextInt();

			int to = Reader.nextInt();

			graph[from][to] = 1;
			graph[to][from] = 1;
		}

		dfsTraval();
		bfsTraval();

	}

	private static void bfsTraval() throws Exception {
		// TODO Auto-generated method stub

		for (int i = 0; i < vertexNum; i++) {

			if (!bfsVisited[i]) {
				StringBuilder sb = new StringBuilder();

				bfs(i, sb);
				
				String s = sb.toString().trim();
				
				if(!s.isEmpty()){
					
					System.out.format("{ %s }",s);
					System.out.println();
				}
			}

		}

	}

	private static void bfs(int i, StringBuilder sb) throws Exception {
		// TODO Auto-generated method stub

		bfsVisited[i] = true;
		sb.append(i).append(" ");
		queue.add(i);
		while (!queue.isEmpty()) {

			Integer e = queue.take();
			for (int j = 0; j < vertexNum; j++) {
				if (graph[e][j] == 1 && !bfsVisited[j]) {
					bfsVisited[j] = true;
					sb.append(j).append(" ");
					queue.add(j);
				}
			}

		}

	}

	private static void dfsTraval() {
		// TODO Auto-generated method stub

		for (int i = 0; i < vertexNum; i++) {

			StringBuilder sb = new StringBuilder();

			if (!dfsVisited[i]) {
				dfs(i, sb);

				String s = sb.toString().trim();
				if (!s.isEmpty()) {
					System.out.format("{ %s }", s);

					System.out.println();
				}
			}

		}

	}

	private static void dfs(int i, StringBuilder sb) {
		// TODO Auto-generated method stub

		dfsVisited[i] = true;

		sb.append(i).append(" ");

		for (int j = 0; j < vertexNum; j++) {

			if (graph[i][j] == 1 && !dfsVisited[j]) {
				dfs(j, sb);
			}

		}

	}
}
