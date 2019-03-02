package com.takumicx.pat;

public class Sort {

	static int[] arr;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		arr = new int[total];

		for (int i = 0; i < total; i++) {

			int n = Reader.nextInt();

			arr[i] = n;

		}

		// quickSort(arr, 0, total - 1);

		// bubbleSort(arr,0,total-1);

		selectSort(arr, 0, total - 1);

		// System.out.println(Arrays.toString(arr));

		for (int i = 0; i < total - 1; i++) {
			System.out.format("%d ", arr[i]);
		}
		System.out.format("%d", arr[total - 1]);

	}

	private static void selectSort(int[] arr2, int left, int right) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= right; i++) {

			int index = i;

			int min = arr[i];

			for (int j = i + 1; j <= right; j++) {

				if (arr[j] < min) {
					index = j;
					min = arr[j];
				}

			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}

	}

	private static void bubbleSort(int[] arr2, int left, int right) {
		// TODO Auto-generated method stub

		for (int i = right; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}

		}

	}

	private static void quickSort(int[] arr2, int i, int j) {
		// TODO Auto-generated method stub

		if (i >= j)
			return;

		int pivot = partition(arr2, i, j);

		quickSort(arr2, i, pivot - 1);
		quickSort(arr2, pivot + 1, j);

	}

	private static int partition(int[] arr2, int i, int j) {
		// TODO Auto-generated method stub

		int temp = arr2[i];

		while (i < j) {

			while (i < j && arr2[j] > temp) {
				j--;
			}
			if (i < j) {
				arr2[i] = arr2[j];
			}

			while (i < j && arr2[i] <= temp) {
				i++;
			}
			if (i < j) {
				arr2[j] = arr2[i];
			}

		}
		arr2[i] = temp;

		return i;

	}

}
