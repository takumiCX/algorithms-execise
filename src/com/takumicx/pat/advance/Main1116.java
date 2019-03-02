package com.takumicx.pat.advance;


public class Main1116 {

	static class Node {

		int index;

		boolean checked;

		int rank;

	}

	static Node[] nodes = new Node[10000];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		for (int i = 1; i <= total; i++) {

			int id = Reader.nextInt();

			Node node = new Node();

			node.index = id;

			node.rank = i;

			nodes[id] = node;

		}

		int checkNum = Reader.nextInt();

		for (int i = 0; i < checkNum; i++) {

			int n = Reader.nextInt();

			Node node = nodes[n];

			if (node == null) {
				System.out.format("%04d: Are you kidding?", n);
			} else if (node.checked) {

				System.out.format("%04d: Checked", n);
			} else {

				node.checked = true;

				if (node.rank == 1) {

					System.out.format("%04d: Mystery Award", node.index);

				} else {

					boolean isPrime = isPrime(node.rank);

					if (isPrime) {
						System.out.format("%04d: Minion", n);
					} else {
						System.out.format("%04d: Chocolate", n);
					}

				}

			}
			
			System.out.println();

		}

	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if (n < 2)
			return false;

		for (int j = 2; j <= Math.sqrt(n); j++) {
			if (n % j == 0) {
				return false;
			}
		}

		return true;
	}

}
