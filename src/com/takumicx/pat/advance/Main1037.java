package com.takumicx.pat.advance;

import java.util.Arrays;

public class Main1037 {

	static int[] arr1;

	static int[] arr2;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		int m = Reader.nextInt();
		arr1 = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = Reader.nextInt();
		}
		int n = Reader.nextInt();
		arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = Reader.nextInt();
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		int sum = 0;
		while (i < arr1.length && j < arr2.length && arr1[i] < 0 && arr2[j] < 0) {
			sum += arr1[i] * arr2[i];
			i++;
			j++;
		}
		i = arr1.length - 1;
		j = arr2.length - 1;
		while (i >= 0 && j >= 0 && arr1[i] > 0 && arr2[j] > 0) {
			sum += arr1[i] * arr2[j];
			i--;
			j--;
		}
		System.out.println(sum);
	}
}
