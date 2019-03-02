package com.takumicx.pat.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1005 {

	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		List<Integer> list2 = new ArrayList<Integer>();

		int total = Reader.nextInt();

		for (int i = 0; i < total; i++) {

			int n = Reader.nextInt();

			list2.add(n);

			valid(n);

		}

		StringBuilder sb = new StringBuilder();
		
		Collections.sort(list2,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});

		for (Integer i : list2) {

			if (!list.contains(i)) {
				sb.append(i + " ");
			}

		}

		System.out.println(sb.toString().trim());

	}

	private static void valid(int n) {
		// TODO Auto-generated method stub

		if (list.contains(n)) {
			return;
		}

		while (n != 1) {

			if (n % 2 == 0) {

				n /= 2;

			} else {

				n = (n * 3 + 1) / 2;
			}

			if (list.contains(n)) {

				return;

			} else {

				list.add(n);
			}

		}

	}

}
