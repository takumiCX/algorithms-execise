package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1110 {

	static class Node {

		int index;

		int left;

		int right;
	}

	static Node[] nodes;

	static int[] res;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		nodes = new Node[total];

		res = new int[total * 2];

		for (int i = 1; i < total + 1; i++) {
			res[i] = -1;
		}

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < total; i++) {

			Node node = new Node();

			node.index = i;

			String a = Reader.next();

			String b = Reader.next();

			if (a.equals("-")) {
				node.left = -1;

			} else {
				node.left = Integer.valueOf(a);
				list.add(Integer.valueOf(a));
			}

			if (b.equals("-")) {
				node.right = -1;
			} else {
				node.right = Integer.valueOf(b);
				list.add(Integer.valueOf(b));

			}
			nodes[i]=node;
		}

		int root = -1;

		for (int i = 0; i < total; i++) {
			if (!list.contains(i)) {
				root = i;
				break;
			}
		}

		res[1] = root;

		fill(nodes[root],1);

		boolean flag = true;

		for (int i = 1; i <= total; i++) {
			if (res[i] == -1) {
				flag = false;
				break;
			}
		}

		if (flag) {

			System.out.format("YES %d", res[total]);

		} else {

			System.out.format("NO %d", root);
		}

	}

	private static void fill(Node node, int i) {
		// TODO Auto-generated method stub
		
		if(node.left!=-1){
			res[i*2]=node.left;
			fill(nodes[node.left], i*2);
		}
		
		if(node.right!=-1){
			res[i*2+1]=node.right;
			fill(nodes[node.right], i*2+1);
		}
		
	}

}
