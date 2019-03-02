package com.takumicx.pat.advance;

public class Main1010 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		String a = Reader.next();

		String b = Reader.next();

		int tag = Reader.nextInt();

		int radix = Reader.nextInt();

		int c = 0;

		String d = null;

		if (tag == 1) {

			c = Integer.valueOf(a, radix);

			d = b;

		} else {
			c = Integer.valueOf(b, radix);
			d = a;
		}

		int max = 1;

		for (int i = 0; i < d.length(); i++) {

			int n = 0;
			char c1 = d.charAt(i);
			if (c1 >= 'a' && c1 <= 'z') {

				n = c1 - 'a' + 10;

			} else {

				n = c1 - '0';
			}

			if (n > max) {
				max = n;
			}
		}

		boolean flag = false;

		int rad = 0;

		for (int i = max + 1; i <= 36; i++) {
			Integer r = Integer.valueOf(d, i);
			if (r == c) {
				flag = true;
				rad = i;
				break;
			}
		}

		if (flag) {

			System.out.println(rad);

		} else {
			System.out.println("Impossible");
		}

	}

}
