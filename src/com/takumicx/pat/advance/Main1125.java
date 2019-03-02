package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1125 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < total; i++) {

			int m = Reader.nextInt();
			list.add(m);
		}

		Collections.sort(list);

		double m = (list.get(0) + list.get(1)) * 1.0 / 2;

		for (int i = 2; i < list.size(); i++) {
			m = (m + list.get(i)) / 2;
		}
		long n = Math.round(m);
		
		System.out.println(n);

	}

}
