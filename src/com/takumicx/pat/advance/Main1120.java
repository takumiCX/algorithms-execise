package com.takumicx.pat.advance;

public class Main1120 {

	static boolean[] res = new boolean[10001];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		for (int i = 0; i < total; i++) {

			String s = Reader.next();

			int sum = 0;

			for (int k = 0; k < s.length(); k++) {
				sum += s.charAt(k) - '0';
			}

			res[sum] = true;
		}

		StringBuilder sb = new StringBuilder();

		int count = 0;

		for (int i = 0; i < res.length; i++) {
			if (res[i]) {
				count++;
				sb.append(i).append(" ");
			}
		}

		System.out.println(count);

		System.out.println(sb.toString().trim());

	}

}
