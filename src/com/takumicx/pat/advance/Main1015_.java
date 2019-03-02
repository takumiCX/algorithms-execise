package com.takumicx.pat.advance;

public class Main1015_ {

	public static void main(String[] args) throws Exception {

		MyReader.init();
		int m = MyReader.nextInt();
		while (m >= 0) {
			int temp=m;
			int radix = MyReader.nextInt();
			StringBuilder sb = new StringBuilder();
			while (m != 0) {
				sb.append(m % radix);
				m = m / radix;
			}
			Integer n = Integer.valueOf(sb.toString(), radix);
			boolean flag = isPrime(temp)&&isPrime(n);
			if (flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			m = MyReader.nextInt();
		}
	}

	private static boolean isPrime(Integer n) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
