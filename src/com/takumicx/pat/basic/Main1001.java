package com.takumicx.pat.basic;


public class Main1001 {
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int num = Reader.nextInt();
		
		int count=0;
		while(num!=1){
			
			count++;
			
			if(num%2==0){
				
				num/=2;
			}else {
				
				num=(num*3+1)/2;
			}
			
		}
		
		System.out.println(count);
	}

}
