package com.takumicx.pat.advance;

public class Main1015 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int n = Reader.nextInt();
		
		while (n >= 0) {
			
			int m=n;

			int radix = Reader.nextInt();

			String s = "";

			while (n != 0) {
				s = s + (n % radix);
				n = n / radix;
			}

			boolean valid = true;

			String ss = String.valueOf(n);

			for (int i = 0; i < ss.length(); i++) {
				if (ss.charAt(i) <= radix) {
					valid = false;
					break;
				}
			}
			if (valid) {

				boolean prime = isPrime(m)
						&& isPrime(Integer.valueOf(s, radix));

				if (prime) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}

			} else {

				System.out.println("No");

			}

			n = Reader.nextInt();

		}

	}

	private static boolean isPrime(Integer i) {
		// TODO Auto-generated method stub

		if (i < 2)
			return false;

		for (int j = 2; j <= Math.sqrt(i); j++) {

			if (i % j == 0) {
				return false;
			}
		}

		return true;

	}

}
