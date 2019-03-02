package com.takumicx.pat.advance;

public class Main1090 {

	static int[] arr = new int[100000];
	static int[] height = new int[100000];

	public static void main(String[] args) throws Exception {

		MyReader.init();
		int total = MyReader.nextInt();
		double rootPrice = MyReader.nextDouble();
		double priceIncrement = MyReader.nextDouble();
		for (int i = 0; i < total; i++) {
			arr[i] = MyReader.nextInt();
		}
		int maxHeight = 0;
		int num = 0;
		for (int i = 0; i < total; i++) {
			int height = getHeight(i);
			if (height > maxHeight) {
				maxHeight = height;
				num = 1;
			} else if (height == maxHeight) {
				num += 1;
			}
		}
		double p = rootPrice
				* Math.pow(1 + priceIncrement / 100, maxHeight - 1);
		System.out.format("%.2f %d", p, num);

	}

	private static int getHeight(int i) {
		// TODO Auto-generated method stub
		if (i == -1)
			return 0;
		if (height[i] != 0) {
			return height[i];
		} else {
			int h = getHeight(arr[i]) + 1;
			height[i] = h;
			return h;
		}

	}

}
