package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1046 {

	static int[] arr;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		arr = new int[total + 1];
		int sum = 0;
		for (int i = 1; i <= total; i++) {
			arr[i] = Reader.nextInt();
			sum += arr[i];
		}

		int num = Reader.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			int start = Reader.nextInt();
			int end = Reader.nextInt();
			if (end < start) {
				int temp = start;
				start = end;
				end = temp;
			}
			int sum1 = 0;
			for (int j = start; j < end; j++) {
				sum1 += arr[j];
			}
			sum1 = sum1 > (sum - sum1) ? (sum - sum1) : sum1;
			list.add(sum1);
		}
		for(Integer i:list){
			System.out.println(i);
		}

	}

}
