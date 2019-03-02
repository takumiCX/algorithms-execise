package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1019 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int n = Reader.nextInt();

		int radix = Reader.nextInt();

		if (n == 0) {

			System.out.println("Yes");
			System.out.println(0);

		} else {

			List<Integer> list = new ArrayList<Integer>();

			while (n != 0) {
				list.add(n % radix);
				n = n / radix;
			}

			boolean flag = true;

			int i = 0;

			int j = list.size() - 1;

			while (i < j) {
				if (list.get(i) != list.get(j)) {
					flag = false;
					break;
				}
				i++;
				j--;
			}

			if (flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

			StringBuffer sf = new StringBuffer();

			for (int k = list.size() - 1; k >= 0; k--) {
				sf.append(list.get(k)).append(" ");
			}

			System.out.println(sf.toString().trim());

		}

	}

}
