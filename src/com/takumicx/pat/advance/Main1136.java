package com.takumicx.pat.advance;

import java.math.BigInteger;

public class Main1136 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		String s = Reader.next();

		String ss = s;

		boolean flag = false;

		for (int i = 0; i < 10; i++) {

			if (isPalindromic(ss)) {
				flag = true;
				break;
			}

			String rs = new StringBuilder(ss).reverse().toString();

			String last = ss;

			ss = new BigInteger(ss).add(new BigInteger(rs)).toString();

			System.out.format("%s + %s = %s", last, rs, ss);
			System.out.println();
		}
		if (flag) {
			System.out.format("%s is a palindromic number.",ss);
		} else {
			System.out.format("Not found in 10 iterations.");
		}

	}

	private static boolean isPalindromic(String s) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = s.length() - 1;
		boolean flag = true;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		return flag;

	}

}
