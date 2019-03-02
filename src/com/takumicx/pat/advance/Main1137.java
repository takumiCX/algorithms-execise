package com.takumicx.pat.advance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1137 {

	static class Node {
		String id;
		int gp = -1;
		int gm = -1;
		int gf = -1;
		int g = -1;
	}

	static Map<String, Node> map = new HashMap<String, Node>();

	public static void main(String[] args) throws IOException {

		Reader.init(System.in);

		int m = Reader.nextInt();

		int n = Reader.nextInt();

		int k = Reader.nextInt();

		for (int i = 0; i < m; i++) {
			String id = Reader.next();
			int score = Reader.nextInt();
			Node node = map.get(id);
			if (node == null) {
				Node node2 = new Node();
				node2.id = id;
				node2.gp = score;
				map.put(id, node2);
			}
		}

		for (int i = 0; i < n; i++) {
			String id = Reader.next();
			int score = Reader.nextInt();
			Node node = map.get(id);
			if (node == null) {
				Node node2 = new Node();
				node2.id = id;
				node2.gm = score;
				map.put(id, node2);
			} else {
				node.gm = score;
			}
		}

		for (int i = 0; i < k; i++) {
			String id = Reader.next();
			int score = Reader.nextInt();
			Node node = map.get(id);
			if (node == null) {
				Node node2 = new Node();
				node2.id = id;
				node2.gf = score;
				map.put(id, node2);
			} else {
				node.gf = score;
			}
		}

		List<Node> list = new ArrayList<Node>();

		for (Map.Entry<String, Node> entry : map.entrySet()) {
			String key = entry.getKey();
			Node value = entry.getValue();
			if (value.gp >= 200) {
				if (value.gm > value.gf) {
					value.g = (int) Math.round(value.gm * 0.4 + value.gf * 0.6);
				} else {
					value.g = value.gf;
				}
				if(value.g>=60){
					list.add(value);
				}
			}
		}
		
		Collections.sort(list,new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				if(o2.g==o1.g){
					return o1.id.compareTo(o2.id);
				}else{
					return o2.g-o1.g;
				}
			}
		});
		
		
		for(Node node:list){
			
			System.out.format("%s %d %d %d %d",node.id,node.gp,node.gm,node.gf,node.g);
			System.out.println();
		}

	}

}
