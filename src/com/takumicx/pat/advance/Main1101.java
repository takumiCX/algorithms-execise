package com.takumicx.pat.advance;

public class Main1101 {

	static int[] arr;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		arr = new int[total];

		for (int i = 0; i < total; i++) {
			arr[i] = Reader.nextInt();
		}

		int[] minArr = new int[total];
		int[] maxArr = new int[total];

		maxArr[0] = arr[0];

		for (int i = 1; i < total; i++) {

			if (arr[i] > maxArr[i - 1]) {
				maxArr[i] = arr[i];
			} else {
				maxArr[i] = maxArr[i - 1];
			}

		}

		minArr[total - 1] = arr[total - 1];

		for (int i = total - 2; i >= 0; i--) {

			if (arr[i] < minArr[i + 1]) {
				minArr[i] = arr[i];
			} else {
				minArr[i] = minArr[i + 1];
			}

		}

		int count = 0;

		int index = 0;

		for (int i = 0; i < total; i++) {

			if (arr[i] >= maxArr[i] && arr[i] <= minArr[i]) {
				arr[index++] = arr[i];
				count++;
			}

		}

		System.out.println(count);

		for (int i = 0; i < count - 1; i++) {
			System.out.format("%d ", arr[i]);
		}

		System.out.format("%d", arr[count - 1]);

		System.out.println();

	}
}
