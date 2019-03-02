package com.takumicx.pat.advance;


public class Main1003_ {

	static int vertexNum;

	static int edgeNum;

	static boolean[] collected = new boolean[500];

	static int[][] graph = new int[500][500];

	static int start;

	static int end;

	static int[] vW = new int[500];

	static int[] weight = new int[500];

	static int[] dist = new int[500];

	static int[] counts = new int[500];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		vertexNum = Reader.nextInt();

		edgeNum = Reader.nextInt();

		start = Reader.nextInt();

		end = Reader.nextInt();

		for (int i = 0; i < vertexNum; i++) {
			vW[i] = Reader.nextInt();
		}

		for (int i = 0; i < vertexNum; i++) {

			int from = Reader.nextInt();

			int end = Reader.nextInt();

			int length = Reader.nextInt();

			graph[from][end] = length;
			graph[end][from] = length;

		}

		for (int i = 0; i < vertexNum; i++) {
			dist[i] = Integer.MAX_VALUE;
		}

		dist[start] = 0;

		weight[start] = vW[start];

		counts[start] = 1;

		while (true) {

			int index = -1;

			int min = Integer.MAX_VALUE;

			for (int i = 0; i < vertexNum; i++) {

				if (!collected[i] && dist[i] < min) {
					index = i;
					min = dist[i];
				}

			}

			if (index == end) {
				break;
			}

			collected[index] = true;

			for (int i = 0; i < vertexNum; i++) {

				if (graph[index][i] > 0 && !collected[i]) {

					if(dist[index]+graph[index][i]<dist[i]){
						
						dist[i]=dist[index]+graph[index][i];
						
						weight[i]=weight[index]+vW[i];
						
						counts[i]=counts[index];
						
					}else if(dist[index]+graph[index][i]==dist[i]){
						
						if(weight[index]+vW[i]>weight[i]){
							weight[i]=weight[index]+vW[i];
						}
						counts[i]+=counts[index];
						
					}
				}

			}

		}

		System.out.format("%d %d",counts[end],weight[end]);

	}
}
