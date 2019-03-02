package com.takumicx.pat.advance;


public class Main1029 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int[] arrM;

		int[] arrN;

		int m = Reader.nextInt();

		arrM = new int[m];
		for (int i = 0; i < m; i++) {
			arrM[i] = Reader.nextInt();
		}
		
		int n = Reader.nextInt();
		arrN = new int[n];

		for (int i = 0; i < n; i++) {
			arrN[i] = Reader.nextInt();
		}

		int mid = (m + n) % 2 == 0 ? (m + n) / 2 : (m + n + 1) / 2;

		int count = 0;

		int num = 0;

		for (int i = 0, j = 0;;) {
			count++;
			if (arrM[i] < arrN[j]) {
				if (count == mid) {
					num = arrM[i];
					break;
				}
				i++;
			} else {
				if (count == mid) {
					num = arrN[j];
					break;
				}
				j++;
			}
		}
		
		System.out.println(num);

	}

}
