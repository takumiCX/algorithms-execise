package com.takumicx.pat.advance;



public class Main1002 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		double[] d1 = new double[1001];

		double[] d2 = new double[1001];

		double[] res = new double[1001];

		int n1 = Reader.nextInt();

		for (int i = 0; i < n1; i++) {

			int index = Reader.nextInt();

			double d = Reader.nextDouble();

			d1[index] = d;

		}

		int n2 = Reader.nextInt();

		for (int i = 0; i < n2; i++) {

			int index = Reader.nextInt();

			double d = Reader.nextDouble();

			d2[index] = d;

		}

		int count = 0;
		for (int i = 0; i < res.length; i++) {

			double d3 = d1[i] + d2[i];

			if (d3 != 0) {
				res[i] = d3;
				count++;
			}

		}
		if(count==0){
			
			System.out.println(count+" "+0+" "+0);
			
			return;
		}

		System.out.print(count + " ");

		for (int j = res.length - 1; j >= 0; j--) {

			if(res[j]!=0){
				count--;
				System.out.print(j + " ");
				System.out.format("%.1f", res[j]);
				if (count != 0) {
					System.out.print(" ");
				}
			}

		}

	}

}
