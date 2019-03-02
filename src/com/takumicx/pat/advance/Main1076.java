package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1076 {

	static int[][] graph =null;

	static int total = 0;

	static int level = 0;

	static boolean visited[] =null;

	static BlockingQueue<Node> queue = new LinkedBlockingQueue<Node>();

	static class Node {

		int i;

		int level;
	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		total = Reader.nextInt();
		
		graph=new int[total+1][total+1];
		
		visited=new boolean[total+1];

		level = Reader.nextInt();

		for (int i = 1; i <= total; i++) {

			int num = Reader.nextInt();

			if (num == 0)
				continue;

			for (int j = 0; j < num; j++) {

				int k = Reader.nextInt();

				graph[k][i] = 1;

			}

		}
		
		int n = Reader.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < visited.length; j++) {
				visited[j] = false;
			}
			int index = Reader.nextInt();

			List<Integer> list = new ArrayList<Integer>();

			cal(index, list);

			System.out.println(list.size());

		}

	}

	private static void cal(int index, List<Integer> list) throws Exception {
		// TODO Auto-generated method stub

		visited[index] = true;

		Node node = new Node();

		node.i = index;

		node.level = 0;

		queue.add(node);

		while (!queue.isEmpty()) {

			Node node2 = queue.take();

			for (int j = 1; j <= total; j++) {

				if (graph[node2.i][j] == 1 && !visited[j]) {

					int thisLevel = node2.level + 1;

					if (thisLevel <= level) {

						Node node3 = new Node();

						node3.i = j;

						node3.level = thisLevel;

						queue.add(node3);

						visited[j] = true;

						list.add(j);

					}
				}

			}

		}

	}

}
