package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;

public class Main1096 {

	public static void main(String[] args) throws Exception {

		MyReader.init();

		int num = MyReader.nextInt();

		int factor = 2;
		List<Integer> list = new ArrayList<Integer>();
		
		while(num!=1){
			while (num % factor == 0) {
				list.add(factor);
				num = num / factor;
			}
			factor++;
		}
		
		for(Integer i:list){
			System.out.println(i);
		}

	}

}
