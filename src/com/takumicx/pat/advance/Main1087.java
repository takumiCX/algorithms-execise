package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main1087 {

	static int cNum = 0;
	static int rNum = 0;
	static Map<String, Integer> map = new HashMap<String, Integer>();
	static Map<Integer, String> map2 = new HashMap<Integer, String>();
	static int count = -1;

	static int[] weight = new int[200];
	static int[] weightSum = new int[200];
	static boolean[] visietd = new boolean[200];
	static int[] dist = new int[200];
	static int[] path = new int[200];
	static int[][] graph = new int[200][200];
	static int[] pathNum = new int[200];

	static int romeIndex = 0;

	private static void init() {
		// TODO Auto-generated method stub
		for (int i = 0; i < cNum; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[0] = 0;
		weightSum[0] = 0;
		romeIndex = map.get("ROM");
		pathNum[0] = 1;
	}

	public static void main(String[] args) throws Exception {

		MyReader.init();
		cNum = MyReader.nextInt();
		rNum = MyReader.nextInt();
		String start = MyReader.next();
		map.put(start, ++count);
		map2.put(count, start);
		for (int i = 0; i < cNum - 1; i++) {
			String name = MyReader.next();
			int num = MyReader.nextInt();
			map.put(name, ++count);
			map2.put(count, name);
			weight[count] = num;
		}
		for (int i = 0; i < rNum; i++) {
			int from = map.get(MyReader.next());
			int to = map.get(MyReader.next());
			int dist = MyReader.nextInt();
			graph[from][to] = dist;
			graph[to][from] = dist;

		}
		init();

		while (true) {
			int minDist = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int i = 0; i < cNum; i++) {
				if (!visietd[i] && dist[i] < minDist) {
					minDist = dist[i];
					minIndex = i;
				}
			}
			if (minIndex == romeIndex) {
				break;
			}
			visietd[minIndex] = true;
			for (int j = 0; j < cNum; j++) {
				if (!visietd[j] && graph[minIndex][j] > 0) {
					if (dist[minIndex] + graph[minIndex][j] < dist[j]) {
						dist[j] = dist[minIndex] + graph[minIndex][j];
						path[j] = minIndex;
						weightSum[j] = weightSum[minIndex] + weight[j];
						pathNum[j] = pathNum[minIndex];
					} else if (dist[minIndex] + graph[minIndex][j] == dist[j]) {
						pathNum[j] += pathNum[minIndex];
						if (weightSum[minIndex] + weight[j] > weightSum[j]) {
							weightSum[j] = weightSum[minIndex] + weight[j];
							path[j] = minIndex;
						} else if (weightSum[minIndex] + weight[j] == weightSum[j]) {
							int minIndexLevel = getPathLevel(minIndex);
							int jLevel = getPathLevel(minIndex);
							if (jLevel > minIndexLevel + 1) {
								weightSum[j] = weightSum[minIndex] + weight[j];
								path[j] = minIndex;
							}
						}
					}
				}
			}

		}
		// System.out.println(pathNum[romeIndex]);
		// System.out.println(dist[romeIndex]);
		// System.out.println(weightSum[romeIndex]);
		int avg = weightSum[romeIndex] / (getPathLevel(romeIndex)-1);
		System.out.format("%d %d %d %d", pathNum[romeIndex], dist[romeIndex],
				weightSum[romeIndex], avg);
		LinkedList<String> list = new LinkedList<String>();
		System.out.println();
		while (romeIndex != 0) {
			String ss = map2.get(romeIndex);
			list.addFirst(ss);
			romeIndex = path[romeIndex];
		}
		list.addFirst(start);
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.format("->%s", list.get(i));
		}

	}

	private static int getPathLevel(int minIndex) {
		// TODO Auto-generated method stub
		if (minIndex == 0)
			return 1;
		return getPathLevel(path[minIndex]) + 1;
	}

}
