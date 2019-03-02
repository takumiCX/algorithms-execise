package com.takumicx.pat.advance;


public class Main1007 {

	static int[] arr;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		arr = new int[total];

		for (int i = 0; i < total; i++) {

			arr[i] = Reader.nextInt();

		}

		boolean allNegative = true;
		for (int i = 0; i < total; i++) {
			if (arr[i] >= 0) {
				allNegative = false;
				break;
			}
		}
		if (allNegative) {

			System.out.format("%d %d %d", 0, arr[0], arr[total-1]);

		} else {

			int maxSum = -1;

			int from = 0;

			int end = 0;

			for (int i = 0; i < total; i++) {

				int thisSum = arr[i];
				
				int max=arr[i];

				int thisRight = i;

				for (int j = i + 1; j < total; j++) {
					thisSum+=arr[j];
					if (thisSum> max) {
						max = thisSum;
						thisRight = j;
					}
				}

				if (max > maxSum) {

					maxSum = max;
					from = i;
					end = thisRight;
				} else if (max == maxSum) {
					if (i + thisRight < from + end) {
						from = i;
						end = thisRight;
					}
				}

			}

			System.out.format("%d %d %d", maxSum, arr[from], arr[end]);
		}

	}

}
