package com.takumicx.pat.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1009 {
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] split = reader.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=split.length-1;i>=0;i--){
			
			sb.append(split[i]).append(" ");
			
		}
		
		System.out.println(sb.toString().trim());
		
		
		
	}

}
