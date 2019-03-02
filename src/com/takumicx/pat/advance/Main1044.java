package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1044 {

	static int[] arr;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		int total = Reader.nextInt();
		arr = new int[total+1];
		int pay = Reader.nextInt();
		for (int i = 1; i <= total; i++) {
			arr[i] = Reader.nextInt();
		}

		List<String> list = new ArrayList<String>();
		int max = Integer.MAX_VALUE;
		boolean flag = false;
		for (int i =1; i <=total; i++) {
			int sum = 0;
			for (int j = i; j <=total; j++) {
				sum += arr[j];
				if (sum == pay) {
					if (flag) {
						list.add(i + "-" + j);
					} else {
						list.clear();
						flag = true;
						list.add(i + "-" + j);
					}
					break;
				} else if (sum > pay && !flag) {
					if (sum == max) {
						list.add(i + "-" + j);
					} else if (sum < max) {
						max=sum;
						list.clear();
						list.add(i + "-" + j);
					}
					break;
				}
			}
		}
		for(String s:list){
			System.out.println(s);
		}

	}
}
