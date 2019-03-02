package com.takumicx.pat.advance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class MyReader {

	static BufferedReader reader;
	static StringTokenizer tokenizer;

	static void init() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		tokenizer = new StringTokenizer("");
	}

	static String next() throws Exception {
		while (!tokenizer.hasMoreElements()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws Exception {
		return Integer.valueOf(next());
	}

	static double nextDouble() throws Exception {
		return Double.valueOf(next());
	}

}
