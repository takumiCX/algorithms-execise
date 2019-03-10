package com.takumicx.pat.advance;

public class Main1132 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		for (int i = 0; i < total; i++) {

			String s = Reader.next();

			Integer k = Integer.valueOf(s);

			Integer m = Integer.valueOf(s.substring(0, s.length() / 2));

			Integer n = Integer
					.valueOf(s.substring(s.length() / 2, s.length()));

			boolean flag;
			try {
				double d = k * 1.0 / (m * n);

				int d2 = k / (m * n);

				flag = d == d2;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				flag=false;
			}

			if (flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}

}
