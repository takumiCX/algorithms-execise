package com.takumicx.pat.advance;

import java.io.IOException;
import java.util.Scanner;

public class Main1040 {

	static String s;

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		s = scanner.nextLine();
		int max = 1;

		for (int i = 0; i < s.length() / 2; i++) {

			int end = s.length() - 1;
			while (true) {
				int j = getIndex(i, end);
				int m = i;
				int n = j;
				boolean flag = true;
				while (m < n) {
					if (s.charAt(m) != s.charAt(n)) {
						flag = false;
						break;
					}
					m++;
					n--;
				}
				if (flag) {
					int k = j - i + 1;
					if (k > max) {
						max = k;
					}
				}
				if (j == i) {
					break;
				} else {
					end = end - 1;
				}
			}

		}
		System.out.println(max);
	}

	private static Integer getIndex(int i, int end) {
		// TODO Auto-generated method stub
		for (int j = end; j > i; j--) {
			if (s.charAt(i) == s.charAt(j)) {
				return j;
			}
		}
		return i;
	}
}
