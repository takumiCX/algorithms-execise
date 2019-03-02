package com.takumicx.pat.advance;

public class Main1048 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		int coinNum = Reader.nextInt();
		int pay = Reader.nextInt();

		int[] arr = new int[pay + 1];

		for (int i = 0; i < coinNum; i++) {
			int m = Reader.nextInt();
			if (m < pay) {
				arr[m] += -1;
			}
		}

		boolean flag = false;
		int start = 0;
		int end = 0;
		for (int i = 1; i <= (pay + 1) / 2; i++) {
			if (i * 2 == pay && arr[i] == -2) {
				start = i;
				end = i;
				flag = true;
				break;
			} else if (arr[i] == -1 && arr[pay - i] == -1&&i!=pay-i) {

				start=i;
				end=pay-i;
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println(start+" "+end);
		}else{
			System.out.println("No Solution");
		}

	}
}
