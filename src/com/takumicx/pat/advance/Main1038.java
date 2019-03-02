package com.takumicx.pat.advance;

import java.math.BigInteger;

public class Main1038 {

	static String[] split;

	static BigInteger min = null;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		int total = Reader.nextInt();
		split = new String[total];
		for (int i = 0; i < total; i++) {
			split[i] = Reader.next();
		}
		arrange(split, 0);

		String s = min.toString();
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0') {
				index = i;
				break;
			}
		}
		System.out.println(s.substring(index));

	}

	private static void arrange(String[] list2, int i) {
		// TODO Auto-generated method stub
		if (i == list2.length - 1) {
			StringBuilder sb = new StringBuilder();
			for (String s : list2) {
				sb.append(s);
			}
			BigInteger m = new BigInteger(sb.toString());
			if (min == null) {
				min = m;
			} else if (m.compareTo(min) < 0) {
				min = m;
			}
		} else {
			for (int j = i; j < list2.length; j++) {
				swap(i, j);
				arrange(list2, i + 1);
				swap(i, j);
			}
		}

	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		String s = split[i];
		split[i] = split[j];
		split[j] = s;

	}

}
