package com.takumicx.pat.advance;

public class Main1041 {

	static int[] arr = new int[10001];

	static boolean[] dupilic = new boolean[10001];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		int total = Reader.nextInt();

		int[] data = new int[total];

		for (int i = 0; i < total; i++) {

			int m = Reader.nextInt();
			data[i] = m;
			if (arr[m] != 0) {
				dupilic[m] = true;
			} else {
				arr[m] = m;
			}
		}
		boolean flag = false;
		int n = 0;
		for (int i = 0; i < total; i++) {
			int index=data[i];
			if(!dupilic[index]){
				flag=true;
				n=index;
				break;
			}
		}
		if(flag){
			System.out.println(n);
		}else{
			System.out.println("None");
		}
	}

}
