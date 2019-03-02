package com.takumicx.pat.advance;

import java.io.IOException;

public class Main1003_2 {

	static int[][] graph = new int[500][500];

	static int[] weightSum = new int[500];

	static int[] weight = new int[500];

	static boolean[] visited = new boolean[500];

	static int[] dist = new int[500];

	static int[] pathNum = new int[500];

	static int vNum = 0;

	static int eNum = 0;

	static int start = 0;

	static int end = 0;

	private static void init() {
		// TODO Auto-generated method stub
		weightSum[start] = weight[start];
		for (int i = 0; i < vNum; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[start] = 0;
		pathNum[start] = 1;
	}

	public static void main(String[] args) throws IOException {

		Reader.init(System.in);

		vNum = Reader.nextInt();
		eNum = Reader.nextInt();
		start = Reader.nextInt();
		end = Reader.nextInt();
		for (int i = 0; i < vNum; i++) {
			weight[i] = Reader.nextInt();
		}

		for (int i = 0; i < eNum; i++) {
			int a = Reader.nextInt();
			int b = Reader.nextInt();
			int m = Reader.nextInt();
			graph[a][b] = m;
			graph[b][a] = m;
		}

		init();

		while (true) {
			int minDist = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int i = 0; i < vNum; i++) {
				if (!visited[i] && dist[i] < minDist) {
					minDist = dist[i];
					minIndex = i;
				}
			}

			visited[minIndex] = true;
			if (minIndex == end) {
				break;
			}

			for (int j = 0; j < vNum; j++) {
				if (!visited[j] && graph[minIndex][j] > 0) {
					if (dist[minIndex] + graph[minIndex][j] < dist[j]) {
						dist[j] = dist[minIndex] + graph[minIndex][j];
						weightSum[j] = weightSum[minIndex] + weight[j];
						pathNum[j] = pathNum[minIndex];
					} else if (dist[minIndex] + graph[minIndex][j] ==dist[j]) {
						pathNum[j] += pathNum[minIndex];
						if (weightSum[minIndex] + weight[j] > weightSum[j]) {
							weightSum[j] = weightSum[minIndex] + weight[j];
						}
					}
				}
			}
			
		}
		System.out.format("%d %d",pathNum[end],weightSum[end]);
	}

}
