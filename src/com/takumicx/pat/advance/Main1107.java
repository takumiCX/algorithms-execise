package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1107 {

	static int[] personCount;

	static int[] hobby2persion = new int[1001];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();
		
		personCount=new int[total+1];

		for (int i = 1; i <= total; i++) {

			String s = Reader.next();

			Integer n = Integer.valueOf(s.substring(0, s.length() - 1));

			Set<Integer> set = new HashSet<Integer>();
			
			for (int j = 0; j < n; j++) {

				int m = Reader.nextInt();
				if (hobby2persion[m] == 0) {
					hobby2persion[m] = i;
					set.add(i);

				} else {

					set.add(hobby2persion[m]);

				}
			}
			for (Integer in : set) {

				personCount[in]++;

			}
		}

		Arrays.sort(personCount);

		List<Integer> list = new ArrayList<Integer>();

		for (int i = total; i >= 0; i--) {

			if (personCount[i] != 0) {
				list.add(personCount[i]);
			}
			if (personCount[i] == 1)
				break;

		}

		System.out.println(list.size());

		for (int i = 0; i < list.size() - 1; i++) {

			System.out.format("%d ", list.get(i));
		}

		System.out.format("%d", list.get(list.size() - 1));
	}

}
