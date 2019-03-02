package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;


public class Main1059 {
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int num = Reader.nextInt();
		
		if(num==1){
			
			System.out.format("%d=1",num);
			
		}else{
			
			List<String> list = new ArrayList<String>();
			
			list.add(num+"=");
			
			int primeNum=findNextPrime(1);
			
			int sqrNum=(int) Math.sqrt(num*1.0);
			
			while(primeNum<=sqrNum){
				
				int count=0;
				
				while(num%primeNum==0){
					count++;
					num/=primeNum;
				}
				if(count>0){
					
					list.add(primeNum+"");

					if(count>1){
						
						list.add("^");
						
						list.add(count+"");
						
					}
					
					list.add("*");
				}
				
				primeNum=findNextPrime(primeNum);
				
				
			}
			
			if(num!=1){
				
				list.add(num+"");
				
			}
			
			if(list.get(list.size()-1).equals("*")){
				
				list.remove(list.size()-1);
				
			}
			
		    for(int i=0;i<list.size();i++){
		    	
		    	System.out.print(list.get(i));
		    }
			
		}
		
		
	}

	private static int findNextPrime(int i) {
		// TODO Auto-generated method stub
		for(int j=i+1;;j++){
			
			boolean isPrime=isPrime(j);
			
			if(isPrime){
				
				return j;
			}
			
		}
	}

	private static boolean isPrime(int j) {
		// TODO Auto-generated method stub
		if(j==1) return false;
		
		int sqrNum=(int) Math.sqrt(j*1.0);
		
		for(int i=2;i<=sqrNum;i++){
			
			if(j%i==0){
				return false;
			}
			
		}
		
		return true;
	}

}
