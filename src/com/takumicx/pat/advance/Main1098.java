package com.takumicx.pat.advance;

public class Main1098 {

	static int total = 0;
	static int[] initArr;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		MyReader.init();
		int total = MyReader.nextInt();
		initArr = new int[total + 1];
		arr = new int[total + 1];
		for (int i = 1; i <= total; i++) {
			initArr[i] = MyReader.nextInt();
		}
		for (int i = 1; i <= total; i++) {
			arr[i] = MyReader.nextInt();
		}
		int max = 0;
		for (int i = 1; i <= total; i++) {
			if (initArr[i] > max) {
				max = initArr[i];
			}
		}

		if (arr[total] == max) {
			System.out.println("Heap Sort");
			int index = 0;
			for (int i = total; i > 1; i--) {
				if (arr[i] <arr[1]) {
					index = i;
					break;
				}
			}
			int temp = arr[index];
			arr[index] = arr[1];
			arr[1] = temp;
			down(1, index-1);

		} else {
			System.out.println("Insertion Sort");
			int index = 0;
			for (int i = 2; i <= total; i++) {
				if (arr[i] < arr[i - 1]) {
					index = i;
					break;
				}
			}
			int temp = arr[index];
			index--;
			while (index >= 1 && arr[index] > temp) {
				arr[index + 1] = arr[index];
				index--;
			}
			index++;
			arr[index] = temp;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= total; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb.toString().trim());

	}

	private static void down(int i, int index) {
		// TODO Auto-generated method stub
		int j = i;
		if (i * 2 <= index) {
			if (arr[i * 2] > arr[i]) {
				j = i * 2;
			}
		}
		if (i * 2 + 1 <= index) {
			if (arr[i * 2 + 1] > arr[i * 2]) {
				j = i * 2 + 1;
			}
		}
		if (j != i) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			down(j, index);
		}

	}

}
