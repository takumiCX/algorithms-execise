package com.takumicx.pat.advance;

import java.util.Stack;

public class Main1051_ {

	static int capacity = 0;
	static int total = 0;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		capacity = Reader.nextInt();
		total = Reader.nextInt();
		int num = Reader.nextInt();
		for (int i = 0; i < num; i++) {
			boolean flag = check();
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

	private static boolean check() throws Exception {
		// TODO Auto-generated method stub
		int max = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int[] arr = new int[total];
		for (int i = 0; i < total; i++) {
			arr[i] = Reader.nextInt();
		}
		for (int i = 0; i < total; i++) {
			int m = arr[i];
			if (stack.isEmpty()) {
				for (int j = max + 1; j <= m; j++) {
					stack.push(j);
					max = j;
				}
				boolean validSize = checkSize(stack);
				if (!validSize)
					return false;
				stack.pop();

			} else {
				Integer n = stack.peek();
				if (n == m) {
					stack.pop();
				} else if (m < n) {
					return false;
				} else {

					for (int j = max + 1; j <= m; j++) {
						stack.push(j);
						max = j;
					}
					boolean validSize = checkSize(stack);
					if (!validSize)
						return false;
					stack.pop();

				}
			}
		}
		return true;
	}

	private static boolean checkSize(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		return stack.size() <= capacity;
	}

}
