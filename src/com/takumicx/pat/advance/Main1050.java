package com.takumicx.pat.advance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1050 {

	static boolean[] arr = new boolean[256];

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String s = reader.readLine();

		String ss = reader.readLine();
		for (int i = 0; i < ss.length(); i++) {
			arr[ss.charAt(i)] = true;
		}
		for (int i = 0; i < s.length(); i++) {
			if (!arr[s.charAt(i)]) {
				System.out.print(s.charAt(i));
			}
		}

	}
}
