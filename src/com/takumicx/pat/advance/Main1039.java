package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1039 {

	static Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		int sNum = Reader.nextInt();
		int cNum = Reader.nextInt();
		for (int i = 0; i < cNum; i++) {
			int cIndex = Reader.nextInt();
			int m = Reader.nextInt();
			for (int j = 0; j < m; j++) {
				String name = Reader.next();
				List<Integer> list = map.get(name);
				if (list == null) {
					List<Integer> list2 = new ArrayList<Integer>();
					list2.add(cIndex);
					map.put(name, list2);
				} else {
					list.add(cIndex);
					map.put(name, list);
				}
			}
		}
		for (int i = 0; i < sNum; i++) {
			String name = Reader.next();
			List<Integer> list = map.get(name);
			if (list == null || list.size() == 0) {
				System.out.println(name + " " + 0);
			} else {
				System.out.print(name + " " + list.size());
				Collections.sort(list, new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o1 - o2;
					}
				});
				for (Integer m : list) {
					System.out.print(" " + m);
				}
				System.out.println();
			}
		}
	}

}
