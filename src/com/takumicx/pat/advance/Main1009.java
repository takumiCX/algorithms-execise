package com.takumicx.pat.advance;

public class Main1009 {

	static double[] arr1 = new double[2001];

	static double[] arr2 = new double[2001];

	static double[] res = new double[2001];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int n1 = Reader.nextInt();

		for (int i = 1; i <= n1; i++) {

			int zhishu = Reader.nextInt();

			double xishu = Reader.nextDouble();

			arr1[zhishu] = xishu;

		}

		int n2 = Reader.nextInt();

		for (int i = 1; i <= n2; i++) {

			int zhishu = Reader.nextInt();
			double xishu = Reader.nextDouble();
			arr2[zhishu] = xishu;
		}

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] == 0)
				continue;

			for (int j = 0; j < arr2.length; j++) {

				if (arr2[j] == 0)
					continue;

				int zhishu = i + j;

				res[zhishu] += arr1[i] * arr2[j];

			}

		}


		int count = 0;

		for (int i = 0; i < res.length; i++) {
			if (res[i] != 0)
				count++;
		}

		if (count == 0) {
			
			System.out.println("0");
			
		} else {

			System.out.print(count);

			for (int i = res.length - 1; i >= 0; i--) {

				if(res[i]!=0){
					System.out.format(" %d %.1f", i, res[i]);
				}

			}

		}
	}
	
}
