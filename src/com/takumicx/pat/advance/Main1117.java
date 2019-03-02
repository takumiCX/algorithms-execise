package com.takumicx.pat.advance;

import java.util.Arrays;
import java.util.Comparator;

public class Main1117 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		Integer[] arr = new Integer[total];

		for (int i = 0; i < total; i++) {

			arr[i] = Reader.nextInt();

		}

		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});

		for (int i = 0; i < arr.length; i++) {

			if (i + 1 == arr[i]) {

				System.out.println(arr[i] - 1);

				break;

			} else if (i + 1 > arr[i]) {

				System.out.println(i);
				break;
			}
		}

	}

}
