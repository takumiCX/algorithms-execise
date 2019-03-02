package com.takumicx.pat.advance;

public class Main1104 {

	static double[] arr;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		arr = new double[total];

		for (int i = 0; i < total; i++) {

			arr[i] = Reader.nextDouble();
		}

		double sum = 0.0;

		for (int i = 0; i < total; i++) {
			double sum1 = 0.0;
			for (int j = i; j < total; j++) {

				sum1 += (total - j)*arr[j];

			}
			
//			System.out.println(sum1);

			sum += sum1;
		}
		
		System.out.format("%.2f", sum);

	}

}
