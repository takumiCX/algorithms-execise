package com.takumicx.pat.advance;

public class Main1005 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		String s = Reader.next();

		String[] maps = { "zero", "one", "two", "three", "four", "five", "six",
				"seven", "eight", "nine" };

		long sum = 0;

		for (int i = 0; i < s.length(); i++) {
			sum += Integer.valueOf(s.charAt(i) + "");
		}

		String ss = String.valueOf(sum);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ss.length(); i++) {

			int index = ss.charAt(i) - '0';
			sb.append(maps[index]).append(" ");
		}

		System.out.println(sb.toString().trim());

	}

}
