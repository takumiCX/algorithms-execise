package com.takumicx.pat.advance;


public class Main1049 {
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		int n = Reader.nextInt();
		
		int count=0;
		
		for(int i=1;i<=n;i++){
			String s = String.valueOf(i);
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='1'){
					count++;
				}
			}
			
		}
		
		System.out.println(count);
	}

}
