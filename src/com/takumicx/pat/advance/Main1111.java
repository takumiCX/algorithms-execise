package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1111 {

	static class Node {

		int length;

		int time;

	}

	static int vertexNum = 0;

	static int source = 0;

	static int dest = 0;

	static Node[][] graph;

	static boolean[] collected;

	static int[] dist;

	static int[] time;

	static int[] path;

	static int distance = 0;

	static int totalTime = 0;

	static List<Integer> list1 = new ArrayList<Integer>();

	static List<Integer> list2 = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		vertexNum = Reader.nextInt();
		graph = new Node[vertexNum][vertexNum];

		collected = new boolean[vertexNum];

		dist = new int[vertexNum];

		time = new int[vertexNum];

		path = new int[vertexNum];

		int edgeNum = Reader.nextInt();

		for (int i = 0; i < edgeNum; i++) {

			int from = Reader.nextInt();

			int to = Reader.nextInt();

			int flag = Reader.nextInt();

			int length = Reader.nextInt();

			int time = Reader.nextInt();

			Node node = new Node();

			node.length = length;

			node.time = time;

			graph[from][to] = node;

			if (flag == 0) {
				graph[to][from] = node;
			}
		}

		source = Reader.nextInt();

		dest = Reader.nextInt();

		findShortest();

		findFast();

		boolean flag = true;

		if (list1.size() != list2.size()) {
			flag = false;
		} else {
			for (int i = 0; i < list1.size(); i++) {
				if (list1.get(i) != list2.get(i)) {
					flag = false;
					break;
				}
			}
		}

		if (flag) {

			System.out
					.format("Distance = %d; Time = %d: ", distance, totalTime);

			System.out.print(list1.get(0));

			for (int i = 1; i < list1.size(); i++) {
				System.out.format(" -> %d", list1.get(i));
			}
		} else {

			System.out.format("Distance = %d: ", distance);

			System.out.print(list1.get(0));

			for (int i = 1; i < list1.size(); i++) {

				System.out.format(" -> %d", list1.get(i));
			}

			System.out.println();
			System.out.format("Time = %d: ", totalTime);

			System.out.print(list2.get(0));

			for (int i = 1; i < list2.size(); i++) {

				System.out.format(" -> %d", list2.get(i));
			}

		}

	}

	private static void findPath(int dest1, List<Integer> list1) {
		// TODO Auto-generated method stub

		if (path[dest1] != dest1) {
			findPath(path[dest1], list1);
			list1.add(dest1);
		} else {
			list1.add(dest1);
		}

	}

	private static void findFast() {
		// TODO Auto-generated method stub

		init();

		while (true) {

			int index = -1;
			int min = Integer.MAX_VALUE;

			for (int i = 0; i < vertexNum; i++) {

				if (!collected[i] && time[i] < min) {
					index = i;
					min = time[i];
				}

			}

			if (index == dest) {
				break;
			}

			collected[index] = true;

			for (int i = 0; i < vertexNum; i++) {

				Node node = graph[index][i];

				if (collected[i] || node == null)
					continue;

				if (node.time + time[index] < time[i]) {

					time[i] = node.time + time[index];

					path[i] = index;

					dist[i] = dist[index] + node.length;

				} else if (node.time + time[index] == time[i]
						&& node.length + dist[index] < dist[i]) {

					dist[i] = node.length + dist[index];

					path[i] = index;

				}

			}

		}

		findPath(dest, list2);

		totalTime = time[dest];

	}

	private static void findShortest() {
		// TODO Auto-generated method stub

		init();

		while (true) {

			int index = -1;
			int min = Integer.MAX_VALUE;

			for (int i = 0; i < vertexNum; i++) {

				if (!collected[i] && dist[i] < min) {
					index = i;
					min = dist[i];
				}

			}

			if (index == dest) {
				break;
			}

			collected[index] = true;

			for (int i = 0; i < vertexNum; i++) {

				Node node = graph[index][i];

				if (collected[i] || node == null)
					continue;

				if (node.length + dist[index] < dist[i]) {

					dist[i] = node.length + dist[index];

					path[i] = index;

					time[i] = time[index] + node.time;

				} else if (node.length + dist[index] == dist[i]
						&& node.time + time[index] < time[i]) {

					time[i] = node.time + time[index];

					path[i] = index;

				}

			}

		}

		findPath(dest, list1);

		distance = dist[dest];

	}

	private static void init() {
		// TODO Auto-generated method stub

		// static boolean[] visited;
		//
		// static int[] dist;
		//
		// static int[] time;
		//
		// static int[] path;

		for (int i = 0; i < vertexNum; i++) {

			collected[i] = false;

			dist[i] = Integer.MAX_VALUE;

			path[i] = i;

		}

		dist[source] = 0;

		time[source] = 0;

	}
}
