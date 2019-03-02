package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1124 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		int distance = Reader.nextInt();

		int firstIndex = Reader.nextInt();

		if (total < firstIndex) {
			
			System.out.println("Keep going...");

		} else {

			List<String> list = new ArrayList<String>();

			int count = 0;

			for (int i = 1; i <= total; i++) {

				String ss = Reader.next();

				if (i < firstIndex)
					continue;

				if (i == firstIndex) {
					list.add(ss);
					continue;
				}

				count++;
				if (count % distance == 0) {

					if (list.contains(ss)) {
						count--;

					} else {

						list.add(ss);
						count = 0;

					}

				}
			}

			for (String s : list) {
				System.out.println(s);
			}
		}

	}
}
