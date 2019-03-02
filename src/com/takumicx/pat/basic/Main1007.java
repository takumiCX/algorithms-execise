package com.takumicx.pat.basic;

import java.util.ArrayList;
import java.util.List;


public class Main1007 {
	
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int num = Reader.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=2;i<=num;i++){
			
			if(isPrime(i)){
				
				list.add(i);
			}
		}
		
		int count=0;
		
		if(list.size()>=2){
			
			for(int i=1;i<list.size();i++){
				
				if(list.get(i)-list.get(i-1)==2){
					count++;
				}
				
			}
			
		}
		
		System.out.println(count);
		
		
	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		for(int j=2;j<=Math.sqrt(i);j++){
			
			if(i%j==0) return false;
			
		}
		
		return true;
	}

}
