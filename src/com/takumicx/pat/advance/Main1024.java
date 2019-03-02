package com.takumicx.pat.advance;

import java.math.BigInteger;

public class Main1024 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		String s = Reader.next();

		int maxStep = Reader.nextInt();

		BigInteger bg = new BigInteger(s);

		boolean flag = false;

		int count = 0;

		if (isPalin(s)) {
			System.out.println(s);
			System.out.println(0);
		} else {
			for (int i = 0; i < maxStep; i++) {
				count++;
				bg = bg.add(new BigInteger(new StringBuilder(bg.toString())
						.reverse().toString()));
				flag = isPalin(bg.toString());
				if (flag) {
					break;
				}

			}

			System.out.println(bg.toString());
			System.out.println(count);
		}

	}

	private static boolean isPalin(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
