package com.takumicx.pat.advance;

import java.util.Arrays;

public class Main1113 {

	static int[] arr;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		arr = new int[total];

		for (int i = 0; i < total; i++) {

			arr[i] = Reader.nextInt();

		}

		Arrays.sort(arr);

		if (total % 2 == 0) {

			long sum1 = 0;

			for (int i = 0; i <= (total - 1) / 2; i++) {

				sum1 += arr[i];
			}

			long sum2 = 0;

			for (int i = (total - 1) / 2+1; i < total; i++) {
				sum2 += arr[i];
			}

			System.out.format("0 %d", sum2 - sum1);

		} else {

			long sum1 = 0;

			for (int i = 0; i < (total - 1) / 2; i++) {

				sum1 += arr[i];

			}

			long sum2 = 0;

			for (int i = (total - 1) / 2; i < total; i++) {

				sum2 += arr[i];
			}

			System.out.format("1 %d", sum2 - sum1);

		}

	}
}
