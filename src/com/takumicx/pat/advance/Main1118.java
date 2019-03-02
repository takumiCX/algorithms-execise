package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1118 {

	static int[] birds = new int[10001];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int pictrueNum = Reader.nextInt();

		for (int i = 0; i < pictrueNum; i++) {

			int birdNum = Reader.nextInt();

			if (birdNum > 0) {

				int n = Reader.nextInt();

				if (birds[n] == 0) {
					birds[n] = n;
				}

				for (int j = 0; j < birdNum - 1; j++) {

					int m = Reader.nextInt();
					if (birds[m] == 0) {
						birds[m] = m;
					}

					union(n, m);

				}

			}

		}

		for (int i = 1; i < birds.length; i++) {
			if (birds[i] != 0)
				findFather(i);
		}

		int treeNum = 0;

		int birdNum = 0;

		for (int i = 1; i < birds.length; i++) {
			if (birds[i] == i) {
				treeNum++;
			}

			if (birds[i] != 0) {
				birdNum++;
			}

		}

		int checkNum = Reader.nextInt();

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < checkNum; i++) {

			int f1 = findFather(Reader.nextInt());

			int f2 = findFather(Reader.nextInt());

			if (f1 == f2) {
				list.add("Yes");
			} else {
				list.add("No");
			}
		}

		System.out.format("%d %d", treeNum, birdNum);

		System.out.println();

		for (String s : list) {
			System.out.println(s);
		}

	}

	private static void union(int n, int m) {
		// TODO Auto-generated method stub

		int f1 = findFather(n);

		int f2 = findFather(m);

		if (f1 < f2) {

			birds[f2] = f1;

		} else {

			birds[f1] = f2;
		}

	}

	private static int findFather(Integer i) {
		// TODO Auto-generated method stub

		if (i != birds[i]) {
			int father = findFather(birds[i]);
			birds[i] = father;

			return father;

		} else {

			return i;

		}

	}

}
