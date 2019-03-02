package com.takumicx.pat.advance;

public class Main1027 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int m = Reader.nextInt();
		int n = Reader.nextInt();
		int k = Reader.nextInt();

		String s = convert(m);
		String ss = convert(n);
		String sss = convert(k);
		System.out.println("#" + s + ss + sss);

	}

	private static String convert(int m) {
		// TODO Auto-generated method stub

		String s = "";
		while (m != 0) {
			int n = m % 13;
			String ss = "";
			if (n == 10) {
				ss = "A";
			} else if (n == 11) {
				ss = "B";
			} else if (n == 12) {
				ss = "C";
			} else {
				ss = ss + n;
			}
			s = ss + s;
			m /= 13;
		}
		if (s.length() == 1) {
			return 0 + s;
		}
		if (s.length() == 0) {
			return "00";
		}
		return s;
	}

}
