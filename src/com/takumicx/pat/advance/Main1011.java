package com.takumicx.pat.advance;

public class Main1011 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		double sum = 0.65;

		for (int i = 0; i < 3; i++) {

			double n = 0;

			String s = null;

			for (int j = 0; j < 3; j++) {

				double d = Reader.nextDouble();
				if (d > n) {
					n = d;
					if (j == 0) {
						s = "W";
					} else if (j == 1) {
						s = "T";
					} else {
						s = "L";
					}
				}

			}

			System.out.format("%s ", s);
			sum *= n;
		}
		System.out.format("%.2f", (sum - 1) * 2);

		// System.out.format("%.2f", (4.1 * 3.0 * 2.5 * 0.65 - 1) * 2);

	}
}
