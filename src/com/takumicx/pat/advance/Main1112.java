package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1112 {

	public static <E> void main(String[] args) throws Exception {

		Reader.init(System.in);

		int k = Reader.nextInt();

		String s = Reader.next();

		List<String> list = new ArrayList<String>();

		Set<String> set2 = new HashSet<String>();

		int count = 1;

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;

			} else {

				if (count % k != 0) {
					set2.add(s.charAt(i - 1) + "");
				}

				count = 1;
			}
		}
		for (int i = 0; i < s.length(); i++) {

			String ss = s.charAt(i) + "";

			if (!set2.contains(ss) && !list.contains(ss)) {
				list.add(ss);
			}

		}

		// System.out.println(set2);

		for (String ss : list) {
			
			System.out.print(ss);

			StringBuffer buffer = new StringBuffer();

			for (int i = 0; i < k; i++) {

				buffer.append(ss);
			}

			s = s.replaceAll(buffer.toString(), ss);

		}
		
		System.out.println();
		
		System.out.println(s);

	}
}
