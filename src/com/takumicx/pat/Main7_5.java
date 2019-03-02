package com.takumicx.pat;

public class Main7_5 {

	static int[] nodes = new int[1001];

	static int size = 0;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		int checkNum = Reader.nextInt();

		for (int i = 0; i < total; i++) {

			nodes[++size] = Reader.nextInt();

			up();

		}

		for (int i = 0; i < checkNum; i++) {

			printPath(Reader.nextInt());

		}

	}

	private static void printPath(int i) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();

		while (i >= 1) {

			sb.append(nodes[i]).append(" ");

			i /= 2;

		}
		
		System.out.println(sb.toString().trim());

	}

	private static void up() {
		// TODO Auto-generated method stub

		int temp = nodes[size];

		int i = size;

		while (i / 2 >= 1 && nodes[i / 2] > temp) {

			nodes[i] = nodes[i / 2];

			i /= 2;
		}

		nodes[i] = temp;

	}

}
