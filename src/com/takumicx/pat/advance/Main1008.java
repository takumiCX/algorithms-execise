package com.takumicx.pat.advance;

public class Main1008 {

	static int[] arr;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		arr = new int[total+1];

		arr[0] = 0;

		for (int i = 1; i <= total; i++) {

			arr[i] = Reader.nextInt();
		}

		int time = 0;

		for (int i = 1; i <= total; i++) {

			if (arr[i] > arr[i - 1]) {

				time += Math.abs(arr[i] - arr[i - 1]) * 6;

			} else {

				time += Math.abs(arr[i] - arr[i - 1]) * 4;
			}
			time += 5;

		}

		System.out.println(time);

	}

}
