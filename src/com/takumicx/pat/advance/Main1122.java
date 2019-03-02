package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1122 {

	static boolean[][] graph = new boolean[201][201];

	static int vNum;

	static int eNum;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		vNum = Reader.nextInt();
		eNum = Reader.nextInt();
		for (int i = 0; i < eNum; i++) {

			int m = Reader.nextInt();
			int n = Reader.nextInt();
			graph[m][n] = true;
			graph[n][m] = true;
		}
		int checkNum = Reader.nextInt();
		for (int i = 0; i < checkNum; i++) {
			check();
		}

	}

	private static void check() throws Exception {
		// TODO Auto-generated method stub

		int num = Reader.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			int m = Reader.nextInt();
			list.add(m);
		}

		boolean flag = true;

		if (num != vNum + 1) {
			flag = false;
		} else if (list.get(0) != list.get(list.size() - 1)) {
			flag = false;
		} else {

			boolean[] arr = new boolean[201];

			for (int j = 0; j < list.size() - 1; j++) {

				if (arr[list.get(j)]) {
					flag = false;
					break;
				} else {
					arr[list.get(j)] = true;
				}

				if (!graph[list.get(j)][list.get(j+1)]) {
					flag = false;
					break;
				}

			}

		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
