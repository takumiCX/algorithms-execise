package com.takumicx.pat.advance;

import java.util.HashMap;
import java.util.Map;

public class Main1054 {

	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		int n = Reader.nextInt();
		int m = Reader.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int k = Reader.nextInt();
				Integer v = map.get(k);
				if (v == null) {
					map.put(k, 1);
				} else {
					map.put(k, v + 1);
				}
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > m * n / 2) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
