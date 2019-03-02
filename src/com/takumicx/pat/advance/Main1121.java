package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1121 {

	static int[] arr = new int[100000];
	
	static boolean[] apper=new boolean[100000];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int total = Reader.nextInt();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		for (int i = 0; i < total; i++) {

			int m = Reader.nextInt();
			int n = Reader.nextInt();
			arr[n] = m;
			arr[m] = n;

		}

		int checkNum = Reader.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < checkNum; i++) {
			int m = Reader.nextInt();
			apper[m]=true;
		}
		
		
		for(int i=0;i<apper.length;i++){
			if(apper[i]){
				if(arr[i]==-1){
					list.add(i);
				}else if(!apper[arr[i]]){
					list.add(i);
				}
			}
		}

		System.out.println(list.size());

		if (list.size() > 0) {

//			Collections.sort(list);

			System.out.format("%05d", list.get(0));

			for (int i = 1; i < list.size(); i++) {
				System.out.format(" %05d", list.get(i));
			}
		}

	}
}
